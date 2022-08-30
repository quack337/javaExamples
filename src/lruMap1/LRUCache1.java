package lruMap1;

import org.apache.commons.collections4.map.LRUMap;

public class LRUCache1 {

    public static void main(String[] args) {
        var map = new LRUMap<Integer, String>(3);
        for (int i = 0; i < 10; ++i)
            map.put(i, "(" + i + ")");

        map.get(7); // 이 항목이 후미가 되어야 함. 선두부터 삭제되니까.

        var entries = map.entrySet();
        for (var e : entries)
            System.out.println(e);

    }
}
