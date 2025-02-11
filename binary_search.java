import java.io.*; 
class binarysearch {
    
    void brsearch()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of the array : ");
        int size = Integer.parseInt(br.readLine());
        int x[] = new int[size];
        int mid;
    
        System.out.println("Enter the elements of the array : ");
        for(int i = 0; i < size; i++){
            x[i] = Integer.parseInt(br.readLine());
        }
        
        
        System.out.print("Enter the element to be searched in ascending order : ");
        int val = Integer.parseInt(br.readLine());

        if(size % 2 == 0){
            mid = ((size)/2)-1;
        }
        else{
            mid = ((size+1)/2)-1;
        }

        if(val < x[mid]){
            for(int i = 0; i < mid; i++){
                if(val == x[i]){
                    System.out.println("Element "+val+" found at position: "+(i+1));
                }
            }
        }

        else if(val > x[mid]){
            for(int i = mid; i < size; i++){
                if(val == x[i]){
                    System.out.println("Element "+val+" found at position: "+(i+1));
                }
            }
        }

        else if(val == x[mid]){
            System.out.println("Element "+val+" found at position: "+(mid+1));
        }

        else{
            System.out.println("Element not found");
        }
    }
}  

class binary_search{
    public static void main(String a[]){
        binarysearch ob = new binarysearch();
        try{
            ob.brsearch();
        }
        catch(IOException e){
            System.out.println("Error in Input");
        }
    }
}

