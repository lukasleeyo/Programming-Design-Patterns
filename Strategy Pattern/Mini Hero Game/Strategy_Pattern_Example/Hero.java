package Strategy_Pattern_Example;

import commons.MpNotEnoughException;

public class Hero {
    private String name;
    private int hp = 500;
    private int mp = 200;
    private int strength = 150;
    private int wisdom = 80;
    private int defense = 50;
    private Skill skill;

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public void attack(Hero targetHero) {
        int injury = skill.attack(this, targetHero);
        System.out.printf("%s used %s, damage value %d.\n",
                getName(), skill, injury);
        System.out.printf("%s's Hp left with %d.\n", targetHero.getName(),
                targetHero.getHp());

        if (!targetHero.isAlive()) {
            System.out.printf("%s has died.\n", targetHero.getName());
        }
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void lostHp(int hp) {
        setHp(getHp() - hp);
    }

    public void lostMp(int mp) {
        if (getMp() < mp) {
            throw new MpNotEnoughException();
        }
        setMp(getMp() - mp);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp <= 0 ? 0 : hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
