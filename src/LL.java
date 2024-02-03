public class LL {
    public Node head;
    public Node tail;

    int size;

    public LL(){
        this.size=0;
    }
    public void insert_firpos(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void insert_lastpos(int val){
        if(tail==null){
            insert_firpos(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;

    }

    public void traverse(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("end");
    }
    public class Node{
        int value;
        Node next;

        public Node(int value){
            this.value=value;
        }

        public Node (int value,Node next){
            this.value=value;
            this.next=next;
        }



    }

    public static void main(String[] args) {

        LL list=new LL();
        list.insert_firpos(1);
        list.insert_firpos(2);
        list.insert_firpos(3);
        list.insert_firpos(4);
        list.insert_lastpos(5);
        list.insert_lastpos(6);
        list.traverse();
        System.out.println(list.size);

    }
}
