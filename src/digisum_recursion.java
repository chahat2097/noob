import java.util.Scanner;

public class digisum_recursion {

    public static int digisum(int n){
        if(n/10==0){
            return n;
        }else{
            return n%10 + digisum(n/10);
        }
    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = digisum(n);
        System.out.println("Sum of digits in "+n+ "is "+result);

    }
}
