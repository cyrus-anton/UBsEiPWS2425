public class RingListImpl implements RingList {
	
    private static class Element {
        int value;
        Element next;
    }

    private Element current;

    private Element previous() {
        if (current == null) 
        	return null;
        Element iterator = current;
        while (iterator.next != current) {
        	iterator = iterator.next;
        }
        return iterator;
    }

    @Override
    public void add(int value) {
        if (current == null) {
        	current = new Element();
        	current.value = value;
        	current.next = current;
        }
        else {
        	Element previous = previous();
        	previous.next = new Element();
        	previous.next.value = value;
        	previous.next.next = current;
        	
        }
    }

    @Override
    public int getCurrentValue() {
        return current.value;
    }

    @Override
    public void rotate() {
        current = previous();
    }

    public void rotateLeft() {
        current = current.next;
    }

    @Override
    public void removeCurrent() {
        if (current == null)
        	return;
        if (current.next == current) {
        	current = null;
        	return;
        }
        Element previous = previous();
        previous.next = current.next;
        current = current.next;
        	
    }

    @Override
    public boolean contains(int value) {
    	
    	if (current == null) 
    		return false;
    	
    	boolean found = false;
    	Element cursor = current;
    	
    	do {
    		if (cursor.value == value)
    			found = true;
    		cursor = cursor.next;
    	}
    	while 
    		(cursor != current);
    	return found;
    	
    }

    @Override
    public String toString() {
    	if (current == null)
    		return "[]";
  
    	StringBuilder str = new StringBuilder();
    	str.append('[');
    	str.append(current.value);
    	
    	Element iterator = current;
    	while (iterator.next != current) {
    		str.append(", ");
    		str.append(iterator.next.value);
    		iterator = iterator.next;
    	}
    	str.append(']');
    	return str.toString();
    	
    	
    	
    	
    	
    	/* String str = "[";
    	if (current != null) {
    		Element cursor = current;
    		while (cursor.next != current) {
    			str += cursor.value+ ", ";
    			cursor = cursor.next;
    		}
    		str += cursor.value;
    	}
    	str += "]";
    	return str;
    		*/
    	
    
    }
    
}
