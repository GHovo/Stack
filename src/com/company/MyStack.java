package com.company;

public class MyStack {

    private final int maxSize;
    private final long[] stackArray;
    private int top;

    public MyStack(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }
    public void push(long j) {
        stackArray[++top] = j;
    }
    public long pop() {
        return stackArray[top--];
    }
    public long peek() {
        return stackArray[top];
    }
    public boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        MyStack mStack = new MyStack(10);
        mStack.push(10);
        mStack.push(20);
        mStack.push(30);
        mStack.push(40);
        mStack.push(50);

        while (!mStack.isEmpty()) {
            long value = mStack.pop();
            System.out.println(value);
        }
    }
}
