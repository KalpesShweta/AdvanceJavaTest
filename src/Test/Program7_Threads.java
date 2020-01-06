package Test;

class MyClass implements Runnable {
	public void run() {
		System.out.println("Task started by thread :" +this.toString());
		System.out.println("Task completed by thread :" +this.toString());
	}
}

public class Program7_Threads extends Thread {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyClass());
		t1.start();
		
		try {
		t1.join();
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		Thread t2 = new Thread(new MyClass());
		t2.start();
		try {
		t2.join();
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		Thread t3 = new Thread(new MyClass());
		t3.start();

	}
}