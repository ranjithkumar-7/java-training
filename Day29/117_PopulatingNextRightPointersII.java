class Solution {
    public Node connect(Node root) {
        Node leftMost = root;
        while (leftMost != null) {
            Node dummy = new Node(0);
            Node tail = dummy;
            Node curr = leftMost;
            while (curr != null) {
                if (curr.left != null) {
                    tail.next = curr.left;
                    tail = tail.next;
                }
                if (curr.right != null) {
                    tail.next = curr.right;
                    tail = tail.next;
                }
                curr = curr.next;
            }
            leftMost = dummy.next;
        }
        return root;
    }
}
