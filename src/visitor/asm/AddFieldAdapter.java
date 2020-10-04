package visitor.asm;

import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.FieldVisitor;

public class AddFieldAdapter extends ClassVisitor {
    private int fAcc;
    private String fName;
    private String fDesc;
    private boolean isFieldPresent;
    public AddFieldAdapter(int api, ClassVisitor cv, int fAcc, String fName,
                           String fDesc) {
        super(api, cv);
        this.fAcc= fAcc;
        this.fName = fName;
        this.fDesc  = fDesc;
        isFieldPresent = false;
    }
    @Override
    public FieldVisitor visitField(int access, String name, String desc, String signature, Object value){
        if(this.fName.equals(name)) {
            isFieldPresent = true;
        }
        return cv.visitField(access,name,desc,signature,value); //cv就是super
    }
    @Override
    public void visitEnd(){
        if(!isFieldPresent){
            FieldVisitor fv = cv.visitField(fAcc,fName,fDesc,null,0);
            if(fv!=null){
                fv.visitEnd();
            }
        }
        cv.visitEnd();
    }
}
