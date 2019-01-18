import java.util.Scanner;

public class parseint {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        int result = Integer.parseInt(number);
        System.out.println("i: " + result);
    }
}
