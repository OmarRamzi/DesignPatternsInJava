package org.example.Composite;

public interface Human {
    String getName();
    String getLastName();
    void print();
    void addChild(Human child);
    void addParent(Human parent);
}
