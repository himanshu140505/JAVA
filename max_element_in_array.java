/*

1.write a java code to enter 5 elements through command line interface design a sepearte class named number with max_element() and search() to find the maximum element from the array and search an element into an array

*/
import java.util.Scanner;
class max{
	void maxi(int[] ara){
		int a=ara[0];
		for(int i =1; i < 5; i++){
			if(ara[i]>a){
				a = ara[i];
			}
		}
		System.out.println("THE MAX ELEMENT IN THE ARRAY ENTERED BY YOU IS : "+a);
	}
	
	void search(int[] ara, int b){
		for(int i = 0; i < 5; i++){
			if (ara[i] == b){
				System.out.println("Element found in array at index  "+(i+1));
				break;
			}
	}
}
}
class max_element_in_array{
	public static void main(String [] a){
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[5];
		System.out.println("Enter the elemets of the array (only 5)");
		for(int i =0; i < 5; i++){
			ar[i] = sc.nextInt();
			 
		}
		/*for(int j = 0; j < 5; j++){
			System.out.println(ar[j]+"  ");
		*/
		System.out.println("Enter the number to search : ");
		int num = sc.nextInt();
		max ob = new max();
		ob.maxi(ar);
		ob.search(ar,num);
		sc.close();
		}
		
	}
	
