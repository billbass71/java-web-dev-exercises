package exercises;
import java.util.Scanner;
public class AreaOfRectangle {

    public static void main(String[] args){
        AreaOfRectangle areaOfRectangle =  new AreaOfRectangle();
        areaOfRectangle.userInput();

    }
    public void userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the length of the Rectangle: ");
        Double myRectLength = scanner.nextDouble();

        System.out.println("What is the width of the Rectangle: ");
        Double myRectWidth = scanner.nextDouble();

        Double area = myRectLength * myRectWidth;

        System.out.println("Your area is: " + area.toString());
    }
}
