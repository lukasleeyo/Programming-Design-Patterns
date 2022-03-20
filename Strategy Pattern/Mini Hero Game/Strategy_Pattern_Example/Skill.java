package Strategy_Pattern_Example;

public interface Skill {
    /**
     * @param attackingHero
     * @param attackedHero 
     * @return damaged HP
     */
     int attack(Hero attackingHero, Hero attackedHero);
}
