import java.util.Scanner; 

public class Q4 {
  public static void main(String[] args) {
    Scanner calc = new Scanner(System.in);
    double v_i,v_f,t;
    
    // Enter username and press Enter
    System.out.println("Enter intial velocity m/s:"); 
    v_i = calc.nextDouble();   
    System.out.println("Enter final velocity in m/s:"); 
    v_f = calc.nextDouble();   
    System.out.println("Enter time in seconds:"); 
    t = calc.nextDouble();   
    double a = (v_f - v_i) / (t-0);

    System.out.println("The average acceleration is: " + a + " m/s^2.");        
  }
}

