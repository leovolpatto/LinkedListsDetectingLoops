package linkedlistloop;

public class Node<T> {
    private T data;
    private Node<T> next;
    
    public Node(){
        
    }
    
    public Node(T data){
        this();
        this.data = data;
    }
    
    public T getData(){
        return this.data;
    }
    
    public void setData(T value){
        this.data = value;
    }
    
    public Node<T> getNext(){
        return this.next;
    }
    
    public void setNext(Node<T> value){
        this.next = value;
    }
            
}
