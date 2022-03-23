package pvv.project;

public class SarumanAndLannisters {
    public static void main(String[] args) {
        int countLannistersSolders = 500;
        int countSarumanOrcs = 237;
        int allMilitary = countLannistersSolders + countSarumanOrcs;
        System.out.println("В армии Ланнистеров " + countLannistersSolders + " солдат.");
        System.out.println("В армии Сарумана " + countSarumanOrcs + " орков.");
        System.out.println("Общее количество пехоты в союзе Ланнистеров и Сарумана " + allMilitary + " единиц.");
    }
}
