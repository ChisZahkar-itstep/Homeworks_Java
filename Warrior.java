package MOBA;

public class Warrior extends Hero{
    public Warrior(int health, int maxHealth, String type, int damage) {
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
    boolean healing(Hero[] h){
        return true;
    }
}