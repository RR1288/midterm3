package octopath;

public class Scholar extends Hero{

    public Scholar(String name) {
        super(name);
        this.setMaxHitPoints(200);
        this.setAttack(104); //Fire Storm half of attack stat
        this.setDefense(72);
        this.setDefense(88);
        this.setBoostPoints(0);
    }

    @Override
    public int attack(Hero target, int boostUsed) {
        int dmg = 0;
        //1BP 15%
        dmg += this.getAttack()*(boostUsed*0.15); 
        //gains 1 BP 
        if(boostUsed == 0){
            this.setBoostPoints(this.getBoostPoints() - boostUsed + 1);
        }
        //unless BP was used before
        //reduce 10% of defense
        dmg = dmg - (int)(this.getDefense()*0.1);

        target.setCurrentHitPoints(target.getCurrentHitPoints() - dmg);

        return dmg;
    }
    
}
