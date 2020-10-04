package chainofResponsibility.servletFilterChain;

public class ServletURLFilter extends ServletFilter{

	@Override
	public boolean doFilter(Request req, Response res, ServletFilterChain chain) {
		// TODO Auto-generated method stub
		if(!(req.getMSG().contains("http://")||req.getMSG().contains("https://"))) 
			return false;
		if(!chain.doFilter(req, res, chain))
			return false;
		if(!(res.getMSG().contains("http://")||res.getMSG().contains("https://"))) 
			return false;
		return true;
	}

}
