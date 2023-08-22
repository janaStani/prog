public class LinkedList {
    Node listHead;

    //insert a new value at the end of the LL
    public void insert(String value) {
        if (listHead == null){
            //list is empty insert element
            listHead = new Node();
            listHead.head = value;
        } else { // list is not empty
            listHead.insert(value);
        }

    }

    //find a certain value in the LL
    public boolean find(String value){
        //check if list is empty
        if(listHead == null){
            return false;
        }else{ //if not empty tell to the next node to find
            return listHead.find(value);
        }
    }

    //delete a value from the LL
    public boolean delete(String value){
        //check if list is empty
        if(listHead == null){
            return false;
        }else if(listHead.head.equals(value)){ //we must check in advance if the head of the next node is equals to value
            //delete the node - just skip the node ( we forget about it)
            listHead = listHead.tail;
            return true;
        }else{
            //tell to the next node to delete
            return listHead.delete(value);
        }
    }

    public void printList(){
        System.out.print("List content: ");
        if(listHead == null){
            System.out.println("null");
        }else{
            listHead.printNode();
        }
    }



    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.insert("crab");
        ls.insert("fish");
        ls.insert("elephant");
        ls.insert("dog");
        ls.insert("cat");
        ls.insert("bird");
        ls.insert("pig");

        System.out.println(ls.listHead.head);
        System.out.println(ls.listHead.tail.tail.head);

        ls.printList();

        System.out.println(ls.find("crab"));
        System.out.println(ls.find("fish"));
        System.out.println(ls.find("banana"));

        System.out.println(ls.delete("banana"));
        ls.printList();
        System.out.println(ls.delete("crab"));
        System.out.println(ls.delete("crab"));
        ls.printList();
        System.out.println(ls.delete("dog"));
        ls.printList();
    }

}
