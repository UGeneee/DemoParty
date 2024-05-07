/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demoparty;
import static java.awt.Event.END;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ephraimbonifacio
 */
public class DemoParty {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DinnerParty dinnerParty = new DinnerParty();
        
    try {    
        System.out.println("Enter the number of guests for the dinner party: ");
        int guest = sc.nextInt();
        dinnerParty.setNumGuests(guest);
        
        System.out.println("Enter the menu option (1 for chicken, 2 for beef): ");
        int food = sc.nextInt();
        if (food != 1 && food !=2) {
            System.out.println("Only option 1 and 2 are available."); 
            sc.close();
            return;  
        } 
        dinnerParty.setFoodChoice(food);
        
        System.out.println("The dinner party has " + guest + " guests.");
        System.out.println("Menu option " + food + " will be served.");
        dinnerParty.showInvitation();
       } catch (InputMismatchException err) {
           System.out.println("Error. Please input a number.");
       }
    } 
}
