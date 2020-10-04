package iterator;

public class MyLinkedList<T> extends MyCollection<T>{

	public Node<T> head = null;
	public Node<T> tail = null;
	public int size = 0;
	private class Node<T>{
		public T data;
		public Node<T> next;
		public Node(T d) {
			this.data = d;
			next = null;
		}
	}
    public MyLinkedList()
    {
    }
	@Override
	public void add(T data) {
		// TODO Auto-generated method stub
		if(head==null&&tail==null)
		{
			head = new Node<T>(data);
			tail = head;
		}
		else
		{
			tail.next = new Node<T>(data);
			tail = tail.next;
		}
		size++;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	public void remove(T o) {
		if(o==null||this.size==0)
		  return;
		Node<T> last = null;
		Node<T> n;
		for(n = this.head; n!=null;) {
			if(n.data.equals(o)) {
				Node<T> temp;
				if(last!=null) {
					last.next = n.next;
					last = temp = n;
					n=n.next;
				}
				else {
					head=head.next;
					last = temp = head;
					n=n.next;
				}
				temp.data = null;
				temp.next = null;
				size--;
			}
			else {
				last = n;
				n=n.next;
			}
		}
		
	}

	@Override
	public MyIterator<T> iterator() {
		// TODO Auto-generated method stub
		return new MyLinkedListIterator(this);
	}
	
	private class MyLinkedListIterator<T> implements MyIterator<T>{

		private MyLinkedList<T>.Node<T> pos;
		private MyLinkedList<T> list;
		public MyLinkedListIterator(MyLinkedList<T> l) {
			this.list = l;
			pos = list.head;
		}
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return !(pos==null);
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			T d = pos.data;
			pos = pos.next;
			return d;
		}
		
	}

}
