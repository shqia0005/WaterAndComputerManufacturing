/*
 * To calc the total number of water.
 * Jessica Qiao
 * October 2,2018
 */

package waterandcomputermanufacturing;
import java.util.Scanner;

/**
 *
 * @author shqia0005
 */
public class WaterAndComputerManufacturing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        int num1;
        double num2;
       
        double water = 1.5;
        
        System.out.print("Enter your number of computer/monitor combos ");
        num1 = keyedInput.nextInt();
        num2 = num1 * water;
        System.out.print("the total number of water is " + num2 +"tons");
        num2 = num1 * water;
    }
    
}
