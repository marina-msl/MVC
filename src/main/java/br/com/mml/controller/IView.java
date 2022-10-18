package br.com.mml.controller;

import java.awt.event.ActionListener;

public interface IView {
	
	void setTextName(String name);
	String getTextName();
	void setTextAddress(String address);
	String getTextAddress();
	void setTextAge(String age);
	String getTextAge();
	void setListener(ActionListener actionListener);
	void setMessage(String message);

}
