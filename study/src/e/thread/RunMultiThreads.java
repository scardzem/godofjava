package e.thread;

public class RunMultiThreads {

	//쓰레드를 start()한 메소드에서는 순차적으로 시작과 종료가 진행되지 않는다. (667)
	public static void main(String[] args) {
		RunMultiThreads sample = new RunMultiThreads();
		sample.runMultiThread();
	}
	public void runMultiThread() {
		RunnableSample [] runnable = new RunnableSample[5];
		ThreadSample [] thread = new ThreadSample[5];
		for(int i=0;i<5;i++) {
			runnable[i] = new RunnableSample();
			thread[i] = new ThreadSample();
			
			new Thread(runnable[i]).start();
			thread[i].start();
		}
		System.out.println("RunMultiThreads.runMultiThread() method is ended.");
	}

}
