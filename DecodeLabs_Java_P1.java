package decodelabs_java_p1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class DecodeLabs_Java_P1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        boolean win = false;
        int attempt = 5;
        char check;
        int score = 0;
        System.out.println("                   ========================                    ");
        System.out.println("-_- ==============|| WELCOME TO GUESS GAME ||============== -_-");
        System.out.println("                   ========================                   ");
        while (!win && attempt > 0) {
            try {
                int target = r.nextInt(1, 100);

                System.out.println("please guess the number from 1 to 100");
                System.out.println("============================================");

                int guess = -1;
                while (guess < 1 || guess > 100) {
                    try {
                        guess = sc.nextInt();
                        if (guess < 1 || guess > 100) {
                            System.out.println("Wrong input! Please enter a number between 1 and 100");
                            System.out.println("==========================================================");

                        }
                    } catch (InputMismatchException ex) {
                        System.out.println("Wrong input! Please enter a valid number between 1 and 100");
                        System.out.println("==========================================================");
                        sc.nextLine();
                        guess = -1;
                    }
                }
                sc.nextLine();

                if (guess == target) {
                    System.out.println("true because your number is " + guess + " and the target is " + target);
                    System.out.println("============================================");

                    win = true;
                    score++;

                    check = getValidPlayAgainInput(sc);

                    if (check == 'Y') {
                        win = false;
                        attempt = 5;
                    } else {
                        System.out.println("============================================");
                        System.out.println("your final score is " + score);
                        System.out.println("                    =========================                    ");
                        System.out.println("-_- ==============|| THANK YOU FOR YOUR TIME ||============== -_-");
                        System.out.println("                    =========================                   ");
                        sc.close();
                        return;
                    }
                } else if (guess > target) {
                    System.out.println("Too High");
                    attempt--;

                    if (attempt == 0) {
                        System.out.println("sorry, Game over because your attempt is zero");
                        System.out.println("============================================");

                        check = getValidPlayAgainInput(sc);

                        if (check == 'Y') {
                            win = false;
                            attempt = 5;
                        } else {
                            System.out.println("============================================");
                            System.out.println("your final score is " + score);
                            System.out.println("                    =========================                    ");
                            System.out.println("-_- ==============|| THANK YOU FOR YOUR TIME ||============== -_-");
                            System.out.println("                    =========================                   ");
                            sc.close();
                            return;
                        }
                    } else {
                        System.out.println("you have just " + attempt + " attempts");
                        System.out.println("============================================");
                    }
                } else {
                    System.out.println("Too Low");
                    attempt--;

                    if (attempt == 0) {
                        System.out.println("sorry, Game over because your attempt is zero");
                        System.out.println("============================================");

                        check = getValidPlayAgainInput(sc);

                        if (check == 'Y') {
                            win = false;
                            attempt = 5;
                        } else {
                            System.out.println("============================================");
                            System.out.println("your final score is " + score);
                            System.out.println("                    =========================                    ");
                            System.out.println("-_- ==============|| THANK YOU FOR YOUR TIME ||============== -_-");
                            System.out.println("                    =========================                   ");
                            sc.close();
                            return;
                        }
                    } else {
                        System.out.println("you have just " + attempt + " attempts");
                        System.out.println("============================================");
                    }
                }

            } catch (InputMismatchException ex) {
                System.out.println("wrong input");
                System.out.println("=========================================");
                sc.nextLine();
            }
        }
        sc.close();
    }

    private static char getValidPlayAgainInput(Scanner sc) {
        char check = '\u0000';
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Do you want to play again[Y/N]");
            System.out.println("============================================");

            try {

                check = sc.next().toUpperCase().charAt(0);

                if (check == 'Y' || check == 'N') {

                    validInput = true;
                } else {
                    System.out.println("Wrong input! Please enter just Y or N");
                    System.out.println("============================================");
                }
            } catch (Exception ex) {
                System.out.println("Wrong input! Please enter just Y or N");
                System.out.println("============================================");
            }
        }

        return check;
    }
}
