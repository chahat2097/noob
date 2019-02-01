import java.util.HashSet;
import java.util.Scanner;

public class Arraythree {
    public static void main(String args[]){
        HashSet hset = new HashSet();
        int ar[] = new int[100];
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        boolean flag;
        for(int i=0;i<ar.length;i++){
            ar[i]=v;}
            for(int j=0;j<ar.length;j++){
            flag=hset.add(ar[j]);
            if(!flag){
                System.out.println(ar[j]);
            }
        }
    }
}
