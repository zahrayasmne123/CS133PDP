package chapter12;

import Chapter11.problem1.Triangle;

 public class Problem5 extends InvalidTriangleException {
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;


    public Problem5(double side1, double side2, double side3) throws InvalidTriangleException {
        super(1,2,4);
        if (!isValidTriangle(side1, side2, side3)) {
            throw new InvalidTriangleException(side1, side2, side3);
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        return (side1 * side2 / 2);
    }

    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    public String toString() {
        return ("Side 1: " + side1 + " Side 2: " + side2 + " Side 3: " + side3);
    }

    private boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1);
    }
}

class InvalidTriangleException extends Exception {
    private double side1;
    private double side2;
    private double side3;

    public InvalidTriangleException(double side1, double side2, double side3) {
        super("Invalid triangle: sides " + side1 + ", " + side2 + ", " + side3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
}