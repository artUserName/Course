import java.util.Scanner;

public class Parallelipiped extends Shape {
    private double height, length, width;

    private void inputData (double height, double length, double width) {
        System.out.println("Enter the height");
        Scanner in = new Scanner(System.in);
        this.height = in.nextInt();
        System.out.println("The height is " + this.height);
        System.out.println("Enter the length");
        this.length = in.nextInt();
        System.out.println("The length is " + this.length);
        System.out.println("Enter the width");
        this.width = in.nextInt();
        System.out.println("The length is " + this.width);
    };
    private void outputData (){};
}
