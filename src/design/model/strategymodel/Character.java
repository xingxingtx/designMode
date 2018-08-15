package design.model.strategymodel;

/**
 * Created by Administrator on 2018/7/23.
 */
public abstract  class Character {
     private WeaponBehavior weapon;
     public abstract void fight();
     public void setWeapon(WeaponBehavior weapon){
            this.weapon = weapon;
    }
}
