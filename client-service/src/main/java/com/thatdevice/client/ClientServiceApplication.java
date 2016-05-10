package com.thatdevice.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CsrfFilter;

@SpringBootApplication
@EnableOAuth2Sso
public class ClientServiceApplication /*extends WebSecurityConfigurerAdapter */{

	public static void main(String[] args) {
		SpringApplication.run(ClientServiceApplication.class, args);
	}

//	@Override
//	public void configure(HttpSecurity http) throws Exception {
//		http.logout().and().antMatcher("/**").authorizeRequests()
//				.antMatchers("/index.html", "/home.html", "/", "/login").permitAll()
//				.anyRequest().authenticated();
//	}
}
