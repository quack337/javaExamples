package linkedHashMap1;

import java.util.LinkedHashMap;

public class RemoveEdlest2 {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>(10, 0.75f, true);
        for (int i = 0; i < 20; ++i)
            map.put(i, "(" + i + ")");


    }

}
