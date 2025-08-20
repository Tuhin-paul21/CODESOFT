import java.util.Scanner;

class range {

    public int genrate(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}

public class numbergame {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        range rg = new range();
        int TA = 0;
        int win = 0;

        while (true) {
            System.out.println("Enter the minimum number between 1 to 100:");
            int min = s.nextInt();
            System.out.println("Enter the maximum number greater than minimum  number :");
            int max = s.nextInt();
            s.nextLine();
            int c = rg.genrate(max, min);
            int A = 0;

            while (true) {
                System.out.println("Guesss a number between " + min + " and " + max + ":");
                int g = s.nextInt();
                A++;

                if (g > c) {
                    System.out.println("The given number is Greater:");
                } else if (g < c) {
                    System.out.println("The given Number is  lower:");

                } else {
                    System.out.println("Correct guess:");
                    win++;
                    break;
                }
            }
            TA = TA + A;
            System.out.println("Attempt=" + A);
            System.out.println("Wins=" + win);

            double winrate = (double) win / TA * 100;
            System.out.printf("your winrate is %.2f%%\n", winrate);
            System.out.println("Do you want to play again this game? (yes / no)");
            String PA = s.next();
            if (!PA.equalsIgnoreCase("yes")) {
                s.close();
                System.exit(0);

            }
            s.nextLine();
        }
    }
}
