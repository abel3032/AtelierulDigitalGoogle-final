package two_fighters.Fighter;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    public void attack(Fighter fighter){
        fighter.health=fighter.health-this.damagePerAttack;
    }

    public int getHealth()
    {
        return health;
    }

    public String getName()
    {
        return name;
    }

    public Fighter(String name, int health, int damagePerAttack)
    {
        this.name=name;
        this.health=health;
        this.damagePerAttack=damagePerAttack;
    }
}