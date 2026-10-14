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

    }
}
