package pvv.project;

public class PinokioAndApple {
    public static void main(String[] args) {
        final int countPinokioApple = 25;
        System.out.println("У Буратино было " + countPinokioApple + " яблок.");

        final int takeKarabasBarabasApple = 3;
        System.out.println("Карабас Барабас забрал у него " + takeKarabasBarabasApple + " яблока.");

        final int leftPinokioApple = countPinokioApple - takeKarabasBarabasApple;
        System.out.println("У Буратино осталось всего " + leftPinokioApple + " яблока.");
    }
}
