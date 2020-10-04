package chainofResponsibility.servletFilterChain;

import java.util.ArrayList;
import java.util.List;

import chainofResponsibility.Filter;

public class ServletFilterChain extends ServletFilter{

	private List<ServletFilter> list;
	private int currentFilterIndex = -1;
	
    public ServletFilterChain() {
    	list = new ArrayList<ServletFilter>(); 
    } 
	
	public boolean doFilter(Request req, Response res, ServletFilterChain chain) {
		// TODO Auto-generated method stub
		chain.incIndex();
		if(chain.getIndex()==chain.getChainLength())
			return true;
		else
			if(!chain.getCurrentFilter().doFilter(req,res,chain))
		      return false;
			else
			 return true;
	}
	
    public ServletFilterChain addFilter(ServletFilter filter) {
    	if(filter.getClass()==this.getClass())
    	{
    		System.out.println("Cannot add a filter chain by this method,"
    				+ " use addFilterChain() instead.");
    		return this;
    	}
    	list.add(filter);
    	return this;
    }
    public ServletFilterChain addFilterChain(ServletFilterChain chain) {
    	list.addAll(chain.getFilterList());
    	return this;
    }
    
    public void removeFilter(int index) {
    	
    	list.remove(index);
    }
    public int getChainLength() {
    	return list.size();
    }
    public int getIndex() {
    	return currentFilterIndex;
    }
    public ServletFilter getCurrentFilter() {
    	return list.get(currentFilterIndex);
    }
    public void incIndex() {
    	currentFilterIndex++;
    }
    public List<ServletFilter> getFilterList()
    {
    	return list;
    }
}
