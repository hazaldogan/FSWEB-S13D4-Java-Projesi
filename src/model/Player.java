package model;

public class Player {

    private String name;
    private int healtPersentage;
    private Weapon weapon;

    private void checkHealth(int healtPersentage){
        if(healtPersentage<0){
            this.healtPersentage=0;
        }
        if(healtPersentage>100){
            this.healtPersentage=100;
        }
    }
    public Player(String name, int healtPersentage, Weapon weapon) {
        this.name = name;
        this.healtPersentage=healtPersentage;
        checkHealth(this.healtPersentage);
        this.weapon = weapon;
    }

    public int healtRemaining(){
        return healtPersentage;
    }

    public void loseHealth(int damage){
        int healthRemain = healtPersentage-damage;
        if(healthRemain<=0){
            System.out.println(name + " player has been knocked out of game");
        }
        healtPersentage = healthRemain;
        checkHealth(healtPersentage);
    }

    public void restoreHealth(int healthPotion){
        healtPersentage += healthPotion;
        checkHealth(healtPersentage);

    }

    @Override
    public String toString() {
        return "Name: " + name + " HealthPercentage: " + healtPersentage +
                " Weapon: " + (weapon.getDamage() + " - " + weapon.getAttackSpeed()) +
                " Damage Deal: " + weapon.getDamage()* weapon.getAttackSpeed();
    }
}
