package item7;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public MyStack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        // 메모리 누수가 일어나는 부분, 꺼내진 Object는 obsolete reference가 되기 때문
        //return elements[--size];

        Object element = elements[--size];
        elements[size] = null;
        return element;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
