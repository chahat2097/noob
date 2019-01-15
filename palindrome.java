import java.util.*;
import java.util.Scanner;

public class palindrome {

    public static void main(String args[]) throws Exception{

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] cc = s.toCharArray();

        int a=0;

        int b = s.length() - 1;

        for(int i=0;i<s.length();i++){
            if(cc[i]!= cc[b-i]){
                a=1;
            }
        }
        if(a==1){
            System.out.println(s + " is not a palindrome");

        }else{
            System.out.println(s+" is a palindrome");
        }


    }




}


