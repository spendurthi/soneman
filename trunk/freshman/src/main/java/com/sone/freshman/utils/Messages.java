package com.sone.freshman.utils;

import java.util.ArrayList;

public class Messages extends ArrayList<String> {
	private String messageType;
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getMessageType() {
		return messageType;
	}
}
