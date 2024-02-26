public class string_method_3 {
    public static void main(String[] args) {
        String str1 = "Pyramid";  //creating in pool
        String str2 = "Pyramid";   //creating in pool

        System.out.println(str1.equals(str2)); //case-sensitive and it is used to check "CONTENTS" in the string     -- true
        System.out.println(str1==str2); //checking reference    -- true

        String str3 = str1.toLowerCase();
        System.out.println(str3.equalsIgnoreCase(str1));  //non case-sensitive    -- true

        String str4 = new String("Pyramid");    //creating in Heap

        System.out.println(str3.equalsIgnoreCase(str4));     //checking only contents from heap and pool   --true

        System.out.println(str4 == str3);   //comparing object in which one is on pool and the other one in heap   -- false





        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
    // from here i am going to write my compare to method 
    // and the above one is equal to method
    //compares the askii value between to strings
    

    System.out.println(str1.compareTo(str2)); // diff btw askii value and the output will be 0
    System.out.println(str1.compareTo(str3)); // askii value of the smaller letter is greater than the capital one  --this should be negative
    System.out.println(str3.compareTo(str1)); //answer should be positive 
    
    

    String str5 = new String("The great wall of china ");
    System.out.println(str5.contains("The"));   //contains method checks the word whether the string contains or not + this is case sensitive 
    System.out.println(str5 +" and "+ str1);
    System.out.println(str5.concat(str1));  //another method to concatinate


   }
}
