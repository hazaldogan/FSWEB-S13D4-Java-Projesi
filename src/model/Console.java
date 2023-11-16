package model;

public class Console {
    public static void main(String[] args) {
        Player hazal = new Player("Hazal",-100,Weapon.SWORD);
        Player bugra = new Player("Buğra",1000,Weapon.AXE);

        System.out.println(hazal);
        hazal.restoreHealth(100);
        hazal.loseHealth(40);
        hazal.healtRemaining();
        bugra.loseHealth(20);
        bugra.healtRemaining();
        System.out.println(bugra);
        System.out.println(hazal);
    }
}
