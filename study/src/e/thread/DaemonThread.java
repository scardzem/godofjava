package e.thread;

public class DaemonThread extends Thread{
	public void run() {
		try {
			Thread.sleep(Long.MAX_VALUE);  //쓰레드가 끝나지 않게 큰 값으로 대기하도록 만듦. (데몬쓰레드 테스트용)
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
