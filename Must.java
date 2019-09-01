package querybuilder;


import java.util.List;
import java.util.Map;

public class Must {
    private Map<String,String> match;
    private Bool bool;

    public Must(Map<String,String> match) {
        this.match = match;
    }

    public Map<String,String> getMatch() {
        return match;
    }

    public void setMatch(Map<String,String> match) {
        this.match = match;
    }
    public Bool getBool() {
        if(bool == null) {
            bool = new Bool();
        }
        return bool;
    }

    public void setQuery(Bool bool) {
        this.bool = bool;
    }


    @Override
    public String toString() {
        return "Must{" +
                "match=" + match +
                '}';
    }
}
