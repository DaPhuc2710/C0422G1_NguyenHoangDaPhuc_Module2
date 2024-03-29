package ss6_inheritance.bai_tap.circle_cylinder;

public class Circle {
    private double radius = 2.0;
    String color = "Blue";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" +
                radius +
                ", color='" + color + '\'' +
                "the Area is " + getArea() + '\'' +
                "The Perimeter is " + getPerimeter();
    }
}
