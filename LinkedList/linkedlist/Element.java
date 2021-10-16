package linkedlist;

public class Element<Type> {
	private Type value;
	private Element<Type> next;

	public Element(Type value) {
		this.value = value;
	}

	public Type getValue() {
		return value;
	}

	public void setValue(Type value) {
		this.value = value;
	}

	public Element<Type> next() {
		return next;
	}

	public void setNext(Element<Type> next) {
		this.next = next;
	}

	public boolean hasNext() {
		return this.next != null;
	}
}
