package querybuilder;


import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;


public class TestQueryBuilder {
    public static void main(String[] args) throws IOException {

      //  QueryBuilder builder = new QueryBuilder.Builder().Query(bool).build();

        QueryBuilder builder = new QueryBuilder();
        builder.bool().mustMatch("item", "Milk").mustMatch("item_type", "Dairy");
        builder.bool().shouldMatch("product_location", "New Mexico").shouldMatch("warehouse_number", "37");
        builder.bool().shouldMatch("lot_number", "307").bool().mustMatch("expiry_date", "Jan 2020");
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(builder));
    }
}
