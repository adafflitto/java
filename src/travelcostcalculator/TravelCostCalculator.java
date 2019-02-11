/*
 * This program uses total distance of a car trip with miles per gallon and the 
 * price per gallon of fuel to calculate travel costs associated with a trip
 */
package travelcostcalculator;
import java.util.Scanner;
/**
 *
 * @author andrew dafflitto
 */
public class TravelCostCalculator {

    public static void main(String[] args) {
        double distance, mpg, pricePerGallon, totalCost;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter the total distance in miles: ");
        distance = in.nextDouble();
        System.out.println("Please enter the number of miles per gallon your vehicle gets: ");
        mpg = in.nextDouble();
        System.out.println("Please enter the costs of one gallon of fuel: ");
        pricePerGallon = in.nextDouble();
        
        totalCost = (distance/mpg)*pricePerGallon;
        System.out.printf("The trip is goiing to cost $%5.2f",totalCost);
        System.out.println("");
        
        
        
    }
    
}
