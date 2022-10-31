package task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entRadius = new Scanner(System.in);
        double r = entRadius.nextDouble();

        System.out.println("Area of Circle is:" + MyArea.areaOfCircle(r));
    }
}
