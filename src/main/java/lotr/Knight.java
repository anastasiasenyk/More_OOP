package lotr;


import java.util.Random;

public class Knight extends lotr.Noble {

    @Override
    public String toString() {
        return "Knight{" +
                "hp=" + getHp() +
                ", power=" + getPower() +
                '}';
    }

    public Knight(){
        super(2, 12);
    }

    public void kick(Character c){
        Random rn = new Random();
        c.setHp(getHp() - rn.nextInt(getPower()));
    }

}
