package e.thread;

public class RunThreads {

	public static void main(String[] args) {
		RunThreads sample = new RunThreads();
		sample.runBasic();
	}
	//Runnable과 Thread의 객체로 실행하는 방식이 다르다.(664)
	public void runBasic() {
		RunnableSample runnable = new RunnableSample();
		new Thread(runnable).start();  //start()를 하면 해당 클래스에 구현한 run()메소드가 실행된다.
		
		ThreadSample thread = new ThreadSample();
		thread.start();  //start()를 하면 해당 클래스에 구현한 run()메소드가 실행된다.
		System.out.println("RunThreads.runBasic() method is ended.");
	}

}
