package com.company.zadanie1;

import java.util.function.Function;

public class ObjectContainer<T> {

    private int size = 0;
    private StringElement<T> head = new StringElement<>(null);
    private Function<T, Boolean> function;
    private Person person;
    private String city;


    public ObjectContainer(Function<T, Boolean> personal) {
        clear();
        this.function = personal;
    }

    public void clear() {
        head.setNext(null);
        size = 0;
    }

    public void add(Person value) {
        if (person.getCity().equals(value.getCity())) {
            try {
                if (head.getNext() == null) {
                    {
                        head.setNext(new StringElement(value));
                    }
                    StringElement last = head.getNext();
                    while (last.getNext() != null)
                        last = last.getNext();
                    ++size;
                    last.setNext(new StringElement(value));
                } else {
                    throw new InvalidStringContainerPatternException("Niee dzialaaaaa");
                }
            } catch (InvalidStringContainerPatternException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean delete(String o) {
        if (head.getNext() == null) return false;
        if (head.getNext().getValue().equals(o)) {
            head.setNext(head.getNext().getNext());
            size--;
            return true;
        }
        StringElement delete = head.getNext();
        while (delete != null && delete.getNext() != null) {
            if (delete.getNext().getValue().equals(o)) {
                delete.setNext(delete.getNext().getNext());
                size--;
                return true;
            }
            delete = delete.getNext();
        }
        return false;

    }

    public boolean delete(int index) {
        if (head.getNext() == null) return false;
        if (head.getNext().getIndex() == index) {
            head.setNext(head.getNext().getNext());
            size--;
            return true;
        }
        StringElement delete = head.getNext();
        while (delete != null && delete.getNext() != null) {
            if (delete.getNext().getValue().equals(index)) {
                delete.setNext(delete.getNext().getNext());
                size--;
                return true;
            }
            delete = delete.getNext();
        }
        return false;

    }


    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public Object get(int position) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException();
        }
        StringElement find = head.getNext();
        for (int i = 0; i <= position; i++)
            find = find.getNext();
        return find.getValue();
    }

    public void setSize(int size) {
        this.size = size;
    }

    public StringElement<T> getHead() {
        return head;
    }

    public void setHead(StringElement<T> head) {
        this.head = head;
    }

    public Function<T, Boolean> getFunction() {
        return function;
    }

    public void setFunction(Function<T, Boolean> function) {
        this.function = function;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
