package algorithms.recursion;

/**
 * Search A Linked List With Jump References
 * Input:
                  ------------
                 |            |
                 ˅            |
Node{'a'} -> Node{'b'} -> Node{'c'} -> Node{'d'} -> X
   |             ^ |                       ^
   |             | |                       |
    -------------   -----------------------

Resulting Jump Order:
| Jump Order |   Node    |
| ---------- | --------- |
| 1          | Node{'a'} |
| 2          | Node{'b'} |
| 3          | Node{'d'} |
| 4          | Node{'c'} |
 */
public class LInkedListJumpReference {
    public static void main(String[] args) {
        LInkedListJumpReference lInkedListJumpReference = new LInkedListJumpReference();
        Node a = lInkedListJumpReference.new Node();
        a.setName("a");
        Node b = lInkedListJumpReference.new Node();
        b.setName("b");
        Node c = lInkedListJumpReference.new Node();
        c.setName("c");
        Node d = lInkedListJumpReference.new Node();
        d.setName("d");
        a.setJump(b);
        a.setNext(b);
        b.setJump(d);
        b.setNext(c);
        c.setJump(b);
        c.setNext(d);
        search(a);
    }

    public static void search(Node node){
        Integer currentOrder = 0;
        goToNode(node, currentOrder);
    }

    private static void goToNode(Node node, Integer currentOrder){
        if(node == null || node.getValue() > -1){
            return;
        }
        System.out.println("Node "+node.getName());
        node.setValue(currentOrder);
        currentOrder++;
        goToNode(node.jump(), currentOrder);
        goToNode(node.next(), currentOrder);
        }


    public class Node{
        private Node jump;
        private Node next;
        private int value;
        private String name;

        public Node(){
            setValue(-1);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
        public Node jump() {
            return jump;
        }
        public void setJump(Node jump) {
            this.jump = jump;
        }
        public Node next() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }

        
    }
}
