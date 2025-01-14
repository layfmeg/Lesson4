public class Main {

    public static void main(String[] args) {
        int numberOfCats = 8;
        int numberOfDogs = 24;
        int mealPortionInGrams = 50;
        double mealCostPerPortion = 2.0;
        int mealsPerDay = 3;
        int daysInMonth = 30;

        int monthlyCatFood = calculateMonthlyFood(numberOfCats, mealPortionInGrams, mealsPerDay, daysInMonth);
        int monthlyDogFood = calculateMonthlyFood(numberOfDogs, mealPortionInGrams, mealsPerDay, daysInMonth);
        double monthlyCost = calculateMonthlyCost(numberOfCats, numberOfDogs, mealCostPerPortion, mealsPerDay, daysInMonth);

        System.out.println("Корма для котов в месяц: " + monthlyCatFood + " грамм");
        System.out.println("Корма для собак в месяц: " + monthlyDogFood + " грамм");
        System.out.println("Затраты на содержание приюта в месяц: " + monthlyCost + " долларов");
    }

    public static int calculateMonthlyFood(int numberOfAnimals, int portionSize, int mealsPerDay, int daysInMonth) {
        return numberOfAnimals * portionSize * mealsPerDay * daysInMonth;
    }

    public static double calculateMonthlyCost(int numberOfCats, int numberOfDogs, double costPerPortion, int mealsPerDay, int daysInMonth) {
        int totalMeals = (numberOfCats + numberOfDogs) * mealsPerDay * daysInMonth;
        return totalMeals * costPerPortion;
    }
}
