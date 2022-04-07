package esempi.generics;

import java.util.LinkedList;

class Pila<T> {

    T [] array;
    private int cursor = 0;

    public Pila(T[] array) {
        this.array = array;
    }

    public void put(T element) {
        if (cursor == array.length) throw new ArrayIndexOutOfBoundsException();
        array[cursor] = element;
        cursor++;
    }

    public T pop() {
        if (isEmpty()) throw new NegativeArraySizeException();
        T element = array[cursor];
        cursor--;
        return element;
    }

    public boolean isEmpty() {
        return cursor == 0;
    }
    public static void main(String [] argv) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Integer [] array = {1,2,2,6,7,8,6,4,3,9};
        Pila <Integer> p = new Pila<Integer>(array);
        p.put(5);
        int n = p.pop();
    }
}

