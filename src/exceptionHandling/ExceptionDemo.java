package exceptionHandling;

import polymorphism.overloading.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class ExceptionDemo {


    private static void def() {

//        FileInputStream fileInputStream = null;
//        try {
//            fileInputStream = new FileInputStream("test");
//        } catch (IOException e) {
//            System.out.println("IOException caught");
//        } finally {
//            try {
//                if (fileInputStream != null) {
//                    fileInputStream.close();
//                }
//            }catch (IOException e) {
//                System.out.println("IOException caught");
//            }
//            System.out.println("in finally block");
//        }


        try(FileInputStream fileInputStream1 = new FileInputStream("test");
            CustomResource cr = new CustomResource()) {
            System.out.println(cr.g);
        } catch (Exception e) {
            System.out.println("IOException caught");
        }finally {

            System.out.println("in finally");
            System.out.println("in finally block");
        }
    }

    private static void jkl(boolean var) throws IOException, ArithmeticException {
        if (var == true) {
            System.out.println("Always true scenario");
            int h = 6/0;
        } else {
            throw new IOException("var is false");
        }
    }


    private static void ghi(boolean var) throws IOException {
        if (var == true) {
            System.out.println("Always true scenario");
        } else {
            FileInputStream fileInputStream1 = new FileInputStream("test");
        }
    }

    private static int abc(int a, String b) {
        System.out.println("In abc");
        int g = 0;
        Integer converted = null;
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("test");
            g = 50 / a; //5 // halts the execution fo your program
            converted = Integer.parseInt(b); // 5
        } catch (ArithmeticException e) {
//            System.exit(1);
            System.out.println("In catch block 1 for exception: " + e);
        } catch (NumberFormatException exception) {
//            handleException(g);
            System.out.println("In catch block 2 for exception: "+ exception);
        } catch (Exception exception) {
//            handleException(g);
            System.out.println("In catch block 3 for exception: "+ exception);
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            }catch (IOException e) {
                System.out.println("IOException caught");
            }
            System.out.println("in finally block");
        }

        System.out.println("g is calculated: "+ g); //
        System.out.println("CONVERTED is calculated: "+ converted); // null 5
        return g;
    }

    public static void main(String[] args) throws IOException  {
//        System.out.println(abc(0, "5"));
//        def();
//        try {
//            ghi(false);
//        } catch (IOException e) {
//            System.out.println("IOException in main");
//        }
//        try {
////            Scanner sc = new Scanner();
////            sc.nextInt();
//            jkl(false);
//        }catch (RuntimeException e) {
//            System.out.println("Runtime in main");
//            throw e;
//        }
//        jkl(false);

        isEligible(16);

    }

    private  static void handleException(int g) {
        try {
            int f = g / 0;
            System.out.println("f is: " + f);
        } catch (Exception e) {
            System.out.println("IN catch of try catch");
        }
    }


    private static void isEligible(int age) throws IllegalAgeException {
        if (age < 18) {
            System.out.println("Not eligible");
            throw new IllegalAgeException("Candidate is ineligible :"+age, age);
        } else {
            System.out.println("eligible");
        }
    }

}
