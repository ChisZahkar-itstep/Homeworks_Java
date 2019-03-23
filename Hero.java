package MOBA;

public abstract class Hero {
    protected int health;
    protected int maxHealth;
    protected String type;
    protected int damage;
    protected boolean condition = true;

    public Hero(int health, int maxHealth, String type, int damage){
        this.health = health;
        this.maxHealth = maxHealth;
        this.type = type;
        this.damage = damage;
    }

    abstract void hit(Hero[] h);
    abstract boolean healing(Hero[] h);

    void causeDamage(int damage){
        health -= damage;
        if(health <= 0){
            condition = false;
        }
    }
}
