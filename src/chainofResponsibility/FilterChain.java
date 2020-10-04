package chainofResponsibility;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//FilterChainʵ��Filter�ӿڣ���������FilterChainҲ����add����

public class FilterChain implements Filter{ 

	private List<Filter> list;
	public FilterChain() {
		list = new ArrayList(); 
	}
	public boolean doFilter(MSG msg) {
		// TODO Auto-generated method stub
		for(Filter filter: list)
		{
			if(!filter.doFilter(msg)) 
				return false;
		}
		return true;
	}
	
	public FilterChain addFilter(Filter filter) {
		if(filter.getClass()==this.getClass())
		{
			System.out.println("Cannot add a filter chain by this method, "
					+ "use addFilterChain() instead.");
	        return this;
		}
		list.add(filter);
		return this;       //addFilter()����thisʵ������ʽ���
	}
	public FilterChain addFilterChain(FilterChain chain) {
		list.addAll(chain.getFilterList());
		return this;       //addFilter()����thisʵ������ʽ���
	}
	public List<Filter> getFilterList()
	{
		return list;
	}
	
	public void removeFilter(int i) {
		list.remove(i);
	}
	public int getChainLength() {
		return list.size();
	}

}
