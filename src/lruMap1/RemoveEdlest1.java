package lruMap1;

import org.apache.commons.collections4.map.LRUMap;

public class RemoveEdlest1 {

    public static void main(String[] args) {
        LRUMap<Integer, String> map = new LRUMap<>(10, 0.75f);
        for (int i = 0; i < 20; ++i)
            map.put(i, "(" + i + ")");

        map.get(15); // 이 항목이 목록의 마지막이 됨.

        for (var key : map.keySet()) // 이렇게 탐색해도 에러 안 남.
            System.out.printf("%d ", key);
        System.out.println();

        map.get(11); // 이 항목이 목록의 마지막이 됨.
        map.get(13); // 이 항목이 목록의 마지막이 됨.

        for (var e : map.entrySet()) // 이렇게 탐색해도 에러 안 남.
            System.out.printf("%d ", e.getKey());
        System.out.println();

        // 가장 오래된 항목, 최신 항목 구하기
        System.out.printf("%s %s\n", map.firstKey(), map.lastKey());
    }

}
