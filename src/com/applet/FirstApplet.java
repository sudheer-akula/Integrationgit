package com.applet;

import java.applet.Applet;  
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList; 

public class FirstApplet extends Applet implements ActionListener{
	
	TextField search;
	Button search_button;
	List list;
	
	public void init(){
		
		search = new TextField("Search Box");
		search_button = new Button("Search");
		search_button.addActionListener(this);
		list = new List(5);
		
		search.setBounds(10, 40, 120, 20);
		search_button.setBounds(60,80,120,20);
		list.add("World Ventures");
		list.add("CMS");
		list.add("DTApp");
		list.add("UC");
		
		
		add(search);
		add(search_button);
		add(list);
		

	}
	
	
	public void actionPerformed(ActionEvent e) {
		String s = search.getText();
		
		
		list.removeAll();
		list.add(s);
		
		
	}

 

}
