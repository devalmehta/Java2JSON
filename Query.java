package querybuilder;

public class Query {
    private Bool bool;

    public Query(Bool bool) {
        this.bool = bool;
    }

    public Query() {
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
}
