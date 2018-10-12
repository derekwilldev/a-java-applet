/*
	Programmer: Derek Will
	Date: 4/23/2017
	Filename:	Login.java
	Purpose: Using an Applet to Search an Array
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends Applet implements ActionListener
{
   //Declaring variables
   String id, password;
   boolean success;
   
   // Declare arrays
   String[] idArray = {"Derek", "Josh", "Meggan", "Andrew", "Travis", "Tyler", "Holland", "Adrienne"};
   String[] passwordArray = {"pass1", "pass2", "pass3", "pass4", "pass5", "pass6", "pass7", "pass8"};
   
   

   //Create components for applet
   Label headerLabel = new Label("Please type your ID and Password");

   Label idLabel = new Label("ID:              ");
      TextField idField = new TextField(8);

   Label passwordLabel = new Label("Password:");
      TextField passwordField = new TextField(8);


   Button loginButton = new Button("Login");
   
   
   

   public void init() {
      //Set color, layout, and add components
      setBackground(Color.orange);

      setLayout(new FlowLayout(FlowLayout.LEFT,50,30));

      add(headerLabel);

      add(idLabel);
         add(idField);
         idField.requestFocus();

      add(passwordLabel);
         add(passwordField);
 		 passwordField.setEchoChar('*');

      add(loginButton);
         loginButton.addActionListener(this);
   } // end init
   
   
   

   public void actionPerformed(ActionEvent e)
   {
      //Assigning data
      id = idField.getText();
      password = passwordField.getText();
      success = false;

      //Sequential search
      for (int i = 0; i < idArray.length; ++i){
		  if (id.equals(idArray[i]) && password.equals(passwordArray[i])){
			  success = true;
			  break; // stops search when match found
		  }
      }
      
      
      if (success == true) {
		  headerLabel.setText("Password accepted");
	  }
	  else {
		  headerLabel.setText("Password failed");
	  }
	  
	  
	  repaint();
   } // end actionPerformed
   
   


   public void repaint()
   {
	   idField.setText("");
	   passwordField.setText("");
	   idField.requestFocus();
   } // end repaint
   
   
}