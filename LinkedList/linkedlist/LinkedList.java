package linkedlist;

public class LinkedList<Type> {
	private Element<Type> first;
	private Element<Type> last;
	private int length;

	public LinkedList() {
		this.length = 0;
	}

	public Element<Type> first() {
		return first;
	}

	public void setFirst(Element<Type> first) {
		this.first = first;
	}

	public Element<Type> last() {
		return last;
	}

	public void setLast(Element<Type> last) {
		this.last = last;
	}

	public int length() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void add(Type value) {
		Element<Type> newElement = new Element<Type>(value);

		if (this.first == null && this.last == null) {
			this.first = newElement;
		} else {
			this.last.setNext(newElement);
		}

		this.last = newElement;
		this.length++;
	}

	public void remove(Type value) {

		if (this.length() == 1) {
			this.first = null;
			this.last = null;
			this.length--;
		} else {
			Element<Type> past = null;
			Element<Type> current = this.first;

			for (int i = 0; i < this.length(); i++) {
				if (current.getValue().equals(value)) {

					if (current.equals(this.first)) {
						this.first = current.next();
						current.setNext(null);
					} else if (current.equals(this.last)) {
						this.last = past;
						past.setNext(null);
					} else {
						past.setNext(current.next());
						current = null;
					}

					this.length--;
					break;
				}

				past = current;
				current = current.next();
			}
		}
	}

	public Element<Type> get(int position) {
		Element<Type> current = this.first;

		for (int i = 0; i < position; i++) {
			if (current.hasNext()) {
				current = current.next();
			}
		}

		return current;
	}
	
	public IteratorLinkedList<Type> getIterator(){
		return new IteratorLinkedList<Type>(this.first);
	}

	@Override
	public String toString() {
		String linkedList = "[";

		for (int i = 0; i < this.length(); i++) {
			linkedList = linkedList.concat(String.valueOf(get(i).getValue()).concat(", "));
		}

		linkedList = linkedList.length() >= 2 ? linkedList.substring(0, linkedList.length() - 2).concat("]")
				: linkedList.concat("]");
		return linkedList;
	}
}
