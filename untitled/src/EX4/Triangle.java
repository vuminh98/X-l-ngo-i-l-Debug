package EX4;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        try {
            inputSides();
            System.out.println("Triangle is right!");
        } catch (IllegalTriangleException ex) {
            System.out.println("Error: There are not 3 sides of the triangle!");
        }
    }

    private static void inputSides() throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first side: ");
        int side1 = scanner.nextInt();
        System.out.println("Enter the second side: ");
        int side2 = scanner.nextInt();
        System.out.println("Enter the third side: ");
        int side3 = scanner.nextInt();

        if (!isTriangle(side1, side2, side3)) {
            throw new IllegalTriangleException();
        }
    }

    public static boolean isTriangle(int side1, int side2, int side3) {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }
}
