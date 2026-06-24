class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<Integer> ans = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            ans.add(temp.val);
            temp = temp.next;
        }
        int idx = ans.size()-n;
        ans.remove(idx);
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for(int i = 0 ; i<ans.size() ; i++){
            curr.next = new ListNode(ans.get(i));
            curr = curr.next;
        }
        return dummy.next;
    }
}
