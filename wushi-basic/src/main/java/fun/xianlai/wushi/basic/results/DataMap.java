package fun.xianlai.wushi.basic.results;

import java.util.HashMap;

/**
 * @author WyattLau
 */
public class DataMap extends HashMap<String, Object> {
    public DataMap() {
        super();
    }

    public DataMap(String key, Object value) {
        super();
        this.put(key, value);
    }
}
