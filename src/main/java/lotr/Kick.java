package lotr;

import java.util.Random;

public class Kick {

    public static void king_kick(Character c, Character enemy){
        Random rn = new Random();
        if (enemy.getPower()>0){
            enemy.setHp(enemy.getHp() - rn.nextInt(enemy.getPower()));
            c.setPower(c.getPower()-1);
        }
    }

    public static void elf_kick(Elf c1, Character enemy){
        if (enemy.getPower()<c1.getPower()){
            enemy.setHp(0);
        } else {
            enemy.setPower(enemy.getPower()-1);
        }
    }

    public static void hobbit_kick(Hobbit c, Character enemy){
        System.out.println("       / Hobbit crying... ;(    =>   +1 to power");
        c.setPower(c.getPower()+1);
        if (enemy.getPower()>0) {
            enemy.setPower(enemy.getPower() - 1);
        }
    }
}
