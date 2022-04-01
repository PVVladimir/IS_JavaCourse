package pvv.project;

public class IdealWeight {
    public static void main(String[] args) {
        final double personWeight = 49.8;
        final double personHeight = 179.5;
        if ((personHeight - 100) * 0.90 - 5 <= personWeight && personWeight <=(personHeight - 100) * 0.90 + 5) {
            System.out.println("Идеальный вес");
        }else {
            System.out.println("Не идеальный вес");
        }
    }
}
