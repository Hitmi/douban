package cn.analysys.douban.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description:
 *
 * @author houyi
 * @version 1.0
 * @date 2020/1/6 13:29
 * @since JDK 1.8
 */

@Component
@Slf4j
public class CorsFilter implements Filter {


    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT, GET");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");

        String curOrigin = request.getHeader("Origin");
        System.out.println("###跨域过滤器->当前访问来源->"+curOrigin+"###");
        log.error("###跨域过滤器->当前访问来源->"+curOrigin+"###");
        chain.doFilter(req, res);
    }
    @Override
    public void init(FilterConfig filterConfig) {}

    @Override
    public void destroy() {}
}