package com.tech.concurrency.synchronize;

public class MessageSender {
	
	public void send(String msg) {
		
		System.out.println("Sending "+msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Thread interruped : "+Thread.currentThread().getName());
		}
		System.out.println("Message Sent By:"+Thread.currentThread().getName());
	}

}
