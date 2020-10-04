package visitor.asm;

import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.MethodVisitor;

import static jdk.internal.org.objectweb.asm.Opcodes.*;
import static jdk.internal.org.objectweb.asm.Opcodes.ATHROW;

public class AddProxyAdapter extends ClassVisitor {
    private String pHolder;
    private String before;
    private String bDesc;
    private String after;
    private String aDesc;
    private String target;
    private String tDesc;
    public AddProxyAdapter(int api, ClassVisitor cv,String pHolder,String before,
                           String bDesc,String after,String aDesc,String target,String tDesc) {
        super(api, cv);
        this.pHolder = pHolder;
        this.before = before;
        this.bDesc  = bDesc;
        this.after = after;
        this.aDesc = aDesc;
        this.target = target;
        this.tDesc = tDesc;
    }
    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        MethodVisitor mv = super.visitMethod(access, name, desc, signature, exceptions);
        if(this.target.equals(name)&&this.tDesc.equals(desc))
            mv = new ProxyMethodAdapter(ASM4,mv);
        return mv;
    }
    class ProxyMethodAdapter extends MethodVisitor{
        public ProxyMethodAdapter(int api, MethodVisitor mv) {
            super(api, mv);
        }
        @Override
        public void visitCode() {
            super.visitCode();
            visitMethodInsn(INVOKESTATIC,pHolder,before,bDesc,false);
        }

        @Override
        public void visitInsn(int opcode) {
            if (opcode >= IRETURN && opcode <= RETURN || opcode == ATHROW)
                 visitMethodInsn(INVOKESTATIC, pHolder, after, aDesc, false);
            super.visitInsn(opcode);
        }

    }

}
