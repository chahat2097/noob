import java.util.Scanner;

public class armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int rem=0,n=0;
        double result=0;

        int b=a;
        while(b!=0){
            b/=10;
            ++n;
        }

         b=a;
        while(b!=0) {
            rem = b % 10;
            result = result+Math.pow(rem,n);
            b/=10;
        }if(result==a){
            System.out.println(a+ " is a armstrong no");

        }else{
            System.out.println(a+ " is not a armstrong no");
        }
    }
}
