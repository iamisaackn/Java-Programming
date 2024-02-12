/*

In a country with a population of 14,000,000 people, 55% are females, 45% of the males are
empl0yed, and 25% 0f the females are employed. Write a program that will out put:
i. The male population in the country.
ii. The female population unemployed.
iii. The total number of people employed.

 */

public class PopulationStats {
    public static void main(String[] args) {

        // Parameters
        int totalPopulation = 14000000;
        double femalesPercentage = 0.55;
        double malesEmployedPercentage = 0.45;
        double femalesEmployedPercentage = 0.25;

        // Male Population
        int femalePopulation = (int)(totalPopulation * femalesPercentage);
        int malePopulation = (int) (totalPopulation - femalePopulation);
        System.out.println("The male population in the country: " + malePopulation);

        // Female Population Unemployed
        int femaleEmployed = (int) (femalePopulation * femalesEmployedPercentage);
        int femaleUnemployed = (int) (femalePopulation - femaleEmployed);
        System.out.println("The female population unemployed: " + femaleUnemployed);

        // total number of people employed
        int maleEmployed = (int) (malePopulation * malesEmployedPercentage);
        int totalEmployed = (int) (maleEmployed + femaleEmployed);
        System.out.println("The total number of people employed: " + totalEmployed);


    }
}