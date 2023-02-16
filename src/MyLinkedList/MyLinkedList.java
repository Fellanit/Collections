package MyLinkedList;

import java.util.LinkedList;

public class MyLinkedList<E> {
    private Node<E> fstNode;
    private Node<E> lstNode;
    private int size = 0;

    public MyLinkedList() {
        lstNode = new Node<E>(null, fstNode, null);
        fstNode = new Node<>(null, null, lstNode);
    }

    private class Node<E> {

        private E currentElement;
        private Node<E> nextElement;
        private Node<E> prevElement;

        private Node(E currentElement, Node<E> prevElement, Node<E> nextElement) {
            this.currentElement = currentElement;
            this.prevElement = prevElement;
            this.nextElement = nextElement;


        }

        public void setCurrentElement(E currentElement) {
            this.currentElement = currentElement;
        }

        public E getCurrentElement() {
            return currentElement;
        }

        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<E> getNextElement() {
            return nextElement;
        }

        public void setPrevElement(Node<E> prevElement) {
            this.prevElement = prevElement;
        }

        public Node<E> getPrevElement() {
            return prevElement;
        }

    }

    public void addLast(E e) {
        Node<E> prev = lstNode;
        prev.setCurrentElement(e);
        lstNode = new Node<E>(null, prev, null);
        prev.nextElement = lstNode;
        size++;
    } public void addFirst(E e) {
        Node<E> prev = fstNode;
        prev.setCurrentElement(e);
        fstNode = new Node<E>(null, null, prev);
        prev.prevElement = fstNode;
        size++;
    }



    public E get(int index) {
        if (index <= size) {
            Node<E> getingElement = fstNode.nextElement;
            for (int i = 0; i < index; i++) {
                getingElement = getNextElement(getingElement);
            }
            return getingElement.getCurrentElement();
        }else {
            return (E) new IndexOutOfBoundsException("Індекс за межами");
    }
    }

    private Node<E> getNextElement(Node<E> current) {
        return current.getNextElement();
    }
    public int size(){
        return size;
    }
    public void clear(){
        lstNode = new Node<E>(null, fstNode, null);
        fstNode = new Node<>(null, null, lstNode);
        size = 0;
    }
    public E remove(int index){
        Node<E> removingElement = fstNode.nextElement;
        for (int i = 0; i < index; i++) {
            removingElement = getNextElement(removingElement);
//            to be continued
        }
        removingElement = null;
        lstNode = removingElement;
        return lstNode.currentElement;
    }


}

