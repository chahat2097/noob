import java.util.Scanner;

public class Primefactors {

    public static void primef(int p){
        while(p%2==0){
            System.out.print(2+ " ");
            p/=2;
        }

        for(int i=3;i<=Math.sqrt(p);i=i+2){
            while(p%i==0){
                System.out.print(i +" ");
                p/=i;
            }
        }

        if(p>2)
            System.out.print(p);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        primef(p);
    }

}
