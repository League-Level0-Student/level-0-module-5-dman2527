package _02_nested_loops._3_for_loop_gauntlet;

public class loopgauntlet {
public static void main(String[] args) {
	for (int i = 0; i < 101; i++) {
		System.out.println(i);
	}
	for (int i = 100; i > -1; i--) {
		System.out.println(i);
	}
	for(int i = 2; i <= 100; i++) {
		if(i %2 == 0) {
			System.out.println(i);
			
		}
	}
	for(int i = 1; i <= 99; i++) {
		if(i %2 == 1) {
			System.out.println(i);
		}		
		}
	for(int i = 1; i <= 500; i++) {
		if(i %2 == 0) {
			System.out.println(i + "even");
		}
		if(i %2 == 1) {
			System.out.println(i + "odd");
		}
	}
	for(int i = 0; i <= 777; i++) {
		if(i %7 == 0) {
			System.out.println(i);
		}
	}
	for(int i = 2004; i <=2020; i++) {
		int age= i - 2004;
		System.out.println("In "+ i + " I was "+age+ " years old");
	}
	for (int i = 0; i < 3; i++) {
		for (int b = 0; b < 3; b++) {
			System.out.println(i + " " + b);
		}
	}
	for (int i = 1; i < 9; i += 3) {
		System.out.println();
		for (int b = i; b < i+3 ; b++) {
			System.out.print(b + " ");
		}
	}
	for (int i = 1; i < 101; i += 10) {
		System.out.println();
		for (int b = i; b < i+10 ; b++) {
			System.out.print(b + " ");
		}
	}
	for (int i = 1; i <= 6; i ++) {
		System.out.println();
		for (int b = 1; b < i + 1 ; b++) {
			System.out.print("*");
		}
	}
}
	
}

