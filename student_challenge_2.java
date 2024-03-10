//remove special character from a string
//remove extra spaces from a string
//find number of word in a string

public class student_challenge_2 {
    public static void main(String[] args) {

        String str1 = "a!b@c#D$e%f^1!2@3#";


        //remove special character from a string 

        System.out.println(str1.replaceAll("[^a-zA-Z0-9]", ""));

        //remove extra spaces from a string
        String str2 = "     ad   23csc wedfq34       34fq3f     q34f34 f   f34fw45fgw          fgw45g     gw45g      ";
        System.out.println(str2.replaceAll("\\s+" , " ").trim());

        //find number of word in a string
        System.out.println();
    }
}
