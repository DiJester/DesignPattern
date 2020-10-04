package iterator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayList<T> extends MyCollection<T>{

	private static final int MAX_INT = 1<<31;
	private int capacity = 0;
	private int size =- 1;
	private Object[] data;
	
	public MyArrayList(int s){
		if(s>0) {
		  data  = new Object[s];
		  capacity = s;
		  size = 0;
		}
		else
			if(s == 0 ) {
				data = new Object[0];
				capacity = 0;
				size = 0; }
			else
				throw new IllegalArgumentException("Illegal Capacity: "+s);
	}
	public MyArrayList() {
		data = new Object[10];
		capacity = 10;
		size = 0;
	}
	@Override
	public void add(T data) {
		// TODO Auto-generated method stub
		if(size == capacity)
		{
			if(capacity*2<MAX_INT)
			{
			this.data = Arrays.copyOf(this.data, capacity*2);
			}
		}
		this.data[size++]=data;
	}
	public void remove(int i) {
		if(i>=0&&i<this.size)
		{
			int copyLength =  this.size - i- 1;
			System.arraycopy(this.data, i+1, this.data, i, copyLength);
			this.data[size--]=null;
		}
		else
			throw new IllegalArgumentException("Illegal Index: "+i);
		
	}
	public void remove(T o) {
		if(o==null||this.size()==0)
		 return;
		for(int i = 0 ; i<this.size();i++) {
			if(this.data[i].equals(o)) {
				System.arraycopy(this.data, i+1, this.data, i, this.size-i-1);
				this.data[size--]=null;
			}
		}
	}
	
	public void remove() {
		if(this.size>0)
		{
			this.data[size--]=null;
		}
		else
			return;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public MyIterator<T> iterator() {
		// TODO Auto-generated method stub
		return new MyArrayListIterator(this);
	}
	
	private class MyArrayListIterator<T> implements MyIterator<T>{

		private int pos;
		private MyArrayList<T> arrayList;
		public MyArrayListIterator(MyArrayList<T> list) {
			this.arrayList = list;
			pos = 0;
		}
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return pos<arrayList.size();
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			return (T) arrayList.data[pos++];
		}
		
	}
	
	
}

