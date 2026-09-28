class MyLinkedList {
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    Node head;
    int size;
    
   

    public MyLinkedList() {
        head=null;
        size=0;
    }
    
    public int get(int index) {
        Node temp=head;
        int cnt=0;
        if(index<0 || index>=size) return -1;
        while(temp!=null && cnt!=index){
            temp=temp.next;
            cnt++;
        }
        if(cnt==index) return temp.val;
        return -1;
    }
    
    public void addAtHead(int val) {
        Node newnode=new Node(val);
        newnode.next=head;
        head=newnode;
        size++;
    }
    
    public void addAtTail(int val) {
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
            size++;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        size++;

    }
    
    public void addAtIndex(int index, int val) {
        Node newnode=new Node(val);
        if(index<0 || index>size) return;
        if(index==0){
            newnode.next=head;
            head=newnode;
            size++;
            return;
        }
        Node temp=head;
        int cnt=0;

        while(temp!=null && cnt!=index-1){
            temp=temp.next;
            cnt++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size) return;
        if(index==0){
            head=head.next;
            size--;
            return;
        }
        Node temp=head;
        int cnt=0;
        while(temp!=null && cnt!=index-1){
            temp=temp.next;
            cnt++;
        }
        temp.next=temp.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */