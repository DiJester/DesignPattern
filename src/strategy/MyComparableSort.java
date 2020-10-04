package strategy;

import java.util.Arrays;

public class MyComparableSort {

	public static void sort(MyComparable[] t) {
		
		for(int i=0;i<t.length-1;i++) {
			int minPos =i;
		for(int j = i+1;j<t.length;j++) {
			minPos = t[minPos].compareTo(t[j])==-1 ? minPos:j;
			}
		swap(t,i,minPos);
		}
		
	}

	
	public static void swap(MyComparable[] t,int i,int minPos) {
		MyComparable temp = t[i];
		t[i] = t[minPos];
		t[minPos] = temp;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyComparable[] cats = {new Cat(1,3),new Cat(5,2),new Cat(2,4)};
		
		MyComparableSort.sort(cats);
		
		System.out.println(Arrays.toString(cats));

	}

}
