public class Node {
    public int value;
    public Node next;
    
    public Node(){
        this.value= 0;
        this.next = null;
    }

    /*  Constructor   */
    public Node(int value, Node node){
        this.value = value;
        this.next = node;
    }

    public int getVal(){
        return this.value;
    }

  
}