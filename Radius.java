
import java.util.Scanner;

public class Radius {
  
    public static double circumference(double radius){

        return Math.PI * 2 * radius;
    }

    public static double circleArea(double radius){
        return Math.PI * radius * radius;
    }

    public static double sphereArea(double radius){
        return 4 * Math.PI * radius * radius;
    }

    public static double sphereVolume(double radius){
        return (4.0/ 3) * Math.PI * radius * radius * radius;
    }

    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius = scanner.nextDouble();


        System.out.println("Circle Circumference = " + circumference(radius));
        System.out.println("Circle Area = " + circleArea(radius));
        System.out.println("Sphere Area = " + sphereArea(radius));
        System.out.println("Sphere Volume = " + sphereVolume(radius));

    }

}