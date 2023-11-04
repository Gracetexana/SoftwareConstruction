/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package homework;


public class MyLinkedList<E> extends MyAbstractList<E> {
	private Node<E> head, tail;

	/** Create a default list */
	public MyLinkedList() {
	}

	/** Create a list from an array of objects */
	public MyLinkedList(E[] objects) {
		super(objects);
	}

	/** Return the head element in the list */
	public E getFirst() {
		return head.element;
	}

	/** Return the last element in the list */
	public E getLast() {
		return tail.element;
	}

	/** Add an element to the beginning of the list */
	public void addFirst(E e) {
		Node<E> newNode = new Node<E>(e);
		newNode.next = head;
		head = newNode;
		size ++;
		if (tail == null){
			tail = head;
		}
	}

	/** Add an element to the end of the list */
	public void addLast(E e) {
		if (tail == null){
			head = tail = new Node<E>(e);

		} else {
			tail.next = new Node<E>(e);
			tail = tail.next;
		}

		size ++;
	}


	@Override /** Add a new element at the specified index 
	* in this list. The index of the head element is 0 */
	public void add(int index, E e) {
		checkIndex(index);

		if (index == 0){
			addFirst(e);

		} else if (index >= size) {
			addLast(e);

		} else {
			Node<E> current = head;
			{
				current = current.next;
			} for (int i=0; i<index; i++);

			Node<E> temp = current.next;
			current.next = new Node<E>(e);
			(current.next).next = temp;
			size ++;
		}
	}

	/** Remove the head node and
	 *  return the object that is contained in the removed node. */
	public E removeFirst() {
		if (size == 0){
			return null;

		} else {
			Node<E> temp = head;
			head = head.next;
			size --;

			if (head == null){
				tail = null;
			}
			
			return temp.element;
		}
	}

	/** Remove the last node and
	 * return the object that is contained in the removed node. */
	public E removeLast() {
		if (size == 0){
			return null;

		} else {
			try{
				return tail.element;

			} finally {
				if (size == 1){
					head = tail = null;

				} else {
					Node<E> current = head;

					for (int i=0; i<size-2; i++){
						current = current.next;
					}

					tail = current;
					tail.next = null;
				}

				size --;
			}
		}
	}

	@Override /** Remove the element at the specified position in this 
	*  list. Return the element that was removed from the list. */
	public E remove(int index) {
		checkIndex(index);

		if (index < 0 || index >= size){
			return null;

		} else if (index == 0){
			return removeFirst();

		} else if (index == size-1){
			return removeLast();

		} else {
			Node<E> previous = head;
			{
				previous = previous.next;
			} for (int i=0; i<index; i++);

			Node<E> current = previous.next;

			try {
				return current.element;

			} finally {
				previous.next = current.next;
				size --;
			}
		}
	}

	@Override /** Override toString() to return elements in the list */
	public String toString() {
		StringBuilder result = new StringBuilder("[");

		Node<E> current = head;
		for (int i = 0; i < size; i++) {
			result.append(current.element);
			current = current.next;
			if (current != null) {
			result.append(", "); // Separate two elements with a comma
			}
			else {
			result.append("]"); // Insert the closing ] in the string
			}
		}

		return result.toString();
	}

	@Override /** Clear the list */
	public void clear() {
		size = 0;
		head = tail = null;
	}

	@Override /** Return true if this list contains the element e */
	public boolean contains(E e) {
		Node<E> current = head;
		while (current != e){
			current = current.next;
			if (current == tail){
				return false;
			}
		}

		return current == e;
	}

	@Override /** Return the element at the specified index */
	public E get(int index) {
		checkIndex(index);

		Node<E> current = head;

		for (int i=0; i<index; i++){
			current = current.next;
		}

		return current.element;
	}

	@Override /** Return the index of the head matching element in 
	*  this list. Return -1 if no match. */
	public int indexOf(E e) {
		Node<E> current = head;

		for (int i=0; i<size; i++){
			if (current.element == e){
				return i;
			}
			current = current.next;
		}

		return -1;
	}

	@Override /** Return the index of the last matching element in 
	*  this list. Return -1 if no match. */
	public int lastIndexOf(E e) {
		Node<E> current = head;
		int matchIndex = -1;

		for (int i=0; i<size; i++){
			if (current.element == e){
				matchIndex = i;
			}
			current = current.next;
		}

		return matchIndex;
	}

	@Override /** Replace the element at the specified position 
	*  in this list with the specified element. */
	public E set(int index, E e) {
		checkIndex(index);

		if (size == 0){
			return null;

		} else {
			Node<E> current = head;

			for (int i=0; i<=index; i++){
				current = current.next;
			}

			try {
				return current.element;

			} finally {
				if (size == 1){
					head.element = tail.element = e;
				} else {
					current.element = e;
				}
			}
		}
	}

	@Override /** Override iterator() defined in Iterable */
	public java.util.Iterator<E> iterator() {
		return new LinkedListIterator();
	}

	private void checkIndex(int index) {
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException
			("Index: " + index + ", Size: " + size);
	}
	
	private class LinkedListIterator implements java.util.Iterator<E> {
		private Node<E> current = head; // Current index 
		
		@Override
		public boolean hasNext() {
			return (current != null);
		}

		@Override
		public E next() {
			E e = current.element;
			current = current.next;
			return e;
		}

		@Override
		public void remove() {
			// COMPLETE THIS METHOD
		}
	}
	
	private static class Node<E> {
		E element;
		Node<E> next;

		public Node(E element) {
			this.element = element;
		}
	}
}
