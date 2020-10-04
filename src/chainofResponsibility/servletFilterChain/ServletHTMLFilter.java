package chainofResponsibility.servletFilterChain;

public class ServletHTMLFilter extends ServletFilter {

	@Override
	public boolean doFilter(Request req, Response res, ServletFilterChain chain) {
		// TODO Auto-generated method stub
		req.setMSG(req.getMSG().replace('<', '['));
		req.setMSG(req.getMSG().replace('>', ']'));
		if(!chain.doFilter(req, res, chain))
			return false;
		res.setMSG(res.getMSG().replace('<', '['));
		res.setMSG(res.getMSG().replace('>', ']'));
		return true;
	}

}
