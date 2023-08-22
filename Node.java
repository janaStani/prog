public class Node {
    String head;
    Node tail;


    //recursive function
    public void insert(String value){
        //stop condition
        if(tail == null){ //reached the end of the list
            tail = new Node();
            tail.head = value;
        }else{ // divide step -> tell to the next node to insert the value
            tail.insert(value);
        }
    }

    //recursive function with two stop conditions
    public boolean find(String value){
        //Element found
        if(head.equals(value)){
            return true;
        }else {
            if(tail == null){ //end of list, element not present
                return false;
            }else{ //recursive step -> tell to the next node to find the element
                return tail.find(value);
            }
        }
    }

    public boolean delete(String value){
        //first check if we are at the end of the list otherwise error
        if(tail == null){
            return false; //the element is not present
        }else if(tail.head.equals(value)){ // look in advance
            //delete the element
            tail = tail.tail;
            return true;
        }else{ 
            //tell to the next node to delete the element
            return tail.delete(value);
        }

    }


    public void printNode(){
        System.out.print(head+"->");
        if(tail==null){
            System.out.println("null");
        }else{
            tail.printNode();
        }
    }


}
