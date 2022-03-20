package BadExample;

public class Main {
   public static void main(String[] args) {
       Hero hero1 = new Hero("Brown Cat", Hero.Skill.COLLIDING);
       Hero hero2 = new Hero("MeowMao", Hero.Skill.WATERBALL);

       Battle battle = new Battle(hero1, hero2);
       battle.start();
   } 
}
