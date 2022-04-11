package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Area area = new Area();
        area.userInput();


    }

    public void userInput() {
        Scanner scanner = new Scanner(System.in);
            try {
                boolean keepLooping = true;
                while(keepLooping){
                System.out.println("Enter a radius: ");

                Double radius = scanner.nextDouble();
                if (radius < 0) {
                    System.out.println("You can not enter a negative number!");
                } else {
                    Double area = Circle.getArea(radius);
                    System.out.println("The area of a circle of radius " + radius + " is " + area.toString());
                    keepLooping = false;
                }
            }
            } catch(Exception error){
                    System.out.println("You mush provide a numeric input.");
            }
        scanner.close();
    }




}
