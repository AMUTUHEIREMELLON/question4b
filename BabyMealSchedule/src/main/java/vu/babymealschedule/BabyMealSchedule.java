
package vu.babymealschedule;

/**
 *
 * @author Amutuheire
 */
public class BabyMealSchedule {
    public static void main(String[] args) {
        double porridgeLiters = 2.0;
        double milkLiters = 2.0;
        double cupSize = 0.5; // Half a liter
        int porridgeInterval = 45; // Minutes
        int milkInterval = 30; // Minutes

        int porridgeFeedings = (int) (porridgeLiters / cupSize); // 4 feedings
        int milkFeedings = (int) (milkLiters / cupSize); // 4 feedings

        int totalFeedings = porridgeFeedings + milkFeedings;
        int currentPorridge = 0;
        int currentMilk = 0;
        int currentTime = 0;

        System.out.println("Feeding Schedule:");
        while (currentPorridge < porridgeFeedings || currentMilk < milkFeedings) {
            // Feed porridge if available
            if (currentPorridge < porridgeFeedings) {
                System.out.printf("Time %d min: Feed %.1fL porridge (Remaining: %.1fL)%n",
                        currentTime, cupSize, porridgeLiters - (currentPorridge + 1) * cupSize);
                currentPorridge++;
                currentTime += porridgeInterval;
            }
            // Feed milk if available
            if (currentMilk < milkFeedings) {
                System.out.printf("Time %d min: Feed %.1fL milk (Remaining: %.1fL)%n",
                        currentTime, cupSize, milkLiters - (currentMilk + 1) * cupSize);
                currentMilk++;
                currentTime += milkInterval;
            }
        }

        System.out.printf("Total time to finish both: %d minutes%n", currentTime);
    }
}