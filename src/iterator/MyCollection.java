package iterator;

public abstract class MyCollection<T>{
	public abstract void add(T data);
	public abstract int size();
	public abstract MyIterator<T> iterator();

}
