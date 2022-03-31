package pvv.project;

public class IdealWeight {
    public static void main(String[] args) {
        final double personWeight = 49.8;
        final double personHeight = 179.5;
        final boolean idealWeight = (personHeight - 100) * 0.9 >= personWeight - 5 && (personHeight - 100) * 0.9 <= personWeight + 5;
        if (idealWeight) {
            System.out.println("Идеальный вес");
        }else {
            System.out.println("Не идеальный вес");
        }
    }
}
