package view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.IView;

public class InsertFrame extends JFrame implements IView {
	
	private JTextField tfName = new JTextField();
	private JTextField tfAdress = new JTextField();
	private JTextField tfAge = new JTextField();
	private JLabel lblName = new JLabel("Name:");
	private JLabel lblAdress = new JLabel("Adress:");
	private JLabel lblAge = new JLabel("Age:");
	private JButton btInsert = new JButton("Insert");
	private JLabel result = new JLabel();
	
	public InsertFrame() {
		initializeComponents();
		buildLayout();
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	private void initializeComponents() {
		tfName.setPreferredSize(new Dimension(100,20));
		tfAdress.setPreferredSize(new Dimension(100,20));
		tfAge.setPreferredSize(new Dimension(100,20));
		
	
	}
	
	private void buildLayout() {
		this.setSize(400,250);
		this.setLayout(new GridLayout(4,2));
		this.add(lblName);
		this.add(tfName);
		this.add(lblAdress);
		this.add(tfAdress);
		this.add(lblAge);
		this.add(tfAge);
		this.add(btInsert);
		this.add(result);
		
	}
	

	@Override
	public void setTextName(String name) {
		tfName.setText(name);
		
	}

	@Override
	public String getTextName() {
		// TODO Auto-generated method stub
		return tfName.getText();
	}

	@Override
	public void setTextAddress(String address) {
		tfAdress.setText(address);
		
	}

	@Override
	public String getTextAddress() {
		// TODO Auto-generated method stub
		return tfAdress.getText();
	}

	@Override
	public void setTextAge(String age) {
		tfAge.setText(age);
		
	}

	@Override
	public String getTextAge() {
		// TODO Auto-generated method stub
		return tfAge.getText();
	}

	@Override
	public void setListener(ActionListener actionListener) {
		btInsert.addActionListener(actionListener);
		
	}

	@Override
	public void setMessage(String message) {
		result.setText(message);
		
	}

	
		
	
}
