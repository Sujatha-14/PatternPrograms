package Practice;

import java.util.Scanner;

public class NamePrint {

	public static void main(String[] args) {
	Scanner src=new Scanner(System.in);
	System.out.println("Enter your name");
	String name=src.next();
for(int i=0;i<name.length();i++) {
	for(int j=0;j<name.length();j++){
		
		if(i==j||i+j==name.length()-1) {//name.charAt(i)==name.charAt(j)|j+i==(name.length()-1)
			System.out.print(name.charAt(i)+" ");
		}
		else
			System.out.print("  ");
		
	}
	System.out.println("");
}
	}

}
