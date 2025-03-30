public class non_static_block{
    non_static_block(){
        System.out.println("Default Constructor");
    }
    {
        System.out.println("Hello");
    }
    public static void main(String a[]){
        System.out.println("Main Method");
        non_static_block ob = new non_static_block();
    }
    {
        System.out.println("HIII");
    }
}
