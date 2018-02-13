package linkedlistloop;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leovolpatto
 */
public class NodeTest {
    
    @Test
    public void nodeStoresDataInit(){
        Node<String> node = new Node<>("test");
        assertEquals(node.getData(), "test");
    }

    @Test
    public void nodeStoresNext(){
        Node<String> nodeA = new Node<>("123");
        Node<String> nodeB = new Node<>("456");
        
        nodeA.setNext(nodeB);
        assertEquals(nodeA.getNext(), nodeB);
    }

    @Test
    public void nodeStoresData(){
        Node<String> node = new Node<>();
        node.setData("abc");
        assertEquals(node.getData(), "abc");
    }
    
}