import java.io.*; 

class binarysearch {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the size of the array : ");
    int size = Integer.parseInt(br.readLine());
    int x[] = new int[size];
    void getarray() throws IOException{
        System.out.println("Enter the elements of the array : ");
        for(int i = 0; i < size; i++){
            x[i] = Integer.parseInt(br.readLine());
        }
    }  
}


public class main{

}
