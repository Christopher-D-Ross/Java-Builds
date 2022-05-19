package com.devross;

public interface NodeList {

    ListItem getRoot();//The head of the list.
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
