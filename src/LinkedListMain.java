
    public class LinkedListMain {
        public static void main(String[] args) {
            LinkedList linkedlist = new LinkedList();

            // Insert some values into the linked list in sorted order
            linkedlist.sorted_insert(5);
            linkedlist.sorted_insert(3);
            linkedlist.sorted_insert(9);
            linkedlist.sorted_insert(1);
            linkedlist.sorted_insert(7);

            System.out.println("Linked List after sorted insertions:");
            linkedlist.printList();

//        System.out.println("Linked List after appending 5 to the back of the list:");
//        linkedList.append(5);
//        linkedList.printList();

            LinkedList newList = new LinkedList();

            newList.sorted_insert(2);
            newList.sorted_insert(4);
            newList.sorted_insert(6);
            newList.sorted_insert(8);


            System.out.println("List after appending another list:");
            linkedlist.appendList(newList);
            linkedlist.printList();
        }
    }

