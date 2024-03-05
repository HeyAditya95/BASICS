public class Quantifiers {
        public static void main(String[] args) {

            String str1 = "abcabcabcababcbcba";
            String str2 = new String("");  //--true

            // * is an expression used for 0 or time
            System.out.println(str1.matches("[abc]*"));  //--true

            // + is an expression used for 1 or time
            System.out.println(str1.matches("[abc]+"));  //--true

            // ? is an expression used for 0 or 1
            System.out.println(str2.matches("[abc]?"));  //--true

            // {X} is an expression used for X times
            System.out.println(str1.matches("[abc]{18}"));  //--true

            // {X,Y} is an expression used as a limit between X and Y
            System.out.println(str1.matches("[abc]{01,18}"));  //--true
            
        }
    }