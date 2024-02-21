public class string_method_1 {
    public static void main(String[] args) {
        String str = new String("something");
        System.out.println("The length of the string is : " + str.length());

        //UPPERCASE
        String str1 = str.toUpperCase();
        System.out.println("the result of the uppercase is : " + str1);

        //LOWERCASE
        String str2 = str.toLowerCase();
        System.out.println("the result of lowercase is " + str2);

        //TRIM
        String str3 = new String("   something   ");
        String str4 = str3.trim();
        System.out.println("The trimmed part is : " + str4);

        //substring
        String Substring1 =str.substring(4);
        String Substring2 =str.substring(4 ,8);  // overloaded substring method
        System.out.println("The substring is : " + Substring1);
        System.out.println("the output of overloaded subtring method is : " + Substring2);

        //REPLACE
        String str5 = str.replace('s','h');
        System.out.println("the output for the Replace Method is : " + str5);


    }
}
