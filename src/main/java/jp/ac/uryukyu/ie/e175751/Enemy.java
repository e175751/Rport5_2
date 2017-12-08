package jp.ac.uryukyu.ie.e175751;


public class Enemy extends LivingThing {


    public Enemy(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);

    }

    @Override
    public void wounded(int damage) {
        int hp = getHitPoint();
        String na = getName();
        boolean de = getIsdead();
        hp -= damage;
        setHitPoint(hp);
        if (hp < 0) {
            de = true;
            setIsdead(de);
            System.out.printf("モンスター%sは倒れた。\n", na);
        }
    }


    @Override
    public void attack(LivingThing opponent){

        if (isDead() == false) {
            int damage = (int) (Math.random() * getAttack());
            double probability = Math.random();
            if (0 == damage) {
                System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！\n", getName(), opponent.getName());

            } else {
                if (probability < 0.3) {
                    int ínjury = damage * 2;
                    System.out.printf("%sの攻撃！痛恨の一撃！！%sに%dのダメージを与えた！\n", getName(), opponent.getName(), ínjury);
                } else {
                    System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
                    opponent.wounded(damage);
                }
            }
        }
    }
}

