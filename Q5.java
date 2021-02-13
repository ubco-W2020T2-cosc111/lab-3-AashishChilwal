// Boilerplate for Lab Question 5
import java.util.Scanner; 
public class Q5 {
    public static void main(String[] args) {
    Scanner distance = new Scanner(System.in);
   double cost, dist, fuel_economy, total_cost;
    System.out.printf("Enter fuel cost in (L/$): ");
    cost = distance.nextDouble();   
    System.out.printf("Enter distance travelled in (km): ");
    dist = distance.nextDouble();
    System.out.printf("Enter fuel economy in (L/100): ");
    fuel_economy = distance.nextDouble();
    total_cost = (dist/fuel_economy)*cost;
	System.out.println("The total cost of a " + dist + " km road trip, with fuel economy " + fuel_economy+ " L/100 km, and an average fuel cost of " + cost + " $/L is: $"+total_cost);
   }
}
