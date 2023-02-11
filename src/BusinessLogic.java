
public class BusinessLogic {
	private static int a,b;
	public BusinessLogic(int a, int b) {
		BusinessLogic.a = a;
		BusinessLogic.b = b;
	}
	public synchronized static void increment() {
		a++;
		b++;
	}
	public synchronized static void product(int x) {
		a *= x;
		b *= x;
	}
	public static void show() {
		System.out.println("a = "+a+", b = "+b);
	}
}
