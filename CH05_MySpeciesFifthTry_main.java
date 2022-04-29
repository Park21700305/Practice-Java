//CH05_실습_21700305_박지성

import java.util.Scanner;

public class CH05_MySpeciesFifthTry_main {
    public static void main(String[] args) {
        CH05_MySpeciesFifthTry speciesOfTheMonth = new CH05_MySpeciesFifthTry();
        System.out.println("Enter number of years to project:");
        Scanner keyboard = new Scanner(System.in);
        int numberOfYears = keyboard.nextInt();
        System.out.println(
                "Enter data on the Species of the Month:");
        speciesOfTheMonth.readInput();
        speciesOfTheMonth.writeOutput();
        int futurePopulation =
                speciesOfTheMonth.predictPopulation(numberOfYears);
        System.out.println("In " + numberOfYears +
                " years the population will be " +
                futurePopulation);

        speciesOfTheMonth.setName("Klingon ox");
        speciesOfTheMonth.setPopulation(10);
        speciesOfTheMonth.setGrowthRate(15.0);
        System.out.println("The new Species of the Month:");
        speciesOfTheMonth.writeOutput();
        futurePopulation =
                speciesOfTheMonth.predictPopulation(numberOfYears);
        System.out.println("In " + numberOfYears +
                " years the population will be " +
                futurePopulation);
    }
}