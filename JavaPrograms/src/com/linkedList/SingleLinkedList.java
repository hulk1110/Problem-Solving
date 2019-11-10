package com.linkedList;

public class SingleLinkedList<T extends Comparable<T>> implements List<T> {

    //create a reference of root
    private Node<T> root;
    private int sizeOfLinkedList;

    @Override
    public void insert(T data) {
        ++sizeOfLinkedList;
        // if there is no node, new node will be the root node

        if (root == null) {
            // root/head will point to new node
            this.root = new Node<>(data);
        } else {
            //time complexity will be O(1)
            insertDataAtBegining(data);
            // time complexity will be O(N)
            // insertDataAtEnd(data,  node);
        }
    }

    private void insertDataAtBegining(T data) {
        //create the node
        Node<T> newNode = new Node<>(data);
        //old root will be the next node now
        newNode.setNextNode(root);
        //new root will be the newly created node
        this.root = newNode;
    }

    private void insertDataAtEnd(T data, Node<T> node) {

        if (node.getNextNode() != null) {
            insertDataAtEnd(data, node);
        } else {
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }
    }

    @Override
    public void remove(T data) {
        if (this.root == null) return;
        // if the data to be deleted is of root node the root node will be the next node to root
        if (this.root.getData().compareTo(data) == 0) {
            this.root = this.root.getNextNode();
        } else {
            remove(data, root, root.getNextNode());
        }
    }

    private void remove(T dataBeRemoved, Node<T> previousNode, Node<T> actualNode) {

        while (actualNode != null) {
            if (actualNode.getData().compareTo(dataBeRemoved) == 0) {
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }
            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public void traverseList() {

        if (this.root == null) return;
        Node<T> actualNode = this.root;
        while (actualNode != null) {
            System.out.println(actualNode + "-->");
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return this.size();
    }
}
