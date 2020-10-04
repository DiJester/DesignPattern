package strategy;

import java.util.Arrays;

public class MyComparatorSort<T> {

	public void sort(T[] t,MyComparator<T> com) {
		
		for(int i=0;i<t.length-1;i++) {
			int minPos =i;
		for(int j = i+1;j<t.length;j++) {
			minPos = com.comapare(t[minPos], t[j])==-1 ? minPos:j;
			}
		swap(t,i,minPos);
		}
		
	}

	public  void swap(T[] t,int i,int minPos) {
		T temp = t[i];
		t[i] = t[minPos];
		t[minPos] = temp;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyComparatorSort<Cat> catSort = new MyComparatorSort<Cat>();
		
        Cat[] cats1 = {new Cat(2,3),new Cat(5,2),new Cat(3,4)};
		
        
        //根据猫的重量进行排序
		catSort.sort(cats1, new CatWeightComparator());
		
		System.out.println(Arrays.toString(cats1));
		
		//根据猫的高度进行排序
		catSort.sort(cats1, new CatHeightComparator());
		
		System.out.println(Arrays.toString(cats1));
		
		//lamda表达式写法
		catSort.sort(cats1, (o1,o2)->{
			if(o1.height<o2.height) return 1;
			else if(o1.height>o2.height) return -1;
			return 0;
		});
		
		System.out.println(Arrays.toString(cats1));
		
	}

}