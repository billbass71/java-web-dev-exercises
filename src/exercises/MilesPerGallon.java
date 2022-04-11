package exercises;
import java.util.Scanner;
public class MilesPerGallon {

    public static void main(String[] args) {
        MilesPerGallon milesPerGallon =  new MilesPerGallon();
        milesPerGallon.calculateMilesPerGallon();

    }

    public void calculateMilesPerGallon(){
        Scanner sca = new Scanner(System.in);
        System.out.println("How many miles have you driven: ");
        Double milesDriven = sca.nextDouble();

        System.out.println("How many gallons of gas have you consumed: ");
        Double gasConsumed = sca.nextDouble();

        Double milesPerGallon = milesDriven/gasConsumed;
        System.out.println("Your miles per gallon is " + milesPerGallon.toString());
    }





}
