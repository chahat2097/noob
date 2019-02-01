import java.util.Scanner;

public class Stringpermutationrec {

    public static void swap(char[] c,int i,int j){

        char temp = c[i];
        c[i]=c[j];
        c[j]=temp;
    }

    private static void perm(char[] c ,int k){

        if(k==c.length-1){
            System.out.println(String.valueOf(c));
        }
        for(int i=k;i<c.length;i++){
            swap(c,k,i);
            perm(c,k+1);
            swap(c,k,i);
        }
    }
    private static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        perm(s.toCharArray(), 0);
    }

}
