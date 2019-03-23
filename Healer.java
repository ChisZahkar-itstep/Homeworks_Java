package MOBA;

public class Healer extends Hero {
    public Healer(int health, int maxHealth, String type, int damage) {
        super(health, maxHealth, type, damage);
    }
    void hit(Hero[] team) {
        for(int i = 0; i < team.length; ++i){
            if(team[i].condition){
                team[i].causeDamage(damage);
                break;
            }
        }
    }
    boolean healing(Hero[] team) {
        for(int i = 0; i < team.length; ++i){
            if(team[i].condition && team[i].health < team[i].maxHealth){
                team[i].health += 20;
                if(team[i].health > team[i].maxHealth){
                    team[i].health = team[i].maxHealth;
                }
                return false;
            }
        }
        return true;
    }
}
