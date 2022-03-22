package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {

    private int life = 150;
    private int damage = 20;
    private int damageCounter = 1;

    @Override
    public int doDamage() {
        int result;
        if (damageCounter == 1) {
            damageCounter += 1;
            result = damage * 3;
        } else {
            result = damage;
        }
        return result;
    }

    @Override
    public int sufferDamage(int damage) {
        return 0;
    }

    @Override
    public int getHitPoints() {
        return life - damage / 2;
    }
}
