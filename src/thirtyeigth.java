import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class thirtyeigth {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c= sc.nextInt();

        String b="";
        String d="";
        while(a!=0){
             if(a%2==0){
                 b="0"+b;
             }else{
                 b="1"+b;
             }
             //System.out.print(b +" ");
             a/=2;
        }
        System.out.println(b);
        while(c!=0){
            if(c%2==0){
                d="0"+d;

            }else{
                d="1"+d;
            }
           // System.out.print(d +" ");

            c/=2;
        }
        System.out.println(d);

        char[] p= b.toCharArray();
        char[] q= d.toCharArray();
        //int[] r;


        }
    }

