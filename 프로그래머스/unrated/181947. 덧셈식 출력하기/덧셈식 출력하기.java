import java.util.Scanner;

public class Day2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int answer = 0;
        answer = num1+num2;
        sc.close();

        
        System.out.println(String.format("%d + %d = %d", num1, num2, answer));

    }
}