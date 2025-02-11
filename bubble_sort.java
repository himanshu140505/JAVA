import java.io.*;
class a{
	void lr_sort()throws IOException{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of thea array : ");
		int size = Integer.parseInt(br.readLine());
		int array[] = new int[size];
		System.out.println("Enter the elements of the array : ");
		for(int i = 0; i < size; i++){
			array[i] = Integer.parseInt(br.readLine());
		}
		int c;
		for(int i = 0; i < size; i++){
			if(array[i]>array[i+1]){
				c = array[i];
				array[i] = array[i+1];
				array[i+1] = c;
			}
		}
		System.out.println("The sorted array is : ");
		for(int i = 0; i < size; i++){
			System.out.print(array[i]+" ");
		}
		br.close();
	}
}

class bubble_sort{
	public static void main(String[] args) {
		a ob = new a();
		try{
			ob.	lr_sort();
		}
		catch(IOException e){
			System.out.println("Error in input.....");
		}
	}
}
			