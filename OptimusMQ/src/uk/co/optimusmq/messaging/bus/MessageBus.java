package uk.co.optimusmq.messaging.bus;

/**
 * File: MessageBus.java
 * 
 * @author maamir
 *
 */
public interface MessageBus {
	
	public void initBroker();

	public void addChannel(String name);
	
	public void publishChannelMessage(String name, Object message);
}
