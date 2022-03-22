package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> militaryUnitList = new ArrayList<>();

    public int getArmySize() {
        return militaryUnitList.size();
    }

    public List<MilitaryUnit> addUnit(MilitaryUnit militaryUnit) {
        militaryUnitList.add(militaryUnit);
        return militaryUnitList;
    }

    public int getArmyDamage() {
        int damageInt = 0;
        for (MilitaryUnit militaryUnit : militaryUnitList) {
            damageInt += militaryUnit.getDamage();
        }
        return damageInt;
    }

    public void damageAll(int damage) {
        List<MilitaryUnit> deadMilitary = new ArrayList<>();
        for (MilitaryUnit militaryUnit : militaryUnitList) {
            int life = militaryUnit.getLife() - militaryUnit.sufferDamage(damage);
            if (life < 25) {
                deadMilitary.add(militaryUnit);
            } else {
                militaryUnit.setLife(life);
            }
        }
        militaryUnitList.removeAll(deadMilitary);
        deadMilitary.clear();
    }
}
