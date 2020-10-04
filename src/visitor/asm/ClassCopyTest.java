package visitor.asm;

import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.ClassWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ClassCopyTest {
    public static void main(String[] args) throws IOException {
        ClassReader cr = new ClassReader(
                ClassCopyTest.class.getResourceAsStream("/visitor/asm/Person.class"));

        ClassWriter cw = new ClassWriter(0);
        cr.accept(cw,0);
        byte[] b1 = cw.toByteArray();
        String path =(String)System.getProperties().get("user.dir");
        File f = new File(path + "/src/visitor/asm/");
        f.mkdirs();
        FileOutputStream fos = new FileOutputStream(new File(path+"/src/visitor/asm/Person_copy.class"));
        fos.write(b1);
        fos.flush();
        fos.close();

    }
}
