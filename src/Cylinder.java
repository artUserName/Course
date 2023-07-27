import java.util.Scanner;

public class Cylinder extends Shape {

    private double radius, height;

    private void inputData (double radius, double height) {
        System.out.println("Enter the radius");
        Scanner in = new Scanner(System.in);
        this.radius = in.nextInt();
        System.out.println("The radius is " + this.radius);
        System.out.println("Enter the radius");
        this.height = in.nextInt();
        System.out.println("The height is " + this.height);
    };

    private void outputData (){};

}
