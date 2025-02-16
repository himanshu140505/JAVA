import java.io.*;

class StringMatcher {
    private int count = 0;
    
    void getStringsAndMatch() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter the main string: ");
        String mainString = br.readLine();
        
        System.out.print("Enter the pattern to match: ");
        String pattern = br.readLine();
        
        for (int i = 0; i <= mainString.length() - pattern.length(); i++) {
            if (mainString.substring(i, i + pattern.length()).equals(pattern)) {
                count++;
            }
        }
        
        System.out.println("Pattern found " + count + " times.");
    }
}

public class string_handling {
    public static void main(String[] args) throws IOException {
        StringMatcher matcher = new StringMatcher();
        matcher.getStringsAndMatch();
    }
}
