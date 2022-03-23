package pvv.project;

public class PinokioAndApple {
    public static void main(String[] args) {
        int countPinokioApple = 25;
        int takeKarabasBarabasApple = 3;
        int leftPinokioApple = countPinokioApple - takeKarabasBarabasApple;
        System.out.println("У Буратино было " + countPinokioApple + " яблок.");
        System.out.println("Карабас Барабас забрал у него " + takeKarabasBarabasApple + " яблока.");
        System.out.println("У Буратино осталось всего " + leftPinokioApple + " яблока.");
    }
}
