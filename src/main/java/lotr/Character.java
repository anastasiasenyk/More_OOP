package lotr;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public abstract class Character {
    private int hp;
    public int power;

    public Character(int hp, int power){
        setHp(hp);
        setPower(power);
    }

    public void setHp(int hp){
        if (hp<0) {
            hp=0;
        }
        this.hp = hp;
    }

    public void kick(Character c){
        c.setHp(getHp() - c.getPower());
        this.hp -= c.getPower();
    }

    public boolean isAlive(){
        return hp>0;
    }

    public String info(){
        return "    " + getClass() + " power: " + getPower() +" hp: " + getHp();
    }

}
