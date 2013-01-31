import javaxswing.JOptionPane;	//Needed for JOptionPane class

/**
 * This program demonstrates using dialog boxes
 * 
 * @author Ryan Hickman
 *
 */

public class OptionPane 
{
	public static void main (String [] args)
	{
		String firstName; 	// The user's first name
		String middleName;	// The user's middle name
		String lastName;	// The user's last name
		
		// Get the user's first name
		firstName =
				javax.swing.JOptionPane.showInputDialog("What is your first name? ");
		
		// Get the user's middle name
		middleName =
				javax.swing.JOptionPane.showInputDialog("What is your middle name? ");
		
		// Get the user's last name
		lastName = 
				javax.swing.JOptionPane.showInputDialog("What is your last name? ");
		
		//Display a greeting
		javax.swing.JOptionPane.showMessageDialog(null, "Hello " + firstName + "" + middleName + "" + lastName);
		
		// Makes the thread stop
		System.exit(0);
	}

}
