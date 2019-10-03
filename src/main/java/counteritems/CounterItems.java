package counteritems;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

class CounterItems {

    void counterItems(ArrayList<Integer> arrayList) {
        Map<Integer, Integer> counter = new TreeMap<>();
        for (Integer key : arrayList) {
            if (!counter.containsKey(key)) {
                counter.put(key, 1);
            } else {
                counter.put(key, counter.get(key) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
