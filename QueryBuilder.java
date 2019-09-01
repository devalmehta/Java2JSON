package querybuilder;


import java.util.List;

public class QueryBuilder {


    private Query query;


    public QueryBuilder(Builder builder) {
        this.query = builder.query;
    }

    public QueryBuilder() {

    }

    public Query getQuery() {
        if(query == null) {
            query = new Query();
        }
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }
    public static class Builder{
       private Query query;


       public Builder() {

       }
       public Builder Query(Bool bool) {
           this.query = new Query(bool);
           return this;
       }

       public QueryBuilder build(){
           return new QueryBuilder(this);
       }
    }

    public Bool bool()
    {
        return this.getQuery().getBool();
    }
}
