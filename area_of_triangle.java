import java.util.Scanner;

public class area_of_triangle {
    public static void main(String[] args) {
        int a , b , c ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sides of the triangle : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        double s , area;
        s = (a + b + c)/2f;

        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("here is your area of triangle " + area);

    }
}
