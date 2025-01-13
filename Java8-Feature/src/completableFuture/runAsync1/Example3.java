package completableFuture.runAsync1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example3 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		System.out.println(Thread.currentThread().getName());

		Runnable runnable = () -> {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("I am runnable");
		};

		CompletableFuture<Void> future = CompletableFuture.runAsync(runnable);
		
		future.get();

	}
}
