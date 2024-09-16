import java.util.*;

public class Q8 {

    public static String rev(String s) {
        String[] words = s.trim().split("\\s+"); 
        
        Collections.reverse(Arrays.asList(words));
        
        return String.join(" ", words); 
    }

    public static void main(String[] args) {
        String s = "  the   sky   is  blue  "; 
        String result = rev(s);
        System.out.println("Reversed: '" + result + "'"); 
    }
}
