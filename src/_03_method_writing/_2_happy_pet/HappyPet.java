package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	static int happiness = 0;
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		String pet = JOptionPane.showInputDialog("What pet would you like to buy?");
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			for (int i = 0; i < 6; i++) {
				
			
			int task = JOptionPane.showOptionDialog(null, "What would you like to do to make your pet happy?", pet, 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Food", "Water" }, null);
			if(task == 0) {
				cuddle();
			}
			if(task == 1) {
				food();
			}
			if(task == 2) {
				water();
			}
			if(happiness == 3) {
				JOptionPane.showMessageDialog(null, "You love your pet");
				System.exit(0);
			}
			}
			// 5. Use user input to call the appropriate method created in step 4.
			
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}
	public static void cuddle() {
		JOptionPane.showMessageDialog(null, "You cuddled with your pet!");
		happiness = happiness + 1;
	}
	public static void food() {
		JOptionPane.showMessageDialog(null, "You fed your pet!");
		happiness = happiness + 1;
	}
	public static void water() {
		JOptionPane.showMessageDialog(null, "You watered your pet!");
		happiness = happiness + 1;
	}
	
	
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}