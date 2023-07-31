import java.util.Scanner;

public class Parallelipiped extends Shape {
    private double height, length, width;

    public void inputData () {
        System.out.println("Enter the height");
        Scanner in = new Scanner(System.in);
        this.height = in.nextInt();
        System.out.println("The height " + this.height + " is set");
        System.out.println("Enter the length");
        this.length = in.nextInt();
        System.out.println("The length " + this.length + " is set");
        System.out.println("Enter the width");
        this.width = in.nextInt();
        System.out.println("The width " + this.width + " is set");
    }
    @Override
    protected double calculateV (){
        return (height*length*width);
    }
    @Override
    protected double calculateS(){
        return (((height*length)+(length*width)+(width*height))*2);
    }

}
