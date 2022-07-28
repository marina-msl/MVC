package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import domain.Person;

public class Controller {
	
	private IView view;
	private Person person;
	
	public Controller(IView view) {
		this.view = view;
		this.view.setListener(new Insert());
		
	}
	
	class Insert implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String textName = view.getTextName();
			String textAddress = view.getTextAddress();
			String textAge = view.getTextAge();
			
			person = new Person(textName, textAddress, Integer.parseInt(textAge));
			
			view.setMessage(person.toString());
			
		}
		
	}
	

}
