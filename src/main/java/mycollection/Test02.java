package mycollection;

import mycollection.MyLinkedList;

public class Test02 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(5);
        myLinkedList.add(7);
        myLinkedList.add(0);

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(3));
    }
}
