public class Node {
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        first.next = second;

        System.out.println("Первый узел: " + first.value);
        System.out.println("Второй узел: " + first.next.value);
    }
}