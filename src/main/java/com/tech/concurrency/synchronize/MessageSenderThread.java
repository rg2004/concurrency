package com.tech.concurrency.synchronize;

public class MessageSenderThread extends Thread {

	String message;
	MessageSender sender;

	public MessageSenderThread(String message, MessageSender s) {
		this.message = message;
		this.sender = s;

	}

	public void run() {
		synchronized (sender) {
			sender.send(message);
		}
	}
}
