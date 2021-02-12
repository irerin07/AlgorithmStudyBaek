package leetcode_week_1_chal;

public class leetcode3635 {
    /*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

    class Solution {
        HashMap<Node, Node> map = new HashMap<>();
        public Node copyRandomList(Node head) {
            if (head == null) {
                return null;
            }
            else if (map.containsKey(head)) {
                return map.get(head);
            } else {
                Node copy = new Node(head.val);
                map.put(head, copy);
                copy.next = copyRandomList(head.next);
                copy.random = copyRandomList(head.random);
                return copy;
            }
        }
    }
}
