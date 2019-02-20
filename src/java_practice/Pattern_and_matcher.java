
package java_practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_and_matcher {
    public static void main(String[] args) {
        String email="abdu llah jubayer38@                              gmail.com";
        Pattern pattern=Pattern.compile(" ");
        Matcher matcher=pattern.matcher(email);
        int i=0;
        while (matcher.find()) {            
            i=i+1;
        }
        System.out.println(i);
    }
   
}
