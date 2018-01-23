
import java.util.Scanner;

public class C7_1 {

    public static int best = 0;

    public static void main(String args[]) {
        char grade;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Students: ");
        int scores[] = new int[input.nextInt()];
        System.out.printf("Enter %d Scores: ", scores.length);
        fillArray(scores, input);
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= (best - 10)) {
                grade = 'A';
            } else if (scores[i] >= (best - 20)) {
                grade = 'B';
            } else if (scores[i] >= (best - 30)) {
                grade = 'C';
            } else if (scores[i] >= (best - 40)) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.printf("Student %d  Score is %d and Grade is %c \t", i, scores[i], grade);

        }
    }

    public static void fillArray(int scores[], Scanner input) {

        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
            if (scores[i] > best) {
                best = scores[i];
            }
        }
    }
}
