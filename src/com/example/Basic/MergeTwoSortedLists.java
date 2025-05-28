package com.example.Basic;

class ListNode{
	int val;
	ListNode next;
	public ListNode(int x) { val =x; }
}

public class MergeTwoSortedLists {
	public ListNode mergeSortedLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(0);
		ListNode current = dummy;
		while (list1 != null && list2 != null) {
			if(list1.val <= list2.val) {
				current.next = list1;
				list1= list1.next;
			}else {
				current.next = list2;
				list2 = list2.next;
			}
			current = current.next;
		}
		if(list1 != null) {
			current.next = list1;
		}else {
			current.next = list2;
		}
		return dummy.next;
	}
	
	public static void main(String[] args) {
		MergeTwoSortedLists merged = new MergeTwoSortedLists();
		ListNode list1 = new ListNode(2);
		list1.next = new ListNode(3);
		list1.next.next = new ListNode(8);
		
		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(4);
		list2.next.next = new ListNode(5);
		
		ListNode mergedList = merged.mergeSortedLists(list1, list2);
		printList(mergedList);
	}

	private static void printList(ListNode head) {
		ListNode currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.val+"  ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}

}

