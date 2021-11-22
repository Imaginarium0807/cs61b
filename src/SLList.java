public class SLList {
    public IntNode first;

    public SLList(int x){

        first = new IntNode(x,null);
    }

    /** Add x to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    /** Returns the first item in the list. */
    public int getFirst() {
        return first.item;
    }

    /** Adds an item to the end of the list.*/
    public void addLast(int x){
        IntNode p = first;
        /* Move p until it reaches the end of the list. */
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }
    public static void main(String[] args) {
        /* Creates a list of one integer, namely 10 */
        SLList L = new SLList(10);
        L.addFirst(10);
        L.addFirst(66);
        L.addLast(20);
        System.out.println(L.getFirst());
    }
}
