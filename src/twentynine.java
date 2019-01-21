import java.util.Scanner;

public class twentynine {

    public static void main(String args[]) {

        int i,j;
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        //int m = N/2;

        for(i=2;i<=N;i++){

            int flag=0;
            for(j=2;j<i;j++){
                if(i%j==0){

                    flag=1;
                    break;}

            }
            if(flag==0){
                System.out.print(i+" ");
            }


        }
    }
}

