package querybuilder;

import java.util.HashMap;
import java.util.Map;

public class Match {
  private Map<String, String> itemMap = new HashMap<String, String>();
  public Match(Map<String, String> itemMap) {
      this.itemMap = itemMap;
  }

    public Map<String, String> getItemMap() {
        return itemMap;
    }

    public void setItemMap(Map<String, String> itemMap) {
        this.itemMap = itemMap;
    }

    @Override
    public String toString() {
        return "Match{" +
                "itemMap=" + itemMap +
                '}';
    }
}
