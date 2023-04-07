package Pattern;

import java.util.Scanner;

public class Xpatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the number you want");
		int size=src.nextInt();
		for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
			if(j==i|j+i==size-1)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println(" ");
		}
		
	}

}
