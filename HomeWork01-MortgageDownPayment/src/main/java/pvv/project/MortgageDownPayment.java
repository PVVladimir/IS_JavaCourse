package pvv.project;

public class MortgageDownPayment {
    public static void main(String[] args) {
        int apartmentPrice = 17_158_960;
        float downPaymentPercentage = 33.7F;
        float downPaymentAmount = apartmentPrice * downPaymentPercentage / 100;
        System.out.println("Стоимость квартиры " + apartmentPrice + " y.e.");
        System.out.println("Процент первоначального взноса " + downPaymentPercentage + " y.e.");
        System.out.println("Сумма первоначального взноса " + downPaymentAmount + " y.e.");
    }
}
