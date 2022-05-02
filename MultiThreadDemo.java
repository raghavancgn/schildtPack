package schildtPack;
//Create a second thread
class NewThread1 implements Runnable {
	String name; // name of the thread
	Thread t;
	NewThread1(String threadname) {
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start();
	}
	//This is the entry point for the second thread
	public void run() {
		try {
			for (int i=5; i>0; i--)
			{
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println(name + "Interrupted..");
		}
		System.out.println(name + " exiting. ");
	}
}
public class MultiThreadDemo {
	public static void main(String[] args) {
		new NewThread1("One"); //start threads
		new NewThread1("Two");
		new NewThread1("Three");
		try {
			
			
			//wait for other threads to end
			Thread.sleep(10000);
			}catch(InterruptedException e) {
			System.out.println("Main thread interrupted....");
		}
		System.out.println("Main thread exiting..");
	}
}
