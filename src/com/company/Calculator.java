package com.company;

public class Calculator {
    //properties to include width and height
    private double width;
    private double height;
    private String shape;

    //method to calculate area of a certain shape
    public void calculateArea(String name) {
        System.out.println(name + " is " + width + " wide and " + height +
                " tall and the area is " + (width*height) + ".");
    }

    //method for setting width
    public void setWidth(double widthOfShape) {
        width = widthOfShape;
    }

    //method for setting height
    public void setHeight(double heightOfShape) {
        height = heightOfShape;
    }
}
