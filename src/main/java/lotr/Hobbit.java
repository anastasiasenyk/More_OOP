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
        toCry();
    }

    private void toCry(){
        System.out.println("       / Hobbit crying... ;(    =>   +1 to power");
        setPower(getPower()+1);
    }

}
