import java.io.*;
class linearsearch{
    int n;
    void search() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of the array: ");
        n = Integer.parseInt(br.readLine());
       
        int array[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i =0; i < n; i++){
            array[i] = Integer.parseInt(br.readLine());
        }


        System.out.print("Enter the elemenmt to be searched: ");
        int val = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            if (val == array[i]){
                System.out.println("Element "+val+" found at position: "+(i+1));
                break;
            }
            else if(i == n-1){
                System.out.println("Element not found");
            }
        }
        
        br.close(); 
    }

}

class linear_search {
    public static void main(String[] args) {
        linearsearch ob = new linearsearch();
        try{
            ob.search();
        }
        catch(IOException e){
            System.out.println("Error in input");
        }
    }
}
