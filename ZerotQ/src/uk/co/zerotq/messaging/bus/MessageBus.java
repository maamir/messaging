package uk.co.zerotq.messaging.bus;

/**
 * File: MessageBus.java
 * 
 * @author maamir
 *
 */
public interface MessageBus {

	public void addChannel(String name);
	
	public void publicChannelMessage(String name, Object message);
}
