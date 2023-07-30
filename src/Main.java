
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Available figures:");
        System.out.println();
        String choise = new String();
        for (Shapes shapes : Shapes.values()) System.out.println(shapes);
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the figure");
        System.out.println();
        choise = String.valueOf(in.nextLine());

        switch (choise) {
            case "Cube":
                Cube cube = new Cube();
                cube.inputData();
                System.out.println("The volume of cube is " + cube.calculateV());
                System.out.println("The square of cube is " + cube.calculateS());
                break;
            case "Sphere":
                Sphere sphere = new Sphere();
                sphere.inputData();
                System.out.println("The volume of sphere is " + sphere.calculateV());
                System.out.println("The square of sphere is " + sphere.calculateS());
                break;
            case "Cylinder":
                Cylinder cylinder = new Cylinder();
                cylinder.inputData();
                System.out.println("The volume of cylinder is " + cylinder.calculateV());
                System.out.println("The square of cylinder is " + cylinder.calculateS());
                break;
            case "Parallelipiped":
                Parallelipiped parallelipiped = new Parallelipiped();
                parallelipiped.inputData();
                System.out.println("The volume of parallelipiped is " + parallelipiped.calculateV());
                System.out.println("The square of parallelipiped is " + parallelipiped.calculateS());
                break;
            default:
                System.out.println("Wrong name is entered");
        }








       }
}