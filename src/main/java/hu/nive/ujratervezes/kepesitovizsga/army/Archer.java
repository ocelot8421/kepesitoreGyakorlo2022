package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit {

    private int life = 50;
    private int damage = 20;

    public Archer() {
    }

    @Override
    public int doDamage() {
        return damage;
    }

    @Override
    public int sufferDamage(int damage) {

        return damage;
    }

    @Override
    public int getHitPoints() {
        return life - damage;
    }

}
