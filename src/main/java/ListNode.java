public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public static ListNode newListFactory(int ... nodes) {
        if(nodes == null) { return null; }
        ListNode head = null;
        ListNode curNode = null;
        for (int n: nodes) {
           if(curNode == null) {
               curNode = new ListNode(n);
               head = curNode;
           } else {
               curNode.next = new ListNode(n);
               curNode = curNode.next;
           }
        }
        return head;
    }

    public static void showList(ListNode head) {
        ListNode node = head;
        StringBuilder sb = new StringBuilder("[ ");
        while (node != null) {
            sb.append(node.val).append(" -> ");
            node = node.next;
        }
        sb.replace(sb.length() - 3, sb.length(), "]");
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        showList(newListFactory(1,2,3));
    }
}

