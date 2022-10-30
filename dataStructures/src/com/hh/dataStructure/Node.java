package com.hh.dataStructure;

/**
 * 定义一个节点类，用类存储元素
 */
public class Node {
    //三个属性
    //指向前一个节点，类型为Object，进一步前一个节点也是节点，所以类型转为Node
    //Object pre;---> Node pre
    private Node pre;

    //当前节点元素.也就是将要创建的元素类型
    private Object obj;

    //指向后一个节点，类型为Object，进一步后一个节点也是节点，所以类型转为Node
    //Object next;
    private Node next;

    //提供一个空的构造方法
    public Node(){

    }

    @Override
    public String toString() {
        return "Node{" +
                "pre=" + pre +
                ", obj=" + obj +
                ", next=" + next +
                '}';
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
