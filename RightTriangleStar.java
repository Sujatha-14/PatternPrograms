package Pattern;

import java.util.Scanner;

public class RightTriangleStar {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter number you want");
		int size=src.nextInt();
		for(int i=0;i<size;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}

	}

}
