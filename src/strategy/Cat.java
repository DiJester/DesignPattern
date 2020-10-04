package strategy;

public class Cat implements MyComparable<Cat> {
	public int weight;
	public int height;
	public Cat(int w, int h) {
		weight = w;
		height = h;
	}
	@Override
	public int compareTo(Cat o) {
		// TODO Auto-generated method stub
		if(weight<o.weight) return -1;
		else if(weight>o.weight) return 1;
		return 0;
	};
	
	public String toString(){
		return weight +","+height;	
	}
}
