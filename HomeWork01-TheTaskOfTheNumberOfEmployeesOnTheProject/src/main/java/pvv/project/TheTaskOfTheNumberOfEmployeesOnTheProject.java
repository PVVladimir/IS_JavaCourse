package pvv.project;

public class TheTaskOfTheNumberOfEmployeesOnTheProject {
    public static void main(String[] args) {
        int countProgrammers = 53;
        int countTestersPerOneProgrammer = 2;
        int countSupportsPerOneProgrammer = 3;
        int countTestersForProject = countProgrammers * countTestersPerOneProgrammer;
        int countSupportsForProject = countProgrammers * countSupportsPerOneProgrammer;
        int countAllEngineers = countTestersForProject + countSupportsForProject;
        System.out.println("Программистов на проекте " + countProgrammers + " работника");
        System.out.println("Необходимо тестировщиков на одного программиста " + countTestersPerOneProgrammer + " работника");
        System.out.println("Необходимо специалистов поддержки на одного программиста " + countSupportsPerOneProgrammer + " работников");
        System.out.println("Всего тестировщиков на проекте " + countTestersForProject + " работников");
        System.out.println("Всего специалистов поддержки на проекте = " + countSupportsForProject + " работников");
        System.out.println("Общее количество технических специалистов на проекте " + countAllEngineers + " работников");
    }
}
