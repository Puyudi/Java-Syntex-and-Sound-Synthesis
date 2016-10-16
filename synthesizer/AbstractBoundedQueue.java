// declare a package
package synthesizer;

public abstract class AbstractBoundedQueue<T> implements BoundedQueue {

	protected int fillCount;
	protected int capacity;
	public int capacity() {
		return capacity;
	}
	public int fillCount() {
		return fillCount;
	}
}
	// public boolean isEmpty();
	// public boolean isFull();
	// public abstract T peek();
	// public abstract T dequeue();
	// public abstract void enqueue(T x);

	// int capacity();          // return size of the buffer
	// int fillCount();         // return number of items currently in the buffer
	// void enqueue(T x);  // add item x to the end
	// T dequeue();        // delete and return item from the front
	// T peek();           // return (but do not delete) item from the front
	// default boolean isEmpty() {
	// 	return (fillCount() == 0);
	// }      // is the buffer empty (fillCount equals zero)?
	// default boolean isFull() {
	// 	return (fillCount() == capacity());
	// }        // is the buffer full (fillCount is same as capacity)?

	// abstract void moveTo(double deltaX, double deltaY);
