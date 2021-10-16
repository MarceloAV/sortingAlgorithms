package linkedlist;

public class IteratorLinkedList<Type> {
	private Element<Type> element;

	public IteratorLinkedList(Element<Type> current) {
		this.element = current;
	}

	public boolean hasNext() {
		return this.element.hasNext();
	}

	public Element<Type> next() {
		this.element = this.element.next();
		return this.element.next();
	}
}
