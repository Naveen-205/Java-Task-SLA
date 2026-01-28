package task;

class ChildThreadExample extends Thread {

    public void run() {
    	
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Child thread interrupted");
            }
            
        }
    }
}

public class ChildThread {

    public static void main(String[] args) {

    	ChildThreadExample t = new ChildThreadExample();
        t.start(); 
    }
}

