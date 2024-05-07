/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoparty;

/**
 *
 * @author ephraimbonifacio
 */
public class DinnerParty extends Party {
    
    private int foodChoice;
    
    private int getFoodChoice() {
        return foodChoice;
    }
    
    public void setFoodChoice(int choice) {
        choice = foodChoice;
    }
    @Override
    public void showInvitation() {
        System.out.println("Please come to my dinner party!");
    }
    
}
