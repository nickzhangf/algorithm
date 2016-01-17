package zf.test;

import zf.data_structure.MyLinkedList;

import java.util.Iterator;

/**
 * 测试双链表
 * Created by feng zhang on 2016/1/17.
 */
public class TestMyLinkedList {

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        list.add(1);
        list.add(3);
        list.add(1, 2);
        list.add(5);
        int size = list.size();
        System.out.println("size= " + size);
        int val2 = list.get(2);
        System.out.println("val2= " + val2);
        boolean isEmpty = list.isEmpty();
        System.out.println("isempty= " + isEmpty);
        list.set(2, 10);
        list.remove(3);
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
}
