/*
 * This class will configure Spring Boot to authenticate all requests and to use
 * an OAuth 2.0 resource server with JWT authentication and authorization
*/
package com.mongodb.mongodbouth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author Mitchell Ibarra
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter
{
    @Override
    public void configure(HttpSecurity aHTTP) throws Exception
    {
        aHTTP.authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .oauth2ResourceServer()
                .jwt();
    }
}
