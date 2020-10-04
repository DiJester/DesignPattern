package chainofResponsibility;

public class FilterChainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String content = "Hello World! ^_^! nmsl! <Script>Filter Chain Test</Script>"
				+ " url = http://www.baidu.com";
		
		String content1 = "Hello World! ^_^! nmsl! <Script>Filter Chain Test</Script>"
				+ " url = http12://www.baidu.com";
		MSG msg = new MSG(content);
        FilterChain fc1 = new FilterChain();
        FilterChain fc2 = new FilterChain();
        //Á´Ê½±à³Ì
        fc1.addFilter(new HTMLFilter()).addFilter(new URLFilter());
        fc2.addFilter(new EmojiFilter()).addFilter(new SensitiveFilter());
        fc1.addFilterChain(fc2);
     
        System.out.println(fc1.doFilter(msg));
        System.out.println(msg.getMSG());
        MSG msg1 = new MSG(content1);
        fc1.doFilter(msg1);
        System.out.println(msg1.getMSG());
        
	}

}
