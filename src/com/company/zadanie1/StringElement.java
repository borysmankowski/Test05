package com.company.zadanie1;

public final class StringElement<T> {

    private T value;
    private StringElement next;
    private int index;

    public StringElement(T value, StringElement next) {
        this.value = value;
        this.next = next;
    }
    public StringElement(int index, StringElement next){
        this.index = index;
        this.next = next;
    }

    public StringElement(int index){
        this(index,null);
    }

    public StringElement(T value) {
        this(value, null);
    }

    public Object getValue() {
        return value;
    }

    public StringElement getNext() {
        return next;
    }

    public void setNext(StringElement n) {
        next = n;
    }

    public boolean hasNext() {
        return next != null;
    }

    public void setValue(T o) {
        value = o;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "StringElement{" +
                "value=" + value +
                ", next=" + next +
                ", index=" + index +
                '}';
    }
}
