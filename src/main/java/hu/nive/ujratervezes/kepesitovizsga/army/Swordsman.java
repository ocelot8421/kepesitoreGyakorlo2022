package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {
    private int life = 100;
    private int damageGot;
    private int damageGive = 10;
    private int damageCounter = 1;
    private boolean shield = true;
    private boolean armor;

    public Swordsman(boolean shield) {
        this.armor = shield;
    }

    @Override
    public int doDamage() {
        return damageGive;
    }

    @Override
    public int sufferDamage(int damage) {
        if (armor) {
            this.damageGot = damage / 2;
        } else {
            this.damageGot = damage;
        }
        return this.damageGot;
    }

    @Override
    public int getHitPoints() {
        int result;
        if (damageCounter == 1) {
            damageCounter += 1;
            shield = false;
            result = life;
        } else {
            result = life - damageGot;
        }
        return result;
    }
}
