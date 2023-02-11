
public class MainClass {
	public static void main(String[] args) {
		BusinessLogic b = new BusinessLogic(1,1);
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
