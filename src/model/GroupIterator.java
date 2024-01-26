package controller;

import model.Group;

import java.util.Iterator;
import java.util.List;

public class GroupIterator implements Iterator {
    private final List<Student> studentList;

    public GroupIterator(Group group) {
        this.studentList = group.getStudentList();
        this.counter = 0;
    }

    private int counter;
    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public boolean hasNext() {
        return counter <= studentList.size() - 1;
    }

    @Override
    public Object next() {
        if (hasNext()){
            return studentList.get(counter++);
        }
        return null;
    }
}
