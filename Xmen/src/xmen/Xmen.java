package xmen;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Xmen {

    static String[] names = new String[15];

    public static void main(String[] args) {
        try {
            Scanner xmen = new Scanner(System.in);
            System.out.println("Enter your favorites xmen!!!");
            names[0] = xmen.nextLine();
            names[1] = xmen.nextLine();
            names[2] = xmen.nextLine();
            names[3] = xmen.nextLine();
            names[4] = xmen.nextLine();
            names[5] = xmen.nextLine();
            names[6] = xmen.nextLine();
            names[7] = xmen.nextLine();
            names[8] = xmen.nextLine();
            names[9] = xmen.nextLine();
            names[10] = xmen.nextLine();
            names[11] = xmen.nextLine();
            names[12] = xmen.nextLine();
            names[13] = xmen.nextLine();
            names[14] = xmen.nextLine();

        } catch (InputMismatchException input) {
            input.getStackTrace();
            System.out.println("An error has occurred....try again later");
        } finally {
            Arrays.sort(names);
            for (String xmen : names) {
                System.out.println(xmen);
            }
            myXmen(names);
        }

    }

    public static void myXmen(String[] names) {
        for (String name : names) {
            if (name.equals("Wolverine")) {
                System.out.println("The badass leader..." + name);
            } else {
                System.out.println("Not the correct leader");
            }
        }
    }
}
