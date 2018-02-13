package linkedlistloop;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author leovolpatto
 */
public class LinkedListLoopTest {
    
@Test
	public void createLinkedListFromList() {
		Integer[] values = new Integer[] {1, 2, 3, 4, 5};
		LinkedList<Integer> list = new LinkedList<>(Arrays.asList(values));
		
		Node<Integer> head = list.getHead();
		int index = 0;
		
		while (head != null) {
			assertEquals(head.getData(),values[index]);
			index++;
			head = head.getNext();
		}
	}
	
	@Test
	public void isCircularReturnsFalseWhenListIsNotCircular() {
		Integer[] values = new Integer[] {1, 2, 3, 4, 5};
		LinkedList<Integer> list = new LinkedList<>(Arrays.asList(values));
		assertFalse(list.isCircular());
	}
	
	@Test
	public void isCircularReturnsTrueWhenListIsCircular() {
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
		assertTrue(list.isCircular());
	}
	
	@Test
	public void firstNodeOfCircularLoopReturnsCorrectNode() {
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
		
		assertEquals(three, list.firstNodeOfCircularLoop());
	}
	
	@Test
	public void firstNodeOfCircularLoopReturnsNullWhenListIsNotCircular() {
		Integer[] values = new Integer[] {1, 2, 3, 4, 5};
                
		LinkedList<Integer> list = new LinkedList<>(Arrays.asList(values));
		assertEquals(null, list.firstNodeOfCircularLoop());
	}
}
