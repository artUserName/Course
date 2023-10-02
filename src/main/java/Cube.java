import java.util.Scanner;

public class Cube extends Shape {
    double edge;

    public double inputData() {
        System.out.println("Enter the edge");
        Scanner in = new Scanner(System.in);
        this.edge = in.nextInt();
        System.out.println("The edge " + this.edge + " is set");
        return(this.edge);
    };


    @Override
        protected double calculateV (){
            return Math.pow(this.edge, 3);
    };
    @Override
        protected double calculateS(){
            return Math.pow(edge,2)*6;
    };





}
