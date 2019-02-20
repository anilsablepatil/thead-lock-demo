package org.javahotfix.threading.config;

import org.springframework.stereotype.Service;

@Service
public class SomeServiceBean {

	private Object commonLock = new Object();

	public long performOperationA() throws InterruptedException {
		long startTime = System.currentTimeMillis();
		System.out.println("Performing operation A Started. . . . .");
		synchronized (commonLock) {
			Thread.currentThread().sleep(1000*2);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Operation Complete A. Time taken : " + (endTime - startTime)/1000 + " s");
		return (endTime - startTime)/1000;
	}
	
	public long performOperationB() throws InterruptedException {
		long startTime = System.currentTimeMillis();
		System.out.println("Performing operation B Started. . . . .");
		synchronized (commonLock) {
			Thread.currentThread().sleep(1000*2);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Operation Complete B. Time taken : " + (endTime - startTime)/1000 + " s");
		return (endTime - startTime)/1000;
	}
	
	public long performOperationC() throws InterruptedException {
		long startTime = System.currentTimeMillis();
		System.out.println("Performing operation C Started. . . . .");
		synchronized (commonLock) {
			Thread.currentThread().sleep(1000*2);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Operation Complete C. Time taken : " + (endTime - startTime)/1000 + " s");
		return (endTime - startTime)/1000;
	}
	
	public long performOperationD() throws InterruptedException {
		long startTime = System.currentTimeMillis();
		System.out.println("Performing operation D Started. . . . .");
		synchronized (commonLock) {
			Thread.currentThread().sleep(1000*2);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Operation Complete E. Time taken : " + (endTime - startTime)/1000 + " s");
		return (endTime - startTime)/1000;
	}
}
