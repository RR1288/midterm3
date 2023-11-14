package mtg;

public class MagicCard {
    private String name;
    private int power;
    private int toughness;
    private Rarity rarity;
    private String manaValue;
    private boolean isDiscarted;
    
    public MagicCard(String name, int power, int toughness, Rarity rarity, String manaValue) {
        this.name = name;
        this.power = power;
        this.toughness = toughness;
        this.rarity = rarity;
        this.manaValue = manaValue;
        this.isDiscarted = false;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getToughness() {
        return toughness;
    }
    public void setToughness(int toughness) {
        this.toughness = toughness;
    }
    public Rarity getRarity() {
        return rarity;
    }
    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }
    public String getManaValue() {
        return manaValue;
    }
    public void setManaValue(String manaValue) {
        this.manaValue = manaValue;
    }
    @Override
    public String toString() {
        return "MagicCard [name=" + name + ", power=" + power + ", toughness=" + toughness + ", rarity=" + rarity
                + ", manaValue=" + manaValue + "]";
    }

    public int getConvertedManaCost(){
        char[] manaChars = manaValue.toCharArray();

        int mana = 0;

        for(int i = 0; i < manaChars.length; i++){
            if(manaChars[i] < '9' && manaChars[i] > '0'){
                //if it is a number
                int val = manaChars[i] - '0';
                mana += val; 
            } else {
                mana += 1;
            }
        }
        return mana;
    }

    public boolean isDiscarted(){
        return isDiscarted;
    }

    public void discard(){
        this.isDiscarted = true;
    }

    public void attack(MagicCard blocker){
        int power = blocker.getPower();
        if(this.toughness - power > 0){
            this.toughness -= power;
        } else {
            blocker.discard();
        }
    }

    public static void main(String[] args){
        MagicCard card1 = new MagicCard("Dragon", 5, 30, Rarity.COMMON, "4RR");
        MagicCard card2 = new MagicCard("Auramancer", 2, 50, Rarity.COMMON, "4WW");

        System.out.println(card1);
        System.out.println(card2);

        while(!card1.isDiscarted() && !card2.isDiscarted()){
            card1.attack(card2);
            card2.attack(card1);
            System.out.println(card1);
            System.out.println(card2);
            System.out.println("-----------------------------------------------");
        }
    }

    
}
