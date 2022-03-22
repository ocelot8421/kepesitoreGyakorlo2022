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
        int result = 0;
        if (armor) {
            result = damage / 2;
        } else {
            result = damage;
        }
        return result;
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

    @Override
    public int getLife() {
        return life;
    }

    @Override
    public void setLife(int life) {
        this.life = life;
    }

    @Override
    public int getDamage() {
        return damageGot;
    }

    @Override
    public void setDamage(int damage) {
        this.damageGot = damage;
    }
}
