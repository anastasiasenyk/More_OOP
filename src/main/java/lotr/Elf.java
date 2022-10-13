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
        Kick.elf_kick(this, c);
    }


}
