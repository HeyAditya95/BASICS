import java.util.*;
public class conditional_statement {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter your first number : ");
        a = sc.nextInt();
        System.out.print("please enter your second number : ");
        b = sc.nextInt();
        System.out.print("please enter your third number : ");
        c = sc.nextInt();
        if (a>b && a>c) {
            System.out.println("okay");
        } else { 
            if (b>c) {
                System.out.println("okay okay");
            }
            if(a==b&&b==c){
                System.out.println("all are barabr");
            }
             else{System.out.println("okay okay okay");}
        } 
    }
    
}
