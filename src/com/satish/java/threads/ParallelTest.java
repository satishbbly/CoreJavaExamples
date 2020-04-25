package com.satish.java.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ParallelTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executor = Executors.newCachedThreadPool();

		Future<String> s1 = executor.submit(new Task());
		Future<String> s2 = executor.submit(new Task());
		Future<String> s3 = executor.submit(new Task());
		Future<String> s4 = executor.submit(new Task());
		Future<String> s5 = executor.submit(new Task());

		String s1response = s1.get();
		String s2response = s2.get();
		String s3response = s3.get();
		String s4response = s4.get();
		String s5response = s5.get();

		System.err.println(s1response);
		System.err.println(s2response);
		System.err.println(s3response);
		System.err.println(s4response);
		System.err.println(s5response);
		System.out.println("Thead name: " + Thread.currentThread().getName());
	}

	static class Task implements Callable<String> {

		@Override
		public String call() throws Exception {
			System.out.println("Thead name: " + Thread.currentThread().getName());

			Thread.sleep(3000);
			return Thread.currentThread().getName();
		}

	}
}
