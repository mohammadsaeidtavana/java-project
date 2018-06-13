import javax.servlet.*;
import java.io.IOException;

/**
 * Created by saeedtavana on 2/7/18.
 */
public class classFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        String ip =servletRequest.getRemoteAddr();
        System.out.println("ip address of the usr connected is : "+ ip);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
