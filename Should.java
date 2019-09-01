package querybuilder;



import java.util.Map;

public class Should {
    private Map<String,String> match;
    private Bool bool;

    Should(Map<String, String> match) {
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


    public void setBool(Bool bool) {
        this.bool = bool;
    }

    @Override
    public String toString() {
        return "Should{" +
                "match=" + match +
                '}';
    }
}
