package by.efes.helper;

public class Help implements Runnable {
	
	private int b;
	private boolean cancel = false;
	
	void cancel() {
		cancel = true;
	}
	
	public void run() {
		while (!cancel) {
			b++;
		}
		System.out.println(b);
	}
	public static void main(String[] args) throws InterruptedException{
	Help help = new Help();
	Thread th1 = new Thread(help);
	th1.start();
	Thread.sleep(10);
	help.cancel();
	}
}

