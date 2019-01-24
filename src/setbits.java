import java.util.Scanner;

public class setbits {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count=0;
        //int flag=0;
        while(a!=0){
            if(a%2==0){
                a/=2;
            }else{

               a/=2;
                count++;
            }
        }
        System.out.println(count);
    }
}
