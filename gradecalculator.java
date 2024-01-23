import java.util.Scanner;

public class gradecalculator {
    public static void main(String[] args) {
        int s1, s2, s3, s4, s5, percentage, total;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maths  mark:");
        s1 = sc.nextInt();
        System.out.print("Enter Science mark:");
        s2 = sc.nextInt();
        System.out.print("Enter English mark:");
        s3 = sc.nextInt();
        System.out.print("Enter History mark:");
        s4 = sc.nextInt();
        System.out.print("Enter Geography mark:");
        s5 = sc.nextInt();
        total = s1 + s2 + s3 + s4 + s5;
        System.out.println("Enter the total mark:" + total);
        percentage = (total * 100) / 500;
        System.out.println("percentage : " + percentage);

        if (percentage >= 90) {
            System.out.print("Grade : A");
        } else if (percentage >= 75) {
            System.out.print("Grade : B");
        } else if (percentage >= 65) {
            System.out.print("Grade : C");
        } else if (percentage >= 35) {
            System.out.print("Grade : D");
        } else {
            System.out.print("You are fail");
        }

    }

}
