import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class anagram {

    public static void main(String args[])throws Exception{
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String r = sc.next();
        int l = s.length();
        int m = r.length();

        char[] cc = s.toCharArray();
        char[] dd = r.toCharArray();

        if( l== m){
            Arrays.sort(cc);
            Arrays.sort(dd);

            s=String.valueOf(cc);
            r=String.valueOf(dd);
            if(s.equals(r)){
                System.out.println("Yes the string is anagram");
                return;
            }

        }
        System.out.println("No the string is not anagram");

    }
}
