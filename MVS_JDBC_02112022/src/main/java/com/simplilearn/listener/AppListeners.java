package com.simplilearn.listener;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class AppListeners {
	
	@EventListener
	public void serverStarted(ContextStartedEvent event) {
		System.out.println("Context started event occured");
	}
	
	@EventListener
	public void serverStarted1(ContextStartedEvent event) {
		System.out.println("Context started event occured");
	}
	
	@EventListener
	public void serverStarted2(ContextStartedEvent event) {
		System.out.println("Context started event occured");
	}
	
	@EventListener
	public void serverStopped(ContextStoppedEvent event) {
		System.out.println("Context stopped event occured");
	}

}
