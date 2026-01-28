package task;

public class ThreadPause {

	public static void main(String[] args) {
		
		System.out.println("Program Started");
		
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			System.out.println("Thread Interrupted");
		}
		
		System.out.println("Program Resumed After 3 Seconds");

	}

}
