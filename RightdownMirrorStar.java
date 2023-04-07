package Pattern;

import java.util.Scanner;

public class RightdownMirrorStar {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the value");
		int size=src.nextInt();
		for(int i=0;i<size;i++) {
			for(int k=0;k<=i;k++) {
				System.out.print("  ");
			}
			for(int j=size;j>i;j--) {
				System.out.print(" *");
			}
			System.out.println(" ");
		}
	}

}
