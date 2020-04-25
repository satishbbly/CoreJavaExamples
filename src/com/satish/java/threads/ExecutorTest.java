package com.satish.java.threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch=new CountDownLatch(100);
		System.out.println(Runtime.getRuntime().availableProcessors());
		ExecutorService executor=Executors.newFixedThreadPool(10);
	
		for(int i=0;i<100;i++)
		{
			executor.execute(new Task(latch));
		}
		
		
		
			latch.await();
		
		System.out.println("Thead name: "+Thread.currentThread().getName());
	}
	
	static class Task implements Runnable{
		private CountDownLatch latch;
		public Task(CountDownLatch latch) {
			super();
			this.latch = latch;
		}
		@Override
		public void run() {
			latch.countDown();
			
			System.out.println("Thead name: "+Thread.currentThread().getName()+"  "+latch.getCount());
	
			
		}
		
	}

}
