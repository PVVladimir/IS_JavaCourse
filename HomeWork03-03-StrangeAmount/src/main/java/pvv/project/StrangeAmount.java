package pvv.project;

public class StrangeAmount {
    public static void main(String[] args) {
        boolean plus = true;
        int sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            if (plus) {
                sum1 += i;
            } else {
                sum1 -= i;
            }
            plus = !plus;
        }
        System.out.println("sum = " + sum1);

        int multiple = 1;
        int sum2 = 0;
        for (int i = 1; i <= 100; i++) {
            sum2 += i * multiple;
            multiple = -multiple;
        }
        System.out.println("sum = " + sum2);

        int sum3 = 0;
        for (int i = 1; i < 100; i = i + 2) {
            sum3 += i - (i + 1);
        }
        System.out.println("sum = " + sum3);

        int sum4 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                sum4 += i;
            } else {
                sum4 -= i;
            }
        }
        System.out.println("sum = " + sum4);

        int sum5plus = 0;
        int sum5minus = 0;
        for (int i = 1; i < 100; i = i + 2) {
            sum5plus += i;
            sum5minus -= i + 1;
        }
        System.out.println("sum = " + (sum5plus + sum5minus));

        int a1 = 1;
        int a50 = 99;
        int b1 = 2;
        int b50 = 100;
        int n = 50;
        int sum6plus = (a1 + a50) * n / 2;
        int sum6minus = (b1 + b50) * n / 2;
        System.out.println("sum = " + (sum6plus - sum6minus));
    }
}
