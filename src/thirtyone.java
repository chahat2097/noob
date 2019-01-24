import java.util.Scanner;

public class thirtyone {

    public static void main(String args[]){

        System.out.println("Enter the number");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int flag=0;

        while(num!=0){
            if((num%10)>1){
                flag=1;
                break;
            }else{
                num=num/10;
            }

        }if(flag==1){
            System.out.println("number is  not binary");
        }else{
            System.out.println("number is binary");
        }

    }
}
