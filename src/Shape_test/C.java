package Shape_test;

public class C extends Basicclass implements B{
	public void f() {
		System.out.println("f()from C.");
	}
	@Override
	public void b() {
		System.out.println("b()from C.");
	}
	public void f1() {
		System.out.println("f1()from C.");
	}
	public static void main(String[] args) {
		C c1 = new C();
		c1.f();
		c1.b();
		c1.f1();
	}

}
