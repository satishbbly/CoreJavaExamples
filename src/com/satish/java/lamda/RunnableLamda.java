package com.satish.java.lamda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableLamda {

	public static void main(String[] args) {
		Runnable run=()-> System.out.println(50);
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		for(int i=0 ; i<10000 ; i++)
		service.execute(run);
	}

}
