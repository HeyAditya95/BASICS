import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class challenge_radix {
    public static void main(String[] args) {
        //find radix of a number of a given string
        Scanner sc = new Scanner(System.in);
        String num;

        System.out.println("enter a number : ");
        num = sc.nextLine();

        if (num.matches("[01]+"))
        {
            System.out.println("binary radix = 2");
        }
        else if (num.matches("[0-7]+"))
        {
            System.out.println("octal radix = 8");
        }
        else if (num.matches("[0-9A-F]+"))
        {
            System.out.println("hexa radix = 16");
        }
        else if (num.matches("[0-9]+"))
        {
            System.out.println("decimal radix = 10");
        }
        else
        {
            System.out.println("not a number");
        }
        
        //find given year is leap year
System.out.println("-------------------------");
System.out.println("enter your year");
        int year;
        year = sc.nextInt();

        if (year%4==0)
        {
            if(year%100==0)
            {
                if (year%400==0)
                {
                    System.out.println("this is a lea");
                }
                else{System.out.println("not a leap year");}
            }
            else 
            {
                System.out.println("it is a leap year");
            }
        }
        else {
            System.out.println("not a leap year : ");
        }

      
        
    }
    
}
