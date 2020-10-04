package strategy;

public class CatHeightComparator implements MyComparator<Cat> {

	@Override
	public int comapare(Cat o1, Cat o2) {
		// TODO Auto-generated method stub
		if(o1.height<o2.height) return -1;
		else if(o1.height>o2.height) return 1;
		return 0;
	}

}
