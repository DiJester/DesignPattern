package chainofResponsibility.servletFilterChain;

public class ServletSensitiveFilter extends ServletFilter{

	@Override
	public boolean doFilter(Request req, Response res, ServletFilterChain chain) {
		// TODO Auto-generated method stub
		if(req.getMSG().contains("nmsl")) {
			req.setMSG(req.getMSG().replace("nmsl", "23333"));
			return false;
		}
		if(!chain.doFilter(req, res, chain))
			return false;
		if(res.getMSG().contains("nmsl")) {
			res.setMSG(res.getMSG().replace("nmsl", "23333"));
			return false;
		}
		return true;		
	}

}
