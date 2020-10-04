package chainofResponsibility;

public class SensitiveFilter implements Filter{

	@Override
	public boolean doFilter(MSG msg) {
		// TODO Auto-generated method stub
		if(msg.getMSG().contains("nmsl")) {
			msg.setMSG(msg.getMSG().replace("nmsl", "23333"));
			return false;
		}
		return true;
	}

}
