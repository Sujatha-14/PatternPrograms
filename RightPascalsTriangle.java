package Pattern;

import java.util.Scanner;

public class RightPascalsTriangle {

	public static void main(String[] args) {
	Scanner src=new Scanner(System.in);
	System.out.println("Enter the value");
	int size=src.nextInt();
	for(int i=0;i<size;i++) {
		for(int j=0;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println(" ");
	}
for(int i=0;i<size-1;i++) {
	for(int j=size-1;j>i;j--) {
		System.out.print("* ");
	}
	System.out.println(" ");
}
	}

}
