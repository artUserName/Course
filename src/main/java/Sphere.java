import java.util.Scanner;

public class Sphere extends Shape {
    private double radius;

    public void inputData() {
        System.out.println("Enter the radius");
        Scanner in = new Scanner(System.in);
        this.radius = in.nextInt();
        System.out.println("The radius " + this.radius + " is set");
    };


    @Override
        protected double calculateV (){
            return (4.0 / 3 * Math.PI * Math.pow(radius, 3));
    };

    @Override
        protected double calculateS (){
            return (Math.PI * Math.pow(radius, 2) * 4);
    };


}
