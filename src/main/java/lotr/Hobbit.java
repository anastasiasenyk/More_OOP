package lotr;


public class Hobbit extends lotr.Character{

    @Override
    public String toString() {
        return "Hobbit{" +
                "hp=" + getHp() +
                ", power=" + getPower() +
                '}';
    }

    public Hobbit(){
        super(3, 0);
    }

    public void kick (Character c){
//        super.kick(c);
//        toCry();
    }


}
