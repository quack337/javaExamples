package linkedHashMap1;

import java.util.LinkedHashMap;

public class RemoveEdlest1 {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>(10, 0.75f, true);
        for (int i = 0; i < 20; ++i)
            map.put(i, "(" + i + ")");

        map.get(5); // 이 항목이 목록의 마지막이 됨.

        var entries = map.entrySet(); // 다른 방법으로 탐색하면,
                                      // modification exception
        for (var e : entries)
            System.out.printf("%d ", e.getKey());
        System.out.println();

        map.get(0); // 이 항목이 목록의 마지막이 됨.
        map.get(3); // 이 항목이 목록의 마지막이 됨.

        for (var e : entries)
            System.out.printf("%d ", e.getKey());
        System.out.println();

        // 가장 오래된 항목 구하기
        int firstKey = map.entrySet().iterator().next().getKey();
        System.out.println(firstKey);
    }

}
