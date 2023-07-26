package com.qa;

public class Circle extends Shape implements Moveable{
    private double radius;

    public Circle(String name, String colour, double x, double y,
                  double radius) {
        super(name, colour, x, y);
        this.radius = radius;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }


    public Point getCentrePoint() {
        return new Point(getX(), getY());
    }

    public Point getCurrentLocation(){
        return getCentrePoint();
    }
    public void move(double x, double y) {
        setX(getX() + x);
        setY(getY() + y);
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", getArea()="
                + getArea() + ", getCentrePoint()=" + getCentrePoint()
                + ", getX()=" + getX() + ", getY()=" + getY()
                + ", getName()=" + getName() + ", getColour()="
                + getColour() + "]";
    }
}
