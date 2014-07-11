package com.sone.freshman.utils;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
public class MessageCenter implements MessageSourceAware {

	private MessageSource messageSource;
	
	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource  = messageSource;		
	}
	public String getMessage(String key, Object[] placeHolder){
		return this.messageSource.getMessage(key, placeHolder,Locale.ENGLISH);
	}

}
