import java.util.Scanner;

public class Sphere extends Shape {
    private double radius;

    private void inputData (double radius) {
        System.out.println("Enter the radius");
        Scanner in = new Scanner(System.in);
        this.radius = in.nextInt();
        System.out.println("The radius is " + this.radius);
    };

    @Override
    public void calculateV (){
        this.volume = Math.pow(this.radius, 3);
        System.out.println(this.volume);
    };


}
