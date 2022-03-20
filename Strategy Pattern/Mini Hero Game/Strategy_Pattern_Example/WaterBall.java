package Strategy_Pattern_Example;

public class WaterBall implements Skill {
    @Override
    public int attack(Hero attackingHero, Hero attackedHero) {
        attackingHero.lostMp(5);
        int injury = attackingHero.getWisdom()*2;
        attackedHero.lostHp(injury);
        return injury;
    }

    @Override
    public String toString() {
        return "WaterBall";
    }
}
