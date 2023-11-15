package octopath;

import java.util.Comparator;

public class BenniBrottsGelsComparator implements Comparator<BenniBrottsGels> {

    @Override
    public int compare(BenniBrottsGels o1, BenniBrottsGels o2) {
        if(o1.getFlavor().compareTo(o2.getFlavor()) == 0){
            return o1.getColor().compareTo(o2.getFlavor());
        }
        return o1.getFlavor().compareTo(o2.getFlavor());
    }
    
}
