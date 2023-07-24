package e.thread;

public class RunDaemonThread {

	public static void main(String[] args) {
		RunDaemonThread sample = new RunDaemonThread();
		sample.runDaemonThread();
	}
	
	public void runDaemonThread() {
		DaemonThread daemon = new DaemonThread();
		daemon.setDaemon(true);  //데몬쓰레드로 지정하고 시작하면 쓰레드가 종료된다. 이 줄을 주석처리하고 실행해보면 쓰레드는 계속 대기한다.
		daemon.start();
	}

}
