package chainofResponsibility;

public class EmojiFilter implements Filter{

	@Override
	public boolean doFilter(MSG msg) {
		// TODO Auto-generated method stub
		msg.setMSG(msg.getMSG().replace("^_^","23333"));
		return true;
	}

}
