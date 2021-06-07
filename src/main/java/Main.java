import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key?");
        if (in.next().equals("y")) {
            System.out.print("Are the battery terminals corroded?");
            if (in.next().equals("y")) {
                System.out.println("Replace cables and try again");
                return;
            } else {
                System.out.println("Replace cables and try again");
            }
        } else {
            System.out.print("Does the car make a slicking noise?");
            if (in.next().equals("y")) {
                System.out.println("Replace the battery.");
                return;
            } else {
                System.out.print("Does the car crank up but fail to start?");
                if (in.next().equals("y")) {
                    System.out.println("Check spark plug connections.");
                    return;
                } else {
                    System.out.print("Does the engine start and then die?");
                    if (in.next().equals("y")) {
                        System.out.print("Does your car have fuel injection?");
                        if (in.next().equals("y")) {
                            System.out.println("Get it in for service.");
                        } else {
                            System.out.println("Check to ensure the choke is opening and closing.");
                            return;
                        }
                    } else {
                        System.out.println("This should not be possible");
                    }
                }
            }
        }

        in.close();
    }
}
