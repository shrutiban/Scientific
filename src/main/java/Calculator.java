
import java.util.*;
import java.io.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.text.DecimalFormat;

public class Calculator {


    private static final Logger logger= LogManager.getLogger(Calculator.class);


    static int choice;
    static boolean check=true;
    static double a,b,c;


    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        while(check){
                System.out.println("Press \n 1:Square Root \n 2:Factorial \n 3:Natural Logarithm \n 4:Power Funtion \n 5:Exit");
                try {
                    choice = sc.nextInt();
                }
                catch (InputMismatchException error) {
                    System.out.println("Invalid input entered!!!");
                    return;
                }
                switch (choice) {
                    case 1:
                        try {
                            System.out.print("Enter a number");
                            a = sc.nextDouble();
                        } catch (InputMismatchException error) {
                            logger.error("Invalid input!");
                            return;
                        }
                        if (a < 0)
                            System.out.println("You have entered a negative number!");

                        else
                            System.out.println("Square root is " +sqrt(a));
                        break;
                    case 2:
                        int f;
                        try {
                            System.out.print("Enter a number");
                            f = sc.nextInt();
                        } catch (InputMismatchException error) {
                            logger.error("Invalid input!");
                            return;
                        }
                        if (f < 0)
                            System.out.println("You have entered a negative number!");
                        else
                            System.out.println("Factorial is " +fact(f));
                        break;
                    case 3:
                        try {
                            System.out.print("Enter a number");
                            a = sc.nextDouble();
                        } catch (InputMismatchException error) {
                            logger.error("Invalid input!");
                            return;
                        }
                        if (a < 0)
                            System.out.println("You have entered a number less than 1");
                        else
                            System.out.println("Log is " +log(a));
                        break;
                    case 4:
                        try {
                            System.out.print("Enter two numbers : ");
                            a = sc.nextDouble();
                            b = sc.nextDouble();
                        } catch (InputMismatchException error) {
                            logger.error("Invalid input!");
                            return;
                        }
                        c = pow(a, b);
                        System.out.println(a+"^"+b+"is " + c);
                        break;
                    case 5:
                        System.out.println("Thank you!");
                        check = false;
                        break;
                    default:
                            System.out.println("You have entered wrong choice!");
                            return;
                        }
                }
        }

    public static double sqrt(double a){
            double c=0;
            logger.info("Square root of given number:" + a);
            if(a<0)
                c=-1;
            else
                c = Math.sqrt(a);
            logger.info(c);
            return c;
    }
    public static Double fact(int f){
            double result = 1;
            logger.info("Factorial  of given number:" + f);
            if(f<0)
                result=-1;
            else {
                try {
                    if (f == 0 || f == 1) return 1.0;

                    for (int i = 1; i <= f; i++) {
                        result *= i;
                    }
                }
                catch (Exception e) {
                    logger.info("Exception occured");
                }
            }
            logger.info("Power operations result : " + result);
            return result;
    }
    public static double log(double a){
            double c=0;
            logger.info("Log of given number:" + a);
            if(a<=0)
                c=-1;
            else
            c = Math.log(a);
            logger.info("Log operation result : " + c);
            return c;
    }
    public static double pow ( double a, double b){
            double c=0;
            logger.info("Power function of given numbers:" + a+","+b);
            if (a == 0)
                return 0;
            if (b == 0)
                return 1;
            try {
                c = Math.pow(a, b);
            }
            catch(Exception e) {
                logger.info("Exception occured");
            }
            logger.info("Power operation result is : " + c);
            return c;
        }
    }

