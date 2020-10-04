package visitor.asm;

import java.io.IOException;

import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.FieldVisitor;
import jdk.internal.org.objectweb.asm.MethodVisitor;
import static jdk.internal.org.objectweb.asm.Opcodes.ASM4;

public class ClassPrinter extends ClassVisitor{

	public ClassPrinter() {
		super(ASM4);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void visit(int version, int access, String name, String signature,String superName,String[] interfaces) {
		System.out.println(name+" extends " + superName +"{");
	}
	@Override
	public FieldVisitor visitField(int access, String name, String descriptor,String signature,Object value) {
		System.out.println("  "+name);
		return null;
	}
	@Override
	public MethodVisitor visitMethod(int access, String name, String descriptor,String signature,String[] exceptions) {
		System.out.println("  "+name+"()");
		return null;
	}
	@Override
	public void visitEnd() {
		System.out.println("}");
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        ClassPrinter cp = new ClassPrinter();
        ClassReader cr = new ClassReader("java.lang.Runnable");
        cr.accept(cp,0);
	}

}
