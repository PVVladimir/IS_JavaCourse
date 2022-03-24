package pvv.project;

public class TheAgeOfTheUniverseVsTheAgeOfHumanity {
    public static void main(String[] args) {
        long ageUniverse = 13_000_000_000L;
        long ageHuman = 100_000L;
        long howManyTimesOlder = ageUniverse / ageHuman;
        System.out.println("Возраст Вселенной " + ageUniverse + " лет.");
        System.out.println("Возраст Человечества как вида " + ageHuman + " лет.");
        System.out.println("Вселенная в " + howManyTimesOlder + " раз старше людей.");
    }
}
