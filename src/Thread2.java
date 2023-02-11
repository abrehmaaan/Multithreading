
public class Thread2 extends Thread {
	@Override
	public void run() {
		BusinessLogic.product(10);
		BusinessLogic.show();
	}
}
