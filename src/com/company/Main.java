package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator rectangleShape = new Calculator("rectangle", 20, 40);
        Calculator squareShape = new Calculator("Square", 25, 25);


        //rectangleShape.setHeight(40);
        //rectangleShape.setWidth(20);

        String s = "The rectangle";
        rectangleShape.calculateArea("The rectangle");
    }
}
