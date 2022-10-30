package com.hh.dataStructure;

//测试链表
public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList ml = new MyLinkedList();
        ml.add("aa");
        ml.add("bb");
        ml.add("cc");
        ml.add("dd");
        ml.add(12);
        ml.add(14);
        ml.add(16);

        System.out.println(ml.getSize());
        System.out.println(ml.get(0));

        for (int i = 0; i < ml.getSize(); i++) {
            System.out.print(ml.get(i) + "  ");
        }
    }
}
