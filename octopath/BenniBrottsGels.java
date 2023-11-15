package octopath;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BenniBrottsGels implements Comparable<BenniBrottsGels>{
    private String flavor;
    private String color;

    public String getFlavor() {
        return flavor;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    public BenniBrottsGels(String flavor, String color) {
        this.flavor = flavor;
        this.color = color;
    }

    @Override
    public int compareTo(BenniBrottsGels o) {
        if(this.color.compareTo(o.getColor()) == 0){
            return this.flavor.compareTo(o.getFlavor());
        }
        return this.color.compareTo(o.getColor());
    }

    public static void main(String[] args){
        BenniBrottsGels b1 = new BenniBrottsGels("Coconut","Red");
        BenniBrottsGels b2 = new BenniBrottsGels("Chocolate","White");
        BenniBrottsGels b3 = new BenniBrottsGels("Coconut","White");
        BenniBrottsGels b4 = new BenniBrottsGels("Mint","Green");

        List<BenniBrottsGels> l = new LinkedList<>();
        l.add(b1);
        l.add(b2);
        l.add(b3);
        l.add(b4);

        Collections.sort(l);

        for(BenniBrottsGels b : l){
            System.out.println(b);
        }
       
    }

    @Override
    public String toString() {
        return color + "-colored, " + flavor + "-flavored beans";
    }
}
