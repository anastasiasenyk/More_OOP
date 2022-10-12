package lotr;


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

}
