import javax.swing.text.html.HTMLDocument;

// write your code here
import java.util.Iterator;
public class Node implements Iterable<Node>{
    int data;
    Node next;

    public Node(int data){
    this.data = data;
    this.next = null;
    }
    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    public Iterator<Node> iterator(){
        return new NodeIterator(this);
    }
    private static class NodeIterator implements Iterator<Node>{
        private Node head;
        public NodeIterator(Node head){
            this.head = head;
        }
        public boolean hasNext(){
            return this.head!=null;
        }
        public Node next(){
            Node temp = head;
            head = head.next;
            return temp;
        }
    }

}
