package chainofResponsibility.servletFilterChain;

public abstract class ServletFilter {
   public abstract boolean doFilter(Request req,Response res,ServletFilterChain chain);
}
