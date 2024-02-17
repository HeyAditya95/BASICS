import java.util.Scanner;
public class SumOFNumbers {
    public static void main(String[] args) {
        int x , y , sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thr first number : ");
        x = sc.nextInt();
        System.out.println("Enter thr first number : ");
        y = sc.nextInt();

        sum = x + y;
        System.out.println("The sum of the two number is : " + sum);
    }
}
