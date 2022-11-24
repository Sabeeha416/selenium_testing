package internalfiles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
try {
	int s=sc.nextInt();
	System.out.println(s);
    }
catch (InputMismatchException ob) {
	System.out.println("invalid data"+ob);
}
	}

}
