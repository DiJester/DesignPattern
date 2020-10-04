package chainofResponsibility;

public class URLFilter implements Filter{

	@Override
	public boolean doFilter(MSG msg) {
		// TODO Auto-generated method stub
		if(!(msg.getMSG().contains("http://")||msg.getMSG().contains("https://"))) {
			return false;
		}
		return true;
	}

}
