import java.util.Scanner;

public class Main {
    static double radius;
    public static void main(String[] args) {

        Scanner calculateCircle = new Scanner(System.in);
        System.out.println("Please enter the radius of your circle: ");
        radius = Double.parseDouble(calculateCircle.nextLine());

        calculateDiameter();
        calculateArea();
        calculateCircumference();
    }

        public static void calculateDiameter(){

            double diameter = 2 * radius;
            System.out.println("The diameter of the circle is " + diameter + ".");
        }

        public static void calculateArea(){

            double area = Math.PI * (radius * radius);
            System.out.println("The area of the circle is " + area + ".");
        }

        public static void calculateCircumference(){

            double circumference = 2 * Math.PI * radius;
            System.out.println("The circumference of the circle is " + circumference + ".");
        }
    }