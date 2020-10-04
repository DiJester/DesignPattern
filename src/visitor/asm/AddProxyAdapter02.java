package visitor.asm;

import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;

import static jdk.internal.org.objectweb.asm.Opcodes.*;

public class AddProxyAdapter02 extends ClassVisitor {
    private String target;
    private String tDesc;
    private String owner;
    private boolean isInterface;
    public AddProxyAdapter02(int api, ClassVisitor cv,String target,String tDesc) {
        super(api, cv);
        this.target = target;
        this.tDesc = tDesc;
    }
    @Override
    public void visit(int version, int access, String name, String signature,String superName,String[] interfaces){
        cv.visit(version,access,name,signature,superName,interfaces);
        owner = name;
        isInterface = (access& ACC_INTERFACE)!=0;
    }
    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        MethodVisitor mv = super.visitMethod(access, name, desc, signature, exceptions);
        if(this.target.equals(name)&&this.tDesc.equals(desc))
            mv = new AddProxyAdapter02.ProxyMethodAdapter02(ASM4,mv);
        return mv;
    }
    class ProxyMethodAdapter02 extends MethodVisitor{

        public ProxyMethodAdapter02(int api, MethodVisitor mv) {
            super(api, mv);
        }
        @Override
        public void visitCode() {
            super.visitCode();
            visitVarInsn(ALOAD,0);
            visitMethodInsn(INVOKESTATIC,"java/lang/System","currentTimeMillis","()J",false);
            visitFieldInsn(PUTFIELD,owner,"time","J");
        }
        @Override
        public void visitInsn(int opcode) {
            if (opcode >= IRETURN && opcode <= RETURN || opcode == ATHROW) {
                visitVarInsn(ALOAD,0);
                visitMethodInsn(INVOKESTATIC,"java/lang/System","currentTimeMillis","()J",false);
                visitVarInsn(ALOAD,0);
                visitFieldInsn(GETFIELD,owner,"time","J");
                visitInsn(LSUB);
                visitFieldInsn(PUTFIELD,owner,"time","J");
                visitFieldInsn(GETSTATIC,"java/lang/System","out","Ljava/io/PrintStream;");
                visitTypeInsn(NEW,"java/lang/StringBuilder");
                visitInsn(DUP);
                visitMethodInsn(INVOKESPECIAL,"java/lang/StringBuilder","<init>","()V",false);
                visitVarInsn(ALOAD,0);
                visitFieldInsn(GETFIELD,owner,"time","J");
                visitMethodInsn(INVOKEVIRTUAL,"java/lang/StringBuilder","append","(J)Ljava/lang/StringBuilder;",false);
                visitLdcInsn("ms elapsed...");
                visitMethodInsn(INVOKEVIRTUAL,"java/lang/StringBuilder","append","(Ljava/lang/String;)Ljava/lang/StringBuilder;",false);
                visitMethodInsn(INVOKEVIRTUAL,"java/lang/StringBuilder","toString","()Ljava/lang/String;",false);
                visitMethodInsn(INVOKEVIRTUAL,"java/io/PrintStream","println","(Ljava/lang/String;)V",false);
            }
            super.visitInsn(opcode);
        }
        @Override
        public void visitMaxs(int maxStack,int maxLocals){
            super.visitMaxs(maxStack+3,maxLocals);

        }
    }
}
