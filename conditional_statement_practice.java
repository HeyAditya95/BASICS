import java.util.Scanner;
public class conditional_statement_practice {
    public static void main(String[] args) {
        // find a number which is odd or even 
        // find a person who is young or not young
        // find grace for given marks
       // System.out.println("Enter the number : ");
       // int number;
        Scanner sc = new Scanner(System.in);
       // number = sc.nextInt();
       /*  if(number%2 == 0){
            System.out.println("number is even");
        } else {System.out.println("odd");};

        // find a person who is young or not young
        System.out.println("------------------------------------------------------------------------------------");

        System.out.println("This section is for checking age : ");
        int age ;
        System.out.println("enter the age : ");
        age = sc.nextInt();
        if (age < 18 && age > 70) {
            System.out.println("young :-) ");
        } else {
            System.out.println("you are not young :-0 ");
        }
       */

        // find grace for given marks
        
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Enter your marks of 3 subject : ");
        int m1,m2,m3;
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        float avg = (float)((m1+m2+m3)/3);
        if(avg>=70)
           {
               System.out.println("Grade A");
           }
           else if(avg>=60 && avg<70)
           {
               System.out.println("Grade B");
           }
           else if(avg>=50 && avg<60)
           {
               System.out.println("Grade C");
           }
           else if(avg>=40 && avg<50)
           {
               System.out.println("Grade D");
           }
           else 
           {
               System.out.println("Grade E");
           
    

    }
    
}
}
