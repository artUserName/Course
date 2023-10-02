import java.util.Scanner;

public class Cylinder extends Shape {

    private double radius, height;

    public double inputData() {
        System.out.println("Enter the radius");
        Scanner in = new Scanner(System.in);
        this.radius = in.nextInt();
        System.out.println("The radius " + this.height + " is set");
        System.out.println("Enter the height");
        this.height = in.nextInt();
        System.out.println("The height " + this.height + " is set" );
        return this.radius;
    }


    @Override
    protected double calculateV (){
        return Math.pow(radius, 2) * Math.PI * height;
    }
    @Override
    protected double calculateS(){
        return 2 * Math.PI * radius * (height + radius);
    }

}
