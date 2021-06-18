package main;

public class ArrayQueue<T> {
	private T[]airplanes;
	private int frontQueue;
	private int rearQueue;
	private int qCount;
	@SuppressWarnings("unchecked")
	ArrayQueue(){
		airplanes = (T[])new Object[1440];
		 qCount = 0;
		 frontQueue = 0;
		 rearQueue = -1;
		 qCount = 0;
	}
	//isEmpty
	public boolean isEmpty(){
		return (qCount == 0);
	}
	//count
	public int count() {
		return qCount;
	}
	//peek
	public T peek(){
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		return airplanes[frontQueue];
	}
	//dequeue
	public T dequeue(int i) {
		if(isEmpty()) {
			return null;
		}
		T removed = airplanes[frontQueue];
		airplanes[frontQueue] = null;
		frontQueue = (frontQueue + 1) % airplanes.length;
		qCount--;
		return removed;
	}
	//enqueue
	public boolean enqueue(T contents) {
		rearQueue = (rearQueue + 1) % airplanes.length;
		airplanes[rearQueue] = contents;
		qCount++;
		return true;
	}


	
}
