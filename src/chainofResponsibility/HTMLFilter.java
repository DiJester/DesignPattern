package chainofResponsibility;

public class HTMLFilter implements Filter{

	@Override
	public boolean doFilter(MSG msg) {
		// TODO Auto-generated method stub
		msg.setMSG(msg.getMSG().replace('<', '['));
		msg.setMSG(msg.getMSG().replace('>', ']'));
		return true;
	}

}
