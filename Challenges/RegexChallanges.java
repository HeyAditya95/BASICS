// to find is a number binary or not
// hexa decimal or not
//find if the number is in date format or not

package Challenges;
import java.util.*;
public class RegexChallanges {
    public static void main(String[] args) {
/*
        // to find is a number binary or not

        System.out.println("Please enter the number : ");
        Scanner Binary = new Scanner(System.in);
        int a = Binary.nextInt();
        String str = String.valueOf(a);
        System.out.println(str.matches("[01]+"));  

        // hexa decimal or not

        System.out.println("Enter the digits to check HexaDecimal : ");
        Scanner HexaDecimal = new Scanner(System.in);
        String A = HexaDecimal.nextLine();
        System.out.println(A.matches("[0-9A-F]+")); */

        //find if the number is in date format or not

        System.out.println("Please Enter your date : ");
        String str2 = "21/02/2012";
        System.out.println(str2.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}]"));

    }
}