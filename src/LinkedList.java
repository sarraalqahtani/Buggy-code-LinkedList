 class LinkedList {
     private static Node head;

     public LinkedList() {
         head = null;
     }

     public LinkedList(Node node) {
         if (head == null) head = node;
         else {
             Node currNode = head;
             while (currNode.next != null) currNode = currNode.next;
             currNode.next = node;
         }
     }

     public LinkedList(LinkedList copyList) {
         if (head == null) return;
         Node copyNode = head.next;
         Node currNode = new Node(head.data);
         head = currNode;
         while (copyNode != null) {
             currNode.next = new Node(copyNode.data);
             currNode = currNode.next;
             copyNode = copyNode.next;
         }
     }


     public static void appendList(LinkedList L) {
         if (L.head == null) return;
         Node currNode = L.head;
         while (currNode != null) {
             int data = currNode.data;
             sorted_insert(data);
             currNode = currNode.next;
         }
     }

     public static void append(int target) {
         Node lastNode = head;
         Node currNode = head;
         Node targetNode = null;
         while (currNode != null) {
             if (currNode.data == target) {
                 targetNode = currNode;
                 if (currNode == lastNode) head = head.next;
                 else lastNode.setNext(currNode.next);
             }
             lastNode = currNode;
             currNode = currNode.next;
         }
         if (targetNode == null || targetNode.next == null) return;

         lastNode.next = targetNode;
         targetNode.setNext(null);
     }


     public static void sorted_insert(int num) {
         Node newNode = new Node(num);
         Node currNode = head;
         Node prevNode = head;

         if (head == null) {
             head = newNode;
             return;
         }

         if (num < head.data) {
             newNode.setNext(head);
             head = newNode;
             return;
         }

         while (currNode != null) {
             if (prevNode.data < num && num <= currNode.data) {
                 prevNode.next = newNode;
                 newNode.setNext(currNode);
                 break;
             } else if (currNode.next == null) {
                 currNode.next = newNode;
                 newNode.setNext(null);
                 break;
             }
             prevNode = currNode;
             currNode = currNode.next;
         }
     }


     public static void printList() {
         Node currNode = head;
         while (currNode != null) {
             System.out.print(currNode.data + " -> ");
             currNode = currNode.next;
         }
         System.out.println("null");
     }
 }

