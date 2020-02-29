

import java.util.Scanner;

public class Lab1AConsole {
    public static void main(String[] args) {
        String name, age;
	    Scanner stdin = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        name = stdin.nextLine();

        System.out.print("Enter your Age: ");
        age = stdin.nextLine();

        System.out.println(name + " " + "is" + " " + age + " " + "years old!");
    }
}
