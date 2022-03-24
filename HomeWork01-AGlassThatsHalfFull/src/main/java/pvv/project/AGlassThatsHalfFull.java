package pvv.project;

public class AGlassThatsHalfFull {
    public static void main(String[] args) {
        int volumeGlass = 250;
        double percentFillGlass = 81.3;
        var volumeFillGlass = volumeGlass * percentFillGlass / 100;
        System.out.printf("Объем стакана %d мл.\n", volumeGlass);
        System.out.printf("Стакан наполнен на %.2f%%.\n", percentFillGlass);
        System.out.printf("В стакан налили %.2f мл.\n", volumeFillGlass);
    }
}
