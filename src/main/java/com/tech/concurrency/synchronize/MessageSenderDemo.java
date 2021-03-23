package com.tech.concurrency.synchronize;

public class MessageSenderDemo {

	public static void main(String[] args) {
		MessageSender snd = new MessageSender(); 
		MessageSenderThread S1 = 
            new MessageSenderThread( " Hi " , snd ); 
		MessageSenderThread S2 = 
            new MessageSenderThread( " Bye " , snd ); 
  
        // Start two threads of MessageSenderThread type 
        S1.start(); 
        S2.start(); 

     /*  try {
		 S1.join();
		 S2.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}*/
      
        
	}

}
