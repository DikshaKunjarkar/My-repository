package Control;

import java.util.Scanner;

public class Decision {

	public static void main(String[] args) {
		int marks;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any number");
		marks=in.nextInt();
		
		
			if(marks>=60)
				System.out.println("pass");
			else
				System.out.println("fail");

	}

}
