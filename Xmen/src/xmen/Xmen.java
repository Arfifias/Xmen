package xmen;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Xmen {

    static String[] names = new String[15];//Xmen Array

    public static void main(String[] args) {
        try {
            Scanner xmen = new Scanner(System.in);//Input
            System.out.println("Enter your favorites xmen!!!");//Message for the user
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
            names[14] = xmen.nextLine();//Typing 15 favorite mutants

        } catch (InputMismatchException input) {
            input.getStackTrace();//Catching Exception
            System.out.println("An error has occurred....try again later");//Another message for the user
        } finally {
            Arrays.sort(names);//Sorting the list
            for (String xmen : names) {
                System.out.println(xmen);//Calling the method
            }
            myXmen(names);
        }

    }

    public static void myXmen(String[] names) {
        for (String name : names) {
            if (name.equals("Wolverine")) {
                System.out.println("The badass leader..." + name);//If typed name is wolverine then it shows that he is the badass leader sorted
            } else {
                System.out.println("Not the correct leader");//Altarnatively another message for the user
            }
        }
    }
}
