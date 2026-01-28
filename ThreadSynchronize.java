package task;

class Display
{
	synchronized void show() {
		try {
			System.out.println(Thread.currentThread().getName() + " waiting ");
     		wait();
		    System.out.println(Thread.currentThread().getName() + " waiting ");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

public class ThreadSynchronize {

	public static void main(String[] args) {
		Display obj = new Display();
		Thread t1 = new Thread(()->obj.show(), " Thread-1");
		Thread t2 = new Thread(()->obj.show(), " Thread-2");
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(4000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		synchronized(obj) {
			System.out.println("Main thread calling notifyAll()");
			obj.notify();
			obj.notifyAll();
		}
		

	}

}

