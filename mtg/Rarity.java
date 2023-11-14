package mtg;

public enum Rarity {
    COMMON(11, "Common"),    
    UNCOMMON(3,"Uncommon"),
    RARE(1,"Rare");

    private int value;
    private String name;

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    private Rarity(int value, String name){
        this.value = value;
        this.name = name;
    }
}
