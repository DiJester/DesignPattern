package strategy;

public class CatWeightComparator implements MyComparator<Cat>{

	
	@Override
	public int comapare(Cat o1, Cat o2) {
		// TODO Auto-generated method stub
		if(o1.weight<o2.weight) return -1;
		else if(o1.weight>o2.weight) return 1;
		return 0;
	}

}
