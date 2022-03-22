package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {
    protected int life;
    private int demage;

    public abstract int doDamage();

    public abstract int sufferDamage(int damage);

    public abstract int getHitPoints();

//    public int getLife() {
//        return life;
//    }
//
//    public void setLife(int life) {
//        this.life = life;
//    }
//
//    public int getDemage() {
//        return demage;
//    }
//
//    public void setDemage(int demage) {
//        this.demage = demage;
//    }
}
