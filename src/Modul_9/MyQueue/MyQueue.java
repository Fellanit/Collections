package Modul_9.MyQueue;


public class MyQueue<E> {
    private Node<E> fstNode;
    private Node<E> lstNode;
    private int size = 0;

    public MyQueue() {
        lstNode = new Node<E>(null, fstNode, null);
        fstNode = new Node<>(null, null, lstNode);
        size = 0;
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
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node<E> node = fstNode.nextElement;
        while (node.nextElement != null) {
            if (node.currentElement != null){
                result.append(node.currentElement).append(",");
            }
            node = node.nextElement;
        }

        return result.toString().substring(0,result.length() - 1);
    }
    public void clear() {
        lstNode = new Node<E>(null, fstNode, null);
        fstNode = new Node<>(null, null, lstNode);
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(E e) {
        Node<E> prev = lstNode;
        prev.setCurrentElement(e);
        lstNode = new Node<E>(null, prev,null );
        prev.nextElement = lstNode;
        size++;
    }
    public E peek(){
        Node<E> firstElement =  fstNode.nextElement;
        return firstElement.getCurrentElement();
    }
    public E poll(){
        Node<E> firstElement =  fstNode.getNextElement();
        System.out.println("firstElement = " + firstElement.getCurrentElement());
        firstElement.currentElement = null;

        return firstElement.getCurrentElement();
    }
}
