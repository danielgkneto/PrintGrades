import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        char doAgain = 'y';
        byte examScore;
        String grade;

        Scanner keyboard = new Scanner(System.in);

        while (doAgain == 'y') {
            doAgain = 'y';
            System.out.println("Enter an exam score: ");
            try {
                examScore = Byte.parseByte(keyboard.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Try again.");
                continue;
            }

            if ((examScore > 100) || (examScore < 0)) {
                System.out.println("Must be between 0 and 100. Try again.");
                continue;
            }
            else {
                if (examScore >= 97) grade = "A+";
                else if (examScore >= 94) grade = "A";
                else if (examScore >= 90) grade = "A-";
                else if (examScore >= 87) grade = "B+";
                else if (examScore >= 84) grade = "B";
                else if (examScore >= 80) grade = "B-";
                else if (examScore >= 77) grade = "C+";
                else if (examScore >= 74) grade = "C";
                else if (examScore >= 70) grade = "C-";
                else if (examScore >= 60) grade = "D";
                else grade = "Go back to school";
            }

            System.out.println("");
            System.out.println("Your grade is " + grade);

            System.out.println("");
            System.out.println("Do you want to enter another score? (Y/N)");
            doAgain = Character.toLowerCase(keyboard.nextLine().charAt(0));
        }
    }
}