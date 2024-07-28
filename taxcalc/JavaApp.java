package old.taxcalc;

import java.util.Scanner;

//computing tax program!
public class JavaApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("choose your status from 1-4: \n1)single filer \n2)married "
                    + "jointly or qualifying widow \n3)married seperatly \n4)head of "
                    + "household");
            int status = in.nextInt();
            double income, tax = 0; // both should be double tax=0.15
            System.out.print("Please enter taxable income: ");
            income = in.nextDouble();

            // begin counting tax!
            if (status == 1) {
                if (income >= 0 && income <= 8350) {
                    tax = income * 0.10;
                } else if (income >= 8351 && income <= 33950) {
                    tax = 8350 * 0.10 + (income - 8350) * 0.15;
                } else if (income >= 33951 && income <= 82250) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                            (income - 33950) * 0.25;
                } else if (income >= 82251 && income <= 171550) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                            (82250 - 33950) * 0.25 + (income -
                                    82250) * 0.28;
                } else if (income >= 171551 && income <= 372950) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                            (82250 - 33950) * 0.25 + (171550 -
                                    82250) * 0.28
                            + (income - 171550) * 0.33;
                } else {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                            (82250 - 33950) * 0.25 + (171550 -
                                    82250) * 0.28
                            + (372950 - 171550) * 0.33
                            + (income - 372950) * 0.35;
                }
            }

            System.out.println("Tax is: " + (int) (tax * 100) / 100.0);
        } finally {
            in.close();
        }

    }

}
