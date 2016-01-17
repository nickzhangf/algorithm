package zf.data_structure;

import java.util.Iterator;

/**
 * 双链表实现
 * Created by feng zhang on 2016/1/7.
 */
public class MyLinkedList<AnyType> implements Iterable<AnyType>
{
    private int theSize;
    private int modCount = 0;
    private Node<AnyType> beginMarker;
    private Node<AnyType> endMarker;


    public MyLinkedList()
    {
        clear();
    }

    public int size()
    {
        return theSize;
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public boolean add(AnyType x)
    {
        add(size(), x);
        return true;
    }

    public void add(int idx, AnyType x)
    {
        addBefore(getNode(idx), x);
    }

    public AnyType get(int idx)
    {
        return getNode(idx).data;
    }

    public AnyType set(int idx, AnyType newVal)
    {
        Node<AnyType> p = getNode(idx);
        AnyType oldVal = p.data;
        p.data = newVal;
        return oldVal;
    }

    public AnyType remove(int idx)
    {
        return remove(getNode(idx));
    }

    /// 工具方法
    private static class Node<AnyType>
    {
        public AnyType data;
        public Node<AnyType> prev;
        public Node<AnyType> next;

        public Node(AnyType data, Node<AnyType> prev, Node<AnyType> next)
        {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public void clear()
    {
        beginMarker = new Node<AnyType>(null, null, null);
        endMarker = new Node<AnyType>(null, beginMarker, null);
        beginMarker.next = endMarker;
        theSize = 0;
        modCount++;
    }

    private void addBefore(Node<AnyType> p, AnyType x)
    {
        Node<AnyType> newNode = new Node<AnyType>(x, p.prev, p);
        p.prev.next = newNode;
        p.prev = newNode;
        theSize++;
        modCount++;
    }

    private Node<AnyType> getNode(int idx)
    {
        Node<AnyType> p;
        if (idx < 0 || idx > size())
        {
            throw new IndexOutOfBoundsException();
        }

        if(idx <= size()/2)
        {
            p = beginMarker.next;
            for (int i = 0; i < idx; i++)
            {
                p = p.next;
            }
        }
        else
        {
            p = endMarker.prev;
            for (int i = size()-1; i > idx; i--)
            {
                p = p.prev;
            }
        }

        return p;
    }

    private AnyType remove(Node<AnyType> p)
    {
        p.prev.next = p.next;
        p.next.prev = p.prev;
        theSize--;
        modCount++;
        return p.data;
    }

    /// 工具方法 end

    @Override
    public Iterator<AnyType> iterator()
    {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements java.util.Iterator<AnyType>
    {
        private Node<AnyType> current = beginMarker.next;
        private int expectedModCount = modCount;
        private boolean okToRemove = false;

        @Override
        public boolean hasNext() {
            return current != endMarker;
        }

        @Override
        public AnyType next() {
            if (modCount != expectedModCount)
            {
                throw new java.util.ConcurrentModificationException();
            }
            if (!hasNext())
            {
                throw new java.util.NoSuchElementException();
            }

            AnyType nextItem = current.data;
            current = current.next;
            okToRemove = true;
            return nextItem;
        }

        @Override
        public void remove() {
            if (modCount != expectedModCount)
            {
                throw new java.util.ConcurrentModificationException();
            }
            if (!okToRemove)
            {
                throw new IllegalStateException();
            }

            MyLinkedList.this.remove(current.prev);
            okToRemove = false;
            expectedModCount++;
        }
    }
}
