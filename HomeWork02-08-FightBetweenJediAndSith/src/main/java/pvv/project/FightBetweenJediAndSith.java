package pvv.project;

public class FightBetweenJediAndSith {
    public static void main(String[] args) {
        final int heightJedi = 15;
        final String nameJedi = "Оби Ван";
        final int heightSith = 12;
        final String nameSith = "Паладин";
        if (nameSith == "Паладин" || heightJedi == heightSith && !(nameJedi == "Оби Ван" && nameSith == "Дарт Мол")) {
            System.out.println("Ситх победит!");
        } else {
            System.out.println("Джедай победит!");
        }
    }
}
