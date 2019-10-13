package Java.programs;


/*
1) Divide the list in two parts - first node and rest of the linked list.
	2) Call reverse for the rest of the linked list.
	3) Link rest to first.
	4) Fix head pointer.
 */
public class SinglyLinkedListImpl<T> {
    private Node<T> head;

    public void addElement(T element) {

        Node<T> nd = new Node<T>();
        nd.setData(element);
        Node<T> temp = head;

        while (true) {

            if (temp == null) {
                head = nd;
                break;
            } else if (temp.getNextRef() == null) {

                temp.setNextRef(nd);
                break;
            } else {
                temp = temp.getNextRef();

            }

        }
    }

    public void traverse() {

        Node<T> temp = head;
        while (temp != null) {

            System.out.println(temp.getData() + "\t");
            temp = temp.getNextRef();

        }
    }

    public void reverse() {

        Node<T> prev = null;
        Node<T> next = null;
        Node<T> current = head;
        while (current != null) {
            next = current.getNextRef();
            current.setNextRef(prev);
            prev = current;
            current = next;
        }
        head = prev;
    }

    Node<T> prev = null;

    public Node<T> reverseByRecursion(Node<T> current) {


        if (current == null) {
            return current;
        } else if (current.getNextRef()==null){
           return current;

        }else {

            Node<T> newheadnodde=reverseByRecursion(current.getNextRef());
            current.getNextRef().setNextRef(current);
            current.setNextRef(null);
            head=newheadnodde;
            return newheadnodde;
        }

    }


    public static void main(String[] args) {

        SinglyLinkedListImpl sl = new SinglyLinkedListImpl();
        sl.addElement(1);
        sl.addElement(2);
        sl.addElement(3);
        sl.addElement(4);
        System.out.println();
        sl.traverse();
        //  sl.reverse();
        sl.reverseByRecursion(sl.head);
        System.out.println();
          sl.traverse();

    }

}


class Node<T> {

    private T data;
    private Node<T> nextRef;

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextRef() {

        return this.nextRef;
    }

    public void setNextRef(Node<T> nextRef) {
        this.nextRef = nextRef;
    }
}