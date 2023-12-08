package com.example.securingweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * This Configuration class setups the route pattern using
 * specific endpoints which the user can access.
 *
 * <p>
 *     The index (/home) requires no authentication
 * </p>
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");    /* requires no authentication */
        registry.addViewController("/").setViewName("home");        /* requires no authentication */
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
    }

    /**
     * @note These endpoints allow the user to navigate through the webpages
     * moreover the user should be allowed to get into index (/home) without any require of
     * authentication
     *
     *
     */

}