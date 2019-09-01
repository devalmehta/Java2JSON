package querybuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bool {
    private List<Must> must = new ArrayList<Must>();
    private List<Should> should = new ArrayList<Should>();

    public List<Must> getMust() {
        return must;
    }

    public void setMust(List<Must> must) {
        this.must = must;
    }

    public List<Should> getShould() {
        return should;
    }

    public void setShould(List<Should> should) {
        this.should = should;
    }

    public Bool(List<Must> must, List<Should> should){
        this.must = must;
        this.should = should;
    }
    public Bool(){

    }

    @Override
    public String toString() {
        return "Bol{" +
                "must=" + must +
                ", should=" + should +
                '}';
    }

    public Bool mustMatch(String item, String itemName) {
        Map<String,String> mustMatch = new HashMap<String, String>();
        mustMatch.put(item, itemName);
        Must must = new Must(mustMatch);
        this.getMust().add(must);
        return this;
    }

    public Bool shouldMatch(String productLocation, String locationName) {
        Map<String,String> shouldMatch = new HashMap<String, String>();
        shouldMatch.put(productLocation, locationName);
        Should should = new Should(shouldMatch);
        this.getShould().add(should);
        return this;
    }


    public Bool bool() {
        return this;
    }
}
