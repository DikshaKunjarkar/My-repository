package Control;

import java.util.Scanner;

public class IFElseIf {

	public static void main(String[] args) {
		int a,b,c;
		int max=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of a");
		a=in.nextInt();
		System.out.println("Enter the value of b");
		b=in.nextInt();
		System.out.println("Enter the value of c");
		c=in.nextInt();
		if(a>b) {
			if(a>c)
				max=a;
				
			else
				max=c;
		}
		else {
			if(b>c)
				max=b;
			else
				max=c;
			
			}
		System.out.println("\n max value= " +max);
		
	}

}
