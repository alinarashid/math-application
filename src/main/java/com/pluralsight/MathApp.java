package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1: highest salary
        double bobSalary = 65_000.50;
        double garySalary = 72_500.75;
        double highestSalary = Math.max(bobSalary,garySalary);

        System.out.println("The highest salary is $"+ highestSalary);

        // Question 2: lowest vehicle price
        double carPrice = 25_000;
        double truckPrice = 50_200.34;
        double minPrice = Math.min(carPrice,truckPrice);

        System.out.println("The cheapest price is $" + minPrice);

        // Question 3: area of a circle

        double circleRadius = 7.25;
        double circleArea = Math.PI* Math.pow(circleRadius,2);

        System.out.println("The area of a circle with radius "+ circleRadius+" is "+ circleArea);

        // Question 4: square root

        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + squareRoot);

        // Question 5: distance between two points
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;
        double xDifference = x2 - x1;
        double yDifference = y2 - y1;
        double distance = Math.sqrt( Math.pow(xDifference, 2) + Math.pow(yDifference, 2) );

        System.out.println("The distance between (5, 10) and (85, 50) is " + distance);


        // Question 6: absolute value
        double negativeNumber = -3.8;
        double absoluteValue = Math.abs(negativeNumber);
        System.out.println("The absolute value of " + negativeNumber + " is " + absoluteValue);




    }
}
