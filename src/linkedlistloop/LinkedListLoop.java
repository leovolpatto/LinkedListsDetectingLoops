package linkedlistloop;

/**
 * @author leovolpatto
 */
public class LinkedListLoop {

    public static void main(String[] args) {
        new LinkedListLoop().CreateCircularList();
        
        // Run tests for mode details
    }
    
    public void CreateCircularList(){
        Node<Integer> one = new Node<>(1);
        Node<Integer> two = new Node<>(2);
        one.setNext(two);
        Node<Integer> three = new Node<>(3);
        two.setNext(three);
        Node<Integer> four = new Node<>(4);
        three.setNext(four);
        Node<Integer> five = new Node<>(5);
        four.setNext(five);
        five.setNext(three);

        LinkedList<Integer> list = new LinkedList<>(one);
        System.out.println(list.isCircular());
    }
    
}