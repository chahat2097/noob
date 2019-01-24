import java.util.Scanner;

public class twentysix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=0;

        while(a!=1) {
             if(a%2==0)a/=2;
             else {
                 b=1;break;
             }
        }
        if(b==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
