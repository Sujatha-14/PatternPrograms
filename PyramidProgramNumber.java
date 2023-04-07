package Pattern;

import java.util.Scanner;

public class PyramidProgramNumber {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the value");
		int size=src.nextInt();
		for(int i=1;i<=size;i++) {
			for(int j=size-i;j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(" "+k);
			}
			System.out.println(" ");
		}

	}

}
