/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ragnaroggame;
import java.util.ArrayList;

public class Monster {
   
    
    private double monAttack;
    private double health;

    public Monster( double health,double monAttack) {
        this.monAttack = monAttack;
        this.health = health;
    }
    
    public String showData(){
        String data;
        data = "\nHp:"+ String.format("%.02f",health) + "\nMonster Attack:" + String.format("%.02f",monAttack);
        return data;
    }
  
    
}
