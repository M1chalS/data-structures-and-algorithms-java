public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<String> linkedList = new java.util.LinkedList<String>();

        // Can be Stack or Queue

        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
//        linkedList.pop();

        linkedList.add(4, "E");
        linkedList.remove("A");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.addFirst("Z");
        linkedList.addLast("G");

        System.out.println(linkedList.indexOf("C"));

        System.out.println(linkedList);

        // Pros of linked lists
        // 1. Dynamic Data Structures
        // 2. Insertion and Deletions of Nodes is easy O(1)
        // 3. No/Low memory waste

        // Cons of linked lists
        // 1. Greater memory usage (data and address stored)
        // 2. No random access of elements (no index[i])
        // 3. Accessing and searching is more consuming O(n)

        // Why linked lists?
        // 1. implement Stacks/Queues
        // 2. GPS navigation
        // 3. Playlists
    }
}
