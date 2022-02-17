package com.company;

public class Calculator {
    //properties to include width and height
    private double width;
    private double height;
    private String shape;

    public Calculator(String shape, double width, double height) {
        this.shape = shape;
        this.width = width;
        this.height = height;

    }

    //method to calculate area of a certain shape
    public void calculateArea(String name) {
        System.out.println(name + " is " + width + " wide and " + height +
                " tall and the area is " + (width * height) + ".");
    }

    //method for setting width
    public void setWidth(double widthOfShape) {
        width = widthOfShape;
    }

    public double getWidth() {
        return width;
    }

    //method for setting height
    public void setHeight(double heightOfShape) {
        height = heightOfShape;
    }

    public double getHeight() {
        return height;
    }

    public void describeShape() {
        System.out.println("The " + getShape() + " is " + getWidth() + " wide, and " + getHeight() + " high.");
    }

}
