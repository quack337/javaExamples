package linkedHashMap1;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    private static final long serialVersionUID = 1L;
    private int maxSize;

    public LRUCache(int maxCacheSize) {
        super(maxCacheSize, 0.75f, true);
        this.maxSize = maxCacheSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        return size() > maxSize;
    }
}
