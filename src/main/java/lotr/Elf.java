package lotr;


public class Elf extends lotr.Character{
    @Override
    public String toString() {
        return "Elf{" +
                "hp=" + getHp() +
                ", power=" + getPower() +
                '}';
    }

    public Elf(){
        super(10, 10);
    }

    public void kick (Character c){
        if (c.getPower()<getPower()){
            c.setHp(0);
        } else {
            c.setPower(c.getPower()-1);
        }
    }


}
