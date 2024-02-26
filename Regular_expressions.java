public class Regular_expressions {
    public static void main(String[] args) {
        String str1 = "o";   
        String str2 = "k"; //can be anything h8 ,G5 ,h6 , f5 etc. there can be 
        String str3 = "g2";
        String str4 = "b2B";


        System.out.println(str1.matches("."));   // "." can be compare to any digit and letter or symbols    --true


        System.out.println(str1.matches("[asdfghjk]"));  //this will only compare one word in the string and that should be in given range , for now that is [asdfghjk]
        // and for that [] big bracket is important    --false

        System.out.println(str2.matches("[a-z0-9]"));   // this is method sets the range of alphabet from your desired alphabet and from your desired number   --true
        //but this will only compare letter and numbers not special characters or symbol

        System.out.println(str3.matches("[a-z][0-9]"));  //for comparing two characters we have to use two separates big bracket [][]

        System.out.println(str4.matches("[a-z][A-Z][0-9]")); //for comparing three characters , we have to use three separates big bracket [][][]

        System.out.println(str1.matches("[^abc]"));  // ^ is known as except , for eg if we have [^abc] ,this means string should contain all letters except abc

        System.out.println(str2.matches("a|k"));   // "|" this means must be     --true

    }
    
}
