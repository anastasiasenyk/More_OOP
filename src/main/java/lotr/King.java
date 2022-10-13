package lotr;


import java.util.Random;

public class King extends lotr.Noble{

    @Override
    public String toString() {
        return "King{" +
                "hp=" + getHp() +
                ", power=" + getPower() +
                '}';
    }

    public King(){
        super(5, 15);
    }

    public void kick(Character c){
        Random rn = new Random();
        if (c.getPower()>0){
            c.setHp(c.getHp() - rn.nextInt(c.getPower()));
        }

    }
}
