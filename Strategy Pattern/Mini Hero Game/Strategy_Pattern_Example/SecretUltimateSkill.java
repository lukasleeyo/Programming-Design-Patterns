package Strategy_Pattern_Example;

public class SecretUltimateSkill implements Skill {
    @Override
    public int attack(Hero attackingHero, Hero attackedHero) {
        attackedHero.lostHp(10000);
        return 10000;
    }

    @Override
    public String toString() {
        return "Secret Ultimate Skill";
    }
}
