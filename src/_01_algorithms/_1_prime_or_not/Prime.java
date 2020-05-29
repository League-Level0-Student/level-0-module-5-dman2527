package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Prime {
	public static void main(String[] args) {
		String number= JOptionPane.showInputDialog("Say a number");
		int number1=Integer.parseInt(number);
		boolean name2=false;
		for(int i=2; i<number1; i++ ) {
			if(number1 % i == 0) {
			 name2=true;
			}
		}
			if (name2 ==false) {
			JOptionPane.showMessageDialog(null, "Your number is prime!");
			
			}
			else {
				JOptionPane.showMessageDialog(null, "Your number is not prime");
			}
		}
	}


