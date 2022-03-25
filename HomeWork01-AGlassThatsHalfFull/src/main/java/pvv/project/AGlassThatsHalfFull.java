package pvv.project;

public class AGlassThatsHalfFull {
    public static void main(String[] args) {
        final int volumeGlass = 250;
        System.out.printf("Объем стакана %d мл.\n", volumeGlass);

        final double percentFillGlass = 81.3;
        System.out.printf("Стакан наполнен на %.2f%%.\n", percentFillGlass);

        final var volumeFillGlass = volumeGlass * percentFillGlass / 100;
        System.out.printf("В стакан налили %.2f мл.\n", volumeFillGlass);
    }
}
