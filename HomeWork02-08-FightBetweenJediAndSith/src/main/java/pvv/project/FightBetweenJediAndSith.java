package pvv.project;

public class FightBetweenJediAndSith {
    public static void main(String[] args) {
        final int heightJedi = 15;
        final String nameJedi = "Оби Ван";
        final int heightSith = 12;
        final String nameSith = "Паладин";
        if (nameSith.equals("Паладин") || heightJedi == heightSith && !(nameJedi.equals("Оби Ван") && nameSith.equals("Дарт Мол"))) {
            System.out.println("Ситх победит!");
        } else {
            System.out.println("Джедай победит!");
        }
    }
}
