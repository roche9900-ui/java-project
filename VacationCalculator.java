/*
 *Ferdinand Roche
  *K63-11550-2024
  *Program to calculate the total cost of a vacation package
 */
public class VacationCalculator {

   
    public static double calculateTotalCost(double accommodationCost,
                                            double mealCost,
                                            double activityCost) {
        double total = accommodationCost + mealCost + activityCost;
        return total;
    }

    public static void main(String[] args) {
        double accommodation = 1200.50;
        double meals = 300.75;
        double activities = 150.25;

        double total = calculateTotalCost(accommodation, meals, activities);

       
        System.out.printf("Total cost:    $%.2f%n", total);
    }
}
