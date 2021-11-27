package threads.dependent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PrintNumberThenComplete {
	public static void main(String args[]) {
		PrintNumber printNumbers = new PrintNumber();

		Thread thread = new Thread(printNumbers);
		thread.start();
		while (thread.isAlive()) {

		}
		System.out.println("Process completed");

		ExecutorService threadPool = Executors.newSingleThreadExecutor();
		Future status = threadPool.submit(printNumbers);
		while (!status.isDone()) {

		}
		System.out.println("Process completed");

		// to use notify legacy call
		// ExecutorService framework Task, Future.isCompleted()

	}
}

class PrintNumber implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println(i);
		}

	}

}
