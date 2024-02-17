import java.util.*;
public class quadratic_equation {
    public static void main(String[] args) {

        int a , b , c ;
        double r1 , r2;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a , b , c : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        double discriminant = b * b - 4 * a * c;


        r1 = (-b + Math.sqrt(discriminant))/(2*a);
        r2 = (-b - Math.sqrt(discriminant))/(2*a);

        System.out.println("the root for the following equation is : ");
        System.out.println(r1);
        System.out.println(r2);

    }
}
