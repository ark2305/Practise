package DataStructureLinkedList;

public class DataStructure {

    public static void main(String[] args){

        LinkedList list = new LinkedList();

        list.insert(5);
        list.insert(22);
        list.insert(43);
       // list.insertAtStart(25);
        list.insertAt(2,55);

        list.show();

    }
}
