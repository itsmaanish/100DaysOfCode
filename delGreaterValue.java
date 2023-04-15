class Solution
{
 Node compute(Node head)
    {
        if(head.next==null) return head;
        Node nex=compute(head.next);
        if(head.data<nex.data) head=nex;
        else head.next=nex;
        return head;
    }

}
