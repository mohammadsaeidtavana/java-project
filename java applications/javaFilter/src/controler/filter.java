package controler;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by saeedtavana on 7/14/17.
 */
public class filter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("this filter is applied only for fisrt servlet call serv");
        System.out.println("the ip address for clinet is"+servletRequest.getRemoteAddr());
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
