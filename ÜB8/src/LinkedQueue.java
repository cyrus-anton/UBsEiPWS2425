public class LinkedQueue implements Queue {
	
	private static class QueueElement {
		int value;
		QueueElement next;
		QueueElement(int value) {
			this.value = value;
		}
		
	}

	private QueueElement head;
	private QueueElement tail;
	int size;
	

	@Override
	public void append(int value) {
		QueueElement newElement = new QueueElement(value);
		if (head == null) {
			head = tail = newElement;
			
		}
		else {	
			tail.next = newElement;
			tail = newElement;
		}
		size++;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public void remove() {
	  /*	if (head != null) {
			head = head.next;
		}
		*/
		if (head == tail) {
			head = tail = null;
			return;
		}
		head = head.next;
	}

	@Override
	public int peek() {
		if (isEmpty())
			return EMPTY_VALUE;
		return head.value;
	}

	private int length() {
		/* int size = 0;
		QueueElement cursor = head;
		while (cursor!= null) {
			cursor = cursor.next;
			size++;
		}
		return size;
		*/
		return size;
	}

	@Override
	public int[] toArray() {
		int [] array = new int[length()];
		int i = 0;
		QueueElement cursor = head;
		while (cursor != null) {
			array[i] = cursor.value;
			cursor = cursor.next;
			i++;
		}
		return array;
	}
}
