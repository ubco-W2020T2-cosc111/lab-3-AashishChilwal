// Boilerplate for Lab Question 6
import java.util.Scanner; 

public class Q6 {
  public static void main(String[] args) {
    Scanner distance = new Scanner(System.in);
    int x1,x2,y1,y2;
    double dist;
    System.out.printf("Enter x1 and y1: ");
    x1 = distance.nextInt();   
    y1 = distance.nextInt();  
    System.out.printf("Enter x2 and y2: ");
    x2 = distance.nextInt();
    y2 = distance.nextInt();
    dist = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    System.out.println("The distance of the two points is " + dist);
   }
}
