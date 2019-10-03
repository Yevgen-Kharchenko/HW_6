package counteritems;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<Integer> testArray = new ArrayList<>();
        testArray.add(4);
        testArray.add(5);
        testArray.add(-6);
        testArray.add(4);
        testArray.add(5);
        testArray.add(3);
        testArray.add(4);
        testArray.add(2);
        testArray.add(4);
        testArray.add(5);
        testArray.add(7);

        CounterItems counterItems = new CounterItems();
        counterItems.counterItems(testArray);

    }
}
