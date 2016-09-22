package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    ListNode head=buildNode();
        ListNode res=deleteDuplicates(head);
        while(res!=null){
            System.out.println(res.val);
            res=res.next;
        }
    }
    //Given a sorted linked list,delete all duplicates such that each element appear only once.
    public static ListNode deleteDuplicates(ListNode head){
        if(head==null)return head;
        ListNode dummyHead=new ListNode(-1);  //其实不用dummyHead
        dummyHead.next=head;
        while(head!=null&&head.next!=null){//需要将curr!=null&&curr.next!=null都放进去判断，否则会出错
            if(head.val==head.next.val){
                head.next=head.next.next;
            }
            head=head.next;
        }
        return dummyHead.next;
    }
    public static ListNode buildNode(){
        ListNode head=new ListNode(1);
        head.next=new ListNode(1);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(3);
        head.next.next.next.next=new ListNode(3);
        return head;
    }
}
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
