package pvv.project;

public class AGlassThatsHalfFull {
    public static void main(String[] args) {
        int volumeGlass;
        double percentFillGlass;
        int volumeFillGlass;
        volumeGlass = 250;
        volumeFillGlass = 200;
        percentFillGlass = (double) volumeFillGlass / (double) volumeGlass;
        System.out.printf("Объем стакана %d мл.\n", volumeGlass);
        System.out.printf("В стакан налили %d мл.\n", volumeFillGlass);
        System.out.printf("Стакан наполнен на %.2f%%.\n", percentFillGlass);
    }
}
