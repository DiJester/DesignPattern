package chainofResponsibility.servletFilterChain;

public class ServletEmojiFilter extends ServletFilter {

	@Override
	public boolean doFilter(Request req, Response res, ServletFilterChain chain) {
		// TODO Auto-generated method stub
		req.setMSG(req.getMSG().replace("^_^","23333"));
		if(!chain.doFilter(req, res, chain))
			return false;
		res.setMSG(res.getMSG().replace("^_^","23333"));
		return true;
	}

}
