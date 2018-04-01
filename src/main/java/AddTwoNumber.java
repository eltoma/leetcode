public class AddTwoNumber {
    public static void main(String[] args) {
        ListNode l1 = ListNode.newListFactory(2, 4, 3);
        ListNode l2 = ListNode.newListFactory(5, 6, 4);
        ListNode sum = addTwoNumbers(l1, l2);
        ListNode.showList(sum);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return null;
        }

        ListNode resHead = null;
        ListNode resCurNode = null;
        while (l1 != null || l2 != null) {
            int tempSum = 0;
            if(l1 != null) {
                tempSum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                tempSum += l2.val;
                l2 = l2.next;
            }

            if(resCurNode == null) {
                resCurNode = new ListNode(tempSum);
                resHead = resCurNode;
            } else {
                resCurNode.next = new ListNode(tempSum);
                resCurNode = resCurNode.next;
            }
        }

        resCurNode = resHead;
        while (resCurNode != null) {
            int temp = resCurNode.val - 10;

            if(temp >= 0) {
                resCurNode.val = temp;
                if(resCurNode.next != null) {
                    resCurNode.next.val += 1;
                } else {
                    resCurNode.next = new ListNode(1);
                    return resHead;
                }
            }

            resCurNode = resCurNode.next;
        }
        return resHead;
    }

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {

        ListNode resHead = null;
        ListNode resCurNode = null;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int tempSum = l1.val + l2.val + carry;
            carry = (tempSum > 10)? 1 : 0;

            if(resCurNode == null) {
                resCurNode = new ListNode(tempSum - 10 * carry);
                resHead = resCurNode;
                l1 = l1.next;
            } else {
                resCurNode.next = new ListNode(tempSum - 10 * carry);
                resCurNode = resCurNode.next;
                l2 = l2.next;
            }
        }

        if(l1 == null && l2 != null) {
            resCurNode.next = new ListNode(l2.val + carry);
            resCurNode = resCurNode.next;
            resCurNode.next = l2.next;
        }

        if(l1 != null && l2 == null) {
            resCurNode.next = new ListNode(l1.val + carry);
            resCurNode = resCurNode.next;
            resCurNode.next = l1.next;
        }

        return null;
    }
}
