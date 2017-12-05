package jp.ac.uryukyu.ie.e175751;


public class Hero extends LivingThing {


    public Hero (String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);

    }


    @Override
    public void wounded(int damage){
        int hp=getHitPoint();
        String na=getName();
        Boolean de=getIsdead();
        hp -= damage;
        setHitPoint(hp);
        if( hp < 0 ) {
            de = true;
            setIsdead(de);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", na);
        }
    }
}