import java.util.Scanner;

public class Cube extends Shape {
    private double edge;

    private void inputData (double edge) {
        System.out.println("Enter the edge");
        Scanner in = new Scanner(System.in);
        this.edge = in.nextInt();
        System.out.println("The edge is " + this.edge);
    };

    @Override
    public void calculateV (){
        this.volume = Math.pow(this.edge, 3);
        System.out.println(this.volume);
    };
    private void outputData() {

    };






}
