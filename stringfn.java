public class stringfn {
    public static void main(String a[]){
        String s1 = "Java";
        String s2 = " C++";
        String s3 = "hello world";
        String s4 = "I AM DEVIL";
        String s5 = "   Devil is Here   ";
        String s6 = "I love coding and hacking. Its fun";
        
        System.out.println("CONCAT :");
        System.out.println(s5.concat(s6));

        System.out.println("\nCOMPARE TO :");
        System.out.println(s1.compareTo(s2));

        System.out.println("\nSTARTS WITH :");
        System.out.println(s6.startsWith("I"));

        System.out.println("\nENDS WITH :");
        System.out.println(s6.endsWith("fun"));

        System.out.println("\nTO LOWER CASE :");
        System.out.println(s3.toLowerCase());

        System.out.println("\nTO UPPER CASE :");
        System.out.println(s4.toUpperCase());

        System.out.println("\nTRIM :");
        System.out.println(s5.trim());

        System.out.println("\nSPLIT :");
        String splt[] = s6.split(" ");
        for (int i = 0; i <splt.length; i++)
            System.out.println(splt[i]);
    }
    
}
