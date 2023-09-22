import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner calculateCircle = new Scanner(System.in);
        System.out.println("Please enter the radius of your circle: ");
        double radius = Double.parseDouble(calculateCircle.nextLine());
        circleCalculations(2 * radius, Math.PI * (radius * radius), 2 * Math.PI * radius);
    }

        public static void circleCalculations(double diameter, double area, double circumference){
        System.out.println("The diameter of the circle is " + diameter + ".");
        System.out.println("The area of the circle is " + area + ".");
        System.out.println("The circumference of the circle is " + circumference + ".");
        }

        }