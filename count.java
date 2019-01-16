import java.util.Scanner;

public class count {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char ch = sc.next(".").charAt(0);

        char[] c = s.toCharArray();
        int count=0;
        for(int i=0;i<s.length();i++) {
            if (ch == c[i]) {
                count++;

            }
        }
            if(count == 0){
                System.out.println("Character does not exist");
            }else{
                System.out.println("Total count : " + count);
            }


    }
}
