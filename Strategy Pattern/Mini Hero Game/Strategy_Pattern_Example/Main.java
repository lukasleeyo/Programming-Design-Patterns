package Strategy_Pattern_Example;

public class Main {
   public static void main(String[] args) {
       Hero hero1 = new Hero("Brown Cat", new Colliding());
       Hero hero2 = new Hero("MeowMao", new SecretUltimateSkill());

       Battle battle = new Battle(hero1, hero2);
       battle.start();
   } 
}
