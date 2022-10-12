package lotr;


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
}
