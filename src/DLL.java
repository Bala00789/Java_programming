public class DLL {
    public Node head;
    public Node tail;

    public void insert_first(int value){
        Node node=new Node(value);
        node.next=head;
        node.prev=null;
        if (head!=null){
            head.prev=node;
        }
        head=node;
    }
    public void display(){
        Node temp=head;
        Node last=null;
        while (temp!=null){
            last=temp;
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("End of dll");
    }
    public void reversedisplay(){
        Node temp=head;
        Node last=null;
        while (temp!=null){
            last=temp;
            temp=temp.next;
        }
        while (last!=null){
            System.out.print(last.value+"->");
            last=last.prev;
        }
        System.out.println("end of reverse traversal");

    }
    class Node{
        int value;
        Node next;
        Node prev;


        public Node(int value,Node next,Node prev){
            this.value=value;
            this.prev=prev;
            this.next=next;
        }

        public Node(int value) {
            this.value=value;
        }
    }

    public static void main(String[] args) {
        DLL list=new DLL();
        list.insert_first(1);
        list.insert_first(2);
        list.insert_first(3);
        list.display();
        list.reversedisplay();

    }
}
