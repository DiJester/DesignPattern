package visitor.asm;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//��ASM���ɶ�̬����

import jdk.internal.org.objectweb.asm.*;

import static jdk.internal.org.objectweb.asm.Opcodes.*;

public class ClassTransformTest {

	public static void main(String[] args) throws IOException, IllegalAccessException, InstantiationException {
		// TODO Auto-generated method stub

		ClassReader cr = new ClassReader(
				ClassTransformTest.class.getResourceAsStream("/visitor/asm/Person.class"));
		ClassWriter cw = new ClassWriter(0);
		AddProxyAdapter apa = new AddProxyAdapter(ASM4,cw,"visitor/asm/TimeProxy","before","()V",
				"after","()V","greets","()V");
		AddFieldAdapter afa = new AddFieldAdapter(ASM4,apa,ACC_PUBLIC,"name","Ljava/lang/String;");
		RemoveMethodAdapter rma = new RemoveMethodAdapter(ASM4,afa,"main","([Ljava/lang/String;)V");
		cr.accept(afa,0);
		byte[] b2 = cw.toByteArray();
		
		String path =(String)System.getProperties().get("user.dir");
		File f = new File(path + "/src/visitor/asm/");
		f.mkdirs();
		FileOutputStream fos = new FileOutputStream(new File(path+"/src/visitor/asm/Person.class"));
		fos.write(b2);
		fos.flush();
		fos.close();
		//MyClassLoader cl = new MyClassLoader();
		//Class Person = cl.defineClass("visitor.asm.Person",b2);


	}

}
