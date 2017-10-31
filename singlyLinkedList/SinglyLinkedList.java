class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList(){
        
    }
    public SinglyLinkedList(Node head){
        this.head = null;
    }

    public void add(int val){
        
        if(this.head == null){
            this.head = new Node(val, null);
        }
        else {
            Node temp = this.head;
            while(temp.next != null){
                temp = temp.next;
            }
    
            temp.next = new Node(val, null);
        }
        
    }
    public void remove(){
        if (this.head == null){
            
        }
        else {
            Node temp = this.head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }
    public void printValues(){
        String str = "<";
        Node temp = this.head;
        while(temp != null){
            str += temp.value + " ";
            temp = temp.next;
        }
        str = str.substring(0, str.length()-1);
        str += ">";
        System.out.println(str);
    }
}
