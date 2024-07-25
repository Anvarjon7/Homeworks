package de.telran.algorithms.codewars;

public class Fighter {

    private String fighterName;
    private int health,damagePerAttack;

    public Fighter(String fighterName, int health, int damagePerAttack) {
        this.fighterName = fighterName;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public String getFighterName() {
        return fighterName;
    }

    public void setFighterName(String fighterName) {
        this.fighterName = fighterName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }

    public void setDamagePerAttack(int damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }
}

class Solution{

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Anvar", 10, 3);
        Fighter fighter2 = new Fighter("Abror",8,2);

        System.out.println(declareWinner(fighter1,fighter2,"Anvar"));
    }

    private static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        Fighter attacker = firstAttacker.equals(fighter1.getFighterName()) ? fighter1 : fighter2;
        Fighter defender = firstAttacker.equals(fighter1.getFighterName()) ? fighter2 : fighter1;

        while(fighter1.getHealth() > 0 && fighter2.getHealth() > 0){
            defender.setHealth(defender.getHealth() - attacker.getDamagePerAttack());

            if (defender.getHealth() <= 0){
                return attacker.getFighterName();
            }

            Fighter temp = attacker;
            attacker = defender;
            defender = temp;
        }

        return "No winner";
    }
}