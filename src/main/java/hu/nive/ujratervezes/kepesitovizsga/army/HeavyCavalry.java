package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {

    private int life = 150;
    private int damageGot = 20;
    private int damageCounter = 1;

    @Override
    public int doDamage() {
        int result;
        if (damageCounter == 1) {
            damageCounter += 1;
            result = damageGot * 3;
        } else {
            result = damageGot;
        }
        return result;
    }

    @Override
    public int sufferDamage(int damageGot) {
        return damageGot / 2;
    }

    @Override
    public int getHitPoints() {
        return life - damageGot / 2;
    }

    public int getLife() {
        return life;
    }

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
