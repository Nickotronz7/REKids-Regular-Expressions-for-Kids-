package com.example.nicko.rekids_regular_expressions_for_kids_;

/**
 * * Created by kevin
 */

/**
 * Clase encargada de la creacion de los nodos utilizados en la lista
 * @param <T> es un objeto abstract encargada de la imformacion del nodo.
 */
    public class Node<T> {
        private T data;
        private Node<T> nextNode;

    /**
     * Constructor del nodo
     * @param data el dato que entra al nodo
     * @param nextNode el nodo anterior al nodo principal la cabeza
     */
        public Node(T data, Node<T> nextNode) {
            this.data = data;
            this.nextNode = nextNode;
        }

    /**
     * el nodo
     * @param data el dato
     */
        public Node(T data) {
            this.data = data;
            nextNode = null;
        }
        public void setData(T data) {
            this.data = data;
        }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }
}
