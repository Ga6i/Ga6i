import java.util.Scanner;

public class LotteryGabriella {

    public static void main(String[] args) {
        // Generate a lottery
        int lottery = (int) (Math.random() * 1000);
        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        int guess = input.nextInt();
        

        // Get digits from lottery
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = (lottery % 100) / 10;
        int lotteryDigit3 = lottery % 10;

        // Get digits from guess
        int guessDigit1 = guess / 100;
        int guessDigit2 = (guess % 100) / 10;
        int guessDigit3 = guess % 10;

        System.out.println("The lottery number is " + lotteryDigit1
                + lotteryDigit2 + lotteryDigit3);

        // Check the guess
        if (guess == lottery) {
            System.out.println("Exact match: you win $10,000");
        } else if ((guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3)
                || (guessDigit1 == lotteryDigit2
                && guessDigit1 == lotteryDigit3 && guessDigit3 == lotteryDigit1)
                || (guessDigit1 == lotteryDigit3
                && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2)
                || (guessDigit1 == lotteryDigit3
                && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1)
                || (guessDigit1 == lotteryDigit1
                && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2)) {
            System.out.println("Match all digits: you win $5,000");
        } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2
                || guessDigit1 == lotteryDigit3 || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
                || guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2
                || guessDigit3 == lotteryDigit3) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}