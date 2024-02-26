public class string_method_2 {
    public static void main(String[] args) {
        String str1 = new String("Mr. Aditya kumar jha");
        System.out.println(str1.indexOf("a",5));
        System.out.println(str1.startsWith("Mr.")); // case sensitive
        System.out.println(str1.startsWith("Adi" , 4));
        System.out.println(str1.endsWith("jha"));
        System.out.println(str1.charAt(8));
        System.out.println(str1.lastIndexOf("j"));

        //printing all characters of string horizontally
        for(int i=0; i<str1.length(); i++)
        System.out.println(str1.charAt(i));

//printing all characters of string vertically
        for(int i=0; i<str1.length(); i++)
        System.out.print(str1.charAt(i));
        
        
    }
}
