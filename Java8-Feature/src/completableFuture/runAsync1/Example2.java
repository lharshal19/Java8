package completableFuture.runAsync1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class Example2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		System.out.println(Thread.currentThread().getName());
		

		CompletableFuture<Void> future = CompletableFuture.runAsync(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().isDaemon());
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					throw new IllegalStateException(e);
				}
				System.out.println("separate thread than the main thread.");
			}
		});
		System.out.println(ForkJoinPool.getCommonPoolParallelism());
		System.out.println(ForkJoinPool.commonPool().getParallelism());
		future.get();

	}
}
