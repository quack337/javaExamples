package lruMap1;

import org.apache.commons.collections4.map.AbstractLinkedMap;
import org.apache.commons.collections4.map.LRUMap;

class LRUCache<K,V> extends LRUMap<K,V> {
    private static final long serialVersionUID = 1L;
    private int maxSize;

    public LRUCache(int maxCacheSize) {
        super(maxCacheSize, 0.75f, true);
        this.maxSize = maxCacheSize;
    }

    @Override
    protected boolean removeLRU(AbstractLinkedMap.LinkEntry<K,V> entry) {
        return size() > maxSize;
    }
}

public class LRUCache1 {

    public static void main(String[] args) {
        var map = new LRUCache<Integer, String>(3);
        for (int i = 0; i < 10; ++i)
            map.put(i, "(" + i + ")");

        map.get(7); // 이 항목이 후미가 되어야 함. 선두부터 삭제되니까.

        var entries = map.entrySet();
        for (var e : entries)
            System.out.println(e);

    }
}