package pvv.project;

public class OfferSelection {
    public static void main(String[] args) {
        final double timeToWorkAndBackFirstCompany = 1.7;
        final int offerFirstCompany = 300_000;
        final double salaryPerHourFirstCompany = offerFirstCompany / (8 + timeToWorkAndBackFirstCompany);
        final double timeToWorkAndBackSecondCompany = 0.7;
        final int offerSecondCompany = 120_000;
        final double salaryPerHourSecondCompany = offerSecondCompany / (8 + timeToWorkAndBackSecondCompany);
        if (salaryPerHourFirstCompany > salaryPerHourSecondCompany){
            System.out.println("Программисту стоит выбрать первую компанию.");
        } else {
            System.out.println("Программисту стоит выбрать вторую компанию.");
        }
    }
}
