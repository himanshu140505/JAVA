/* 
UNDER DEVELOPMENT
*****
****
***
**
*
**
***
****
***** 
*/
import java.util.*;
class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i = 1; i <= n; i++){
                if(i <= (n/2)+1){
                    for(int j = 1; j > n; ){

                    }
                }
                if(i > (n/2)+1){
                    for(int j = 2; j <= i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        sc.close();
    }   
}
