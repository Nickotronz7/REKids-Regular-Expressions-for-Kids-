package com.example.nicko.rekids_regular_expressions_for_kids_;

/**
 * Created by Kevin
 */
public class List<T> {
    public Node<T> head;

    public List() {
        this.head = head;
    }

    /**
     * Clase encargada de insertar los nodos con datos dentro de una lista
     * @param data
     */
    public void insert(T data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node<T> tmp = head;
            while (tmp.getNextNode() != null) {
                tmp = tmp.getNextNode();
            }
            tmp.setNextNode(new Node(data));
        }
    }

    /**
     *Se encarga de buscar un dato en la lista
     * @param pData dato utilizado para la busqueda
     * @return regresa el dato si se encuentra y null si no se encuentra el dato.
     */
    public T search(T pData) {
        if (head != null) {
            if (head.getData() == pData) {
                return head.getData();
            } else {
                Node<T> tmp = head;
                while (tmp.getNextNode() != null) {
                    if (tmp.getNextNode().getData() == pData) {
                        return tmp.getNextNode().getData();
                    } else {
                        tmp = tmp.getNextNode();
                    }
                }
            }
        }
        return null;
    }

    /**
     * Metodo que se encarga de remover el elemento de la lista
     * @param data el dato que se desea eliminar
     */
    public void remove(T data) {
        if (head != null) {
            if (head.getData() == data) {
                head = head.getNextNode();
            } else {
                Node<T> tmp = head;
                while (tmp.getNextNode() != null) {
                    if (tmp.getNextNode().getData() == data) {
                        tmp.setNextNode(null);
                    } else {
                        tmp = tmp.getNextNode();
                    }
                }
            }
        }
    }
}
