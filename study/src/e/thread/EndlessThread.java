package e.thread;

public class EndlessThread extends Thread {
	public void run() {
		while(true) {
			try {
				System.out.println(System.currentTimeMillis());
				Thread.sleep(1000);
			} catch (InterruptedException e) {  //sleep()메소드를 사용할 때는 InterruptedException으로 catch 해 줘야 된다. 기억 안 나면 Exception같은 상위에 있는 예외 사용.
				e.printStackTrace();
			}
		}
	}
}
