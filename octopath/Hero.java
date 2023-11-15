package octopath;

public abstract class Hero {
    private String name;
    private int boostPoints;
    private int maxHitPoints;
    private int currentHitPoints;
    private int attack;
    private int defense;
    
    public Hero(String name) {
        this.name = name;
    }

    public abstract int attack(Hero target, int boostUsed);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBoostPoints() {
        return boostPoints;
    }

    public void setBoostPoints(int boostPoints) {
        this.boostPoints = boostPoints;
    }

    public int getMaxHitPoints() {
        return maxHitPoints;
    }

    public void setMaxHitPoints(int maxHitPoints) {
        this.maxHitPoints = maxHitPoints;
    }

    public int getCurrentHitPoints() {
        return currentHitPoints;
    }

    public void setCurrentHitPoints(int currentHitPoints) {
        this.currentHitPoints = currentHitPoints;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    

}
