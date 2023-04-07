package Pattern;
import java.util.Scanner;
public class MirroredRightTriangleStar {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the number you want");
		int size=src.nextInt();
		for(int i=0;i<size;i++) {
			for(int j=i;j<size-1;j++)
			{
				System.out.print("  ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}
