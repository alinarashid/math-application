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

    }
}
