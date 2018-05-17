/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneer.trial.game.model;

import java.io.Serializable;

/**
 *
 * @author Isaias
 */
public class Player implements Serializable{
    //class instance variables
    private String name;
    private double bestScore;
    private double totalDistTraveled;
    private int health;

    public Player() {
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBestScore() {
        return bestScore;
    }

    public void setBestScore(double bestScore) {
        this.bestScore = bestScore;
    }

    public double getTotalDistTraveled() {
        return totalDistTraveled;
    }

    public void setTotalDistTraveled(double totalDistTraveled) {
        this.totalDistTraveled = totalDistTraveled;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
}
