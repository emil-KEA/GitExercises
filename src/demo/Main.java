package demo;

import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().greeting();
        System.out.println("It works!");
    }
    void greeting(){
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Hej " + name);
    }
}
