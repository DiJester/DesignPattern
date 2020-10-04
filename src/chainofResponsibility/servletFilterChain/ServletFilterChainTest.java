package chainofResponsibility.servletFilterChain;

import chainofResponsibility.EmojiFilter;
import chainofResponsibility.FilterChain;
import chainofResponsibility.HTMLFilter;
import chainofResponsibility.MSG;
import chainofResponsibility.SensitiveFilter;
import chainofResponsibility.URLFilter;

public class ServletFilterChainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Request req = new Request("Hello Baidu!  ^_^! nmsl! <Script>Filter Chain Test</Script>"
				+ " url = http://www.baidu.com");
		
		Response res = new Response("Hello Client! ^_^! nmsl! <Script>Filter Chain Test</Script>"
				+ " url = http://www.baidu.com");
        ServletFilterChain fc1 = new ServletFilterChain();
        ServletFilterChain fc2 = new ServletFilterChain();
        //Á´Ê½±à³Ì
        fc1.addFilter(new ServletHTMLFilter()).addFilter(new ServletURLFilter());
        fc2.addFilter(new ServletEmojiFilter()).addFilter(new ServletSensitiveFilter());
        fc1.addFilterChain(fc2);
        
        System.out.println(fc1.doFilter(req,res,fc1));
        System.out.println(req.getMSG());
        System.out.println(res.getMSG());
	}

}
