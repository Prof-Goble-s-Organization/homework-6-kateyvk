/**
 * A sortable DoublyLinkedList.  The fields and the DLLNode class in the
 * COMP232DoublyLinkedList class are protected fields and can be accessed
 * directly in this class.
 * 
 * @author William Goble
 * @author Dickinson College
 * 
 */
public class COMP232SortableLinkedList<E extends Comparable<E>> extends COMP232DoublyLinkedList<E> {

	/**
	 * Implementation of insertion sort for the LinkedList. The elements of the
	 * list will be sorted according to the order imposed by their compareTo
	 * method. Assume the first element is sorted
	 */
	public void insertionSortList() {
		if (head.next == null|| head.next.next == null)  {
			System.out.println("There is nothing to sort, the list is either empty or has one node");
			return;
		}
		
		
		//starting at 2nd node, assuming the first node is sorted
		DLLNode<E> unsortedN = head.next.next;
		
	
		while(unsortedN != tail) {
			//Extracting and storing element info
			E x = unsortedN.element;
			DLLNode<E> sortedN = unsortedN.prev; //first node is assumed to be sorted, link it to the unsorted node so traversal is easier
			
			
			//while most recent sorted element is greater than unsorted element, swap until no longer true
			while(sortedN != head && x.compareTo(sortedN.element)<0) {
				sortedN.next.element = sortedN.element;
				sortedN = sortedN.prev;
			}
			
			//if there is no swap necessary, everything shifts over so unsorted element becomes sorted and we visit the next unsorted element
			sortedN.next.element = x;
			unsortedN = unsortedN.next;
			
			
			
		}
	}
}
