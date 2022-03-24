package pvv.project;

public class TravelTime {
    public static void main(String[] args) {
        int pathFromHomeToOffice = 12;
        float avgTaxiSpeed = 60.5F;
        float pathTimeToWork = pathFromHomeToOffice / avgTaxiSpeed;
        float eveningTrafficDecelerationCoefficient = 0.5F;
        float pathTimeToHome = eveningTrafficDecelerationCoefficient * pathTimeToWork;
        System.out.printf("Расстояние от дом до работы %d км\n", pathFromHomeToOffice);
        System.out.printf("Средняя скорость такси %.2f км/ч\n", avgTaxiSpeed);
        System.out.printf("Время на путь от дома до офиса %.2f ч\n", pathTimeToWork);
        System.out.printf("Коэф-т замедления транспорта ветром %.2f ед\n", eveningTrafficDecelerationCoefficient);
        System.out.printf("Время на путь от работы до дома %.2f ч\n", pathTimeToHome);
    }
}
