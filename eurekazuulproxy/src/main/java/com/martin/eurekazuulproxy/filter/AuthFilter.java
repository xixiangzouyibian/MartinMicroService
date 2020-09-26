package com.martin.eurekazuulproxy.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

/**
 * TODO Can integrate with JWT here
 */
@Component
public class AuthFilter extends ZuulFilter {

    public String filterType() {
        return null;
    }

    public int filterOrder() {
        return 0;
    }

    public boolean shouldFilter() {
        return false;
    }

    public Object run() throws ZuulException {
        return null;
    }
}
