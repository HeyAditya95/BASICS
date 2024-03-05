public class regex {
    public static void main(String[] args) {
        String str = "HeyAditya95@gmail.com";   
        int i = str.indexOf("@");
        String Username = str.substring(0, i);   // to store email username
        String Domain = str.substring(i+1 , str.length() ); // to store domain

        System.out.println("The username is : " + Username);
        System.out.println("The domain is : " + Domain);

        int j = Domain.indexOf(".");
        String name = Domain.substring(0, j);
        System.out.println(name.equals("gmail"));
    }
    
}
