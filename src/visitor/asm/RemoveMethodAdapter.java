package visitor.asm;

import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.MethodVisitor;

public class RemoveMethodAdapter extends ClassVisitor {
    private String mName;
    private String mDesc;
    public RemoveMethodAdapter(int api, ClassVisitor cv,String mName,String mDesc) {
        super(api, cv);
        this.mName =mName;
        this.mDesc =mDesc;
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        if(this.mName.equals(name)&&this.mDesc.equals(desc)){
            return null;
        }
        return super.visitMethod(access, name, desc, signature, exceptions);
    }
}
