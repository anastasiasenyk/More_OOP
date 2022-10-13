package lotr;

public class GameManager {

    public void fight(Character c1, Character c2){
        String name1 = c1.getClass().getSimpleName();
        String name2 = c2.getClass().getSimpleName();
        System.out.println("Fight between " + name1 + " and " + name2);

        while (c1.getHp()>0 && c2.getHp()>0 && c1.getPower()>=0 && c2.getPower()>=0){
            System.out.println(" " + name1 + " kick " + name2);
            c1.kick(c2);
            System.out.println(c1.info());
            System.out.println(c2.info());
            if (c2.getHp()>0){
                System.out.println(" " + name2 + " kick " + name1);
                c2.kick(c1);
                System.out.println(c1.info());
                System.out.println(c2.info());
            }
        }
        if (c1.getHp() <= 0 || c1.getPower() < 0){
            System.out.println("---> " + name2 + " killed " + name1 + " <---");
        } else {
            System.out.println("---> " + name1 + " killed " + name2 + " <---");
        }


    }
};
