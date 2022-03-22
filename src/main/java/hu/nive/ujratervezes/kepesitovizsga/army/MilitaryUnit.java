package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {
    protected int life;
    private int damage;

    public abstract int doDamage();

    public abstract int sufferDamage(int damage);

    public abstract int getHitPoints();

    public abstract int getLife();

    public abstract void setLife(int life);

    public abstract int getDamage();

    public abstract void setDamage(int damage);
}
