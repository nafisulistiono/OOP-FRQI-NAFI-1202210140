import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Calculation cal = new Calculation();
        Scanner input = new Scanner(System.in);
        Thread thr = new Thread(cal);
        boolean repeat = false;

        do {
            System.out.println("=== menu program ===\n 1. Square\n 2. Circle\n 3.Trapezoid");
            System.out.println("Select Menu: ");
            int operation = input.nextInt();
            try {
                switch (operation) {
                    case 1:
                        System.out.println("Enter the length of the side of the square: ");
                        cal.side = input.nextDouble();
                        cal.setSquare();
                        thr.start();
                        thr.join();
                        System.out.println("The calc result: " + cal.getSquare());
                        break;

                    case 2:
                        System.out.println("enter the radius of the circle: ");
                        cal.radius = input.nextDouble();
                        cal.setCircle();
                        thr.start();
                        thr.join();
                        System.out.println("the calc result is: " + cal.getCircle());
                    
                    case 3:
                        System.out.println("insert the side of the base of the trapezoid: ");
                        double a = input.nextDouble();

                        System.out.println("enter the upper side of the trapezoid: ");
                        double b = input.nextDouble();

                        System.out.println("enter height: ");
                        double c = input.nextDouble();

                        cal.setTrapezoid(a, b, c);
                        thr.start();
                        thr.join();
                        
                        System.out.println("the calculation result: " + cal.getTrapezoid());
                        break;
                        

                    default:
                        System.out.println("option not available");
                        break;
                }
            } catch (InputMismatchException e) {
                // TODO: handle exception
                System.out.println("input must be number");
            } catch (IllegalArgumentException e) {
                System.out.println("input must be number");
            }
        } while (repeat);
        input.close();
    }
}
