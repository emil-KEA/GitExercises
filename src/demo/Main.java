package demo;

import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().go();
        System.out.println("It works!");
    }
    void go(){
        greeting();
        askAboutAge();
        System.out.println(askAboutAge());
    }
    void greeting(){
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Hej " + name);
    }
    int askAboutAge(){
        System.out.println("Enter your age");
        return in.nextInt();
    }
}
