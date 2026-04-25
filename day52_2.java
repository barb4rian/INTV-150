
class ListNode 
{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

  
    public static ListNode deserialize(String data)
     {
        data = data.replaceAll("\\[|\\]|\\s", "");
        if (data.isEmpty()) return null;

        String[] parts = data.split(",");
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (String part : parts) {
            current.next = new ListNode(Integer.parseInt(part));
            current = current.next;
        }
        return dummy.next;
    }

    
    public static String serialize(ListNode head) 
    {
        if (head == null) return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) sb.append(",");
            head = head.next;
        }
        sb.append("]");
        return sb.toString();
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
     {
        ListNode dummy = new ListNode(0); 
        ListNode current = dummy;          
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) 
        {
            int sum = carry;

            if (l1 != null)
             {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) 
            {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }
}
