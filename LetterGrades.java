import java.util.Scanner;

public class LetterGrades {
    public static void main(String[] args) {
        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integer grades in the range 0-100.");
        System.out.println("Type -1 to end input.");

        int grade;
        while (true) {
            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();

            if (grade == -1) {
                break; // Sai do loop se a sentinela for inserida
            }

            // Verifica se a nota está no intervalo válido (0-100)
            if (grade < 0 || grade > 100) {
                System.out.println("Grade must be between 0 and 100. Please try again.");
                continue; // Volta ao início do loop
            }

            total += grade;
            ++gradeCounter;

            switch (grade / 10) {
                case 9:
                case 10:
                    ++aCount;
                    break;
                case 8:
                    ++bCount;
                    break;
                case 7:
                    ++cCount;
                    break;
                case 6:
                    ++dCount;
                    break;
                default:
                    ++fCount;
                    break;
            }
        }

        input.close(); // Fecha o scanner

        System.out.println("\nGrade Report:\n");

        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;

            System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n%n", average);
            System.out.println("Number of students who received each grade:");
            System.out.printf("A: %d%n", aCount);
            System.out.printf("B: %d%n", bCount);
            System.out.printf("C: %d%n", cCount);
            System.out.printf("D: %d%n", dCount);
            System.out.printf("F: %d%n", fCount);
        } else {
            System.out.println("No grades were entered.");
        }
    }
}