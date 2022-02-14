package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator rectangleShape = new Calculator();

        rectangleShape.setHeight(40);
        rectangleShape.setWidth(20);

        String s = "The rectangle";
        rectangleShape.calculateArea("The rectangle");
    }
}
