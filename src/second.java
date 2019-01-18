import java.util.Scanner;

public class second {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(" string is "+ s);

        //char[] cc = s.toCharArray();
        System.out.println("Enter the indices");
        int i = sc.nextInt();
        int j = sc.nextInt();

        if(i<j) {
            System.out.println("the removed character is " + s.substring(i, j));

        }else{
            System.out.println("first number should be less than the other");
        }
    }
}
