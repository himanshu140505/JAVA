/*
write a java code to input your name through command line interface reverse it and display the output design a seperate class reverse to reverse your name and displaying your result
*/

import java.util.Scanner;
class sc_input{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = sc.nextLine();
		String revname="";
		for(int i = name.length()-1; i >= 0; i--){
			 char c = name.charAt(i);
			 revname = revname+c;
		}
		System.out.println("Reversed name string is : "+revname);
		sc.close();
	}
}