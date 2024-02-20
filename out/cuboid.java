import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {
        int length , breadth , height;
        int total_area , volume;
        System.out.println("enter the dimension of cuboid : ");
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        total_area = 2*((length*height) + (length*breadth) + (height*breadth));
        volume = (length*breadth*height);
        System.out.println("the total area of the cuboid is : " + total_area +" and the volume of the cuboid is : " + volume);
    }
    
}
