package visitor.asm;

import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static jdk.internal.org.objectweb.asm.Opcodes.*;

public class ClassTransformTest02 {
    public static void main(String[] args) throws IOException, IllegalAccessException, InstantiationException {
        // TODO Auto-generated method stub

        ClassReader cr = new ClassReader(
                ClassTransformTest02.class.getResourceAsStream("/visitor/asm/Person02.class"));
        ClassWriter cw = new ClassWriter(0);
        AddProxyAdapter02 apa02 = new AddProxyAdapter02(ASM4,cw,"greets","()V");
        AddFieldAdapter afa = new AddFieldAdapter(ASM4,apa02,ACC_PUBLIC,"time","Ljava/lang/Long;");


        cr.accept(afa,0);
        byte[] b2 = cw.toByteArray();

        String path =(String)System.getProperties().get("user.dir");
        File f = new File(path + "/src/visitor/asm/");
        f.mkdirs();
        FileOutputStream fos = new FileOutputStream(new File(path+"/src/visitor/asm/Person02.class"));
        fos.write(b2);
        fos.flush();
        fos.close();
        //MyClassLoader cl = new MyClassLoader();
        //Class Person = cl.defineClass("visitor.asm.Person",b2);


    }
}
