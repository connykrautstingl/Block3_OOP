package org.campus02.stack;

public class Stack {

    private int[] array;
    /*
    private => nur innerhalb der Klasse
    public => von überall verwendbar
    nichts =>
     */
    private int counter;

    public Stack (int[] array) {
        this.array = array;
        counter = 0;
    }

    public void push(int value) {
        if (counter >= array.length) {
            System.out.println("Stack is full");
            return;
        }
        else {
            array[counter] = value;
            counter++;
        }
    }

    public int pop() {
        if (counter == 0) {
            return -1;
        }
        counter--;
        return array[counter];
    }
}
