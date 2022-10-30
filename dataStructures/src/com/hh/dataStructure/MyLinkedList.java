package com.hh.dataStructure;

/**
 * 模拟LinkedList的实现过程
 */
public class MyLinkedList {
    //指向链中的第一个节点
    public Node first;
    //指向链中的最后一个节点
    public Node last;
    //记录当前链中的节点个数
    public int count;

    //空的构造方法
    public MyLinkedList() {
    }

    //向链中添加元素
    public void add(Object o) {
        if (first == null) {//如果首元素为空，那么创建首元素
            //将添加进来的元素封装成一个Node对象
            Node n = new Node();
            n.setPre(null);//前一个节点为空
            n.setObj(o);//将o传进来
            n.setNext(null);//后一个节点也为空
            //当前链中第一个节点为n
            first = n;
            //当前链中最后一个节点也为n
            last = n;
        }else {//如果当前链不为空
            Node n = new Node();//将添加进来的元素封装成一个Node对象
            n.setPre(last);//当前将要添加的元素的前一个节点为当前链表的last元素
            n.setObj(o);//将o传进来
            n.setNext(null);//当前将要添加的元素的后一个节点为空
            last.setNext(n);//当前链表的最后一个元素指向新添加的元素，当前链表的最后一个元素为last
            last = n;//创建成功后，将last指向新添加的元素
        }
        //添加成功后，元素的个数自增
        count++;
    }

    //返回当前链表中元素的个数
    public int getSize(){
        return count;
    }

    //通过给定的下标，取出相应的元素
    public Object get(int index){
        //定义一个临时节点变量，指向首元素,也就是获取首元素
        Node temp = first;
        for (int i = 0; i <index ; i++) {
            //将获取的下一个节点元素的引用给当前临时节点，直到循环结束，此时temp指向指定下标的元素
            temp = temp.getNext();
        }
        return temp.getObj();//返回指定下标元素的内容
    }
}

