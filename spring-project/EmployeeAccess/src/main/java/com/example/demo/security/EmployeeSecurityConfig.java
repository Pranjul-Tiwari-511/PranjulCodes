package com.example.demo.security;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class EmployeeSecurityConfig {
    
	   @Bean
	    public UserDetailsManager userDetailsManager(DataSource dataSource) {
	         return new JdbcUserDetailsManager(dataSource); 
	    }

	  

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/login", "/css/**", "/js/**", "/images/**").permitAll()
                .requestMatchers("/employees/list","/employees/showFormForAdd").hasAnyRole("EMPLOYEE", "MANAGER", "ADMIN")
                .requestMatchers("/employees/showFormForUpdate").hasAnyRole("MANAGER","ADMIN")
                .requestMatchers("/employees/delete").hasAnyRole("ADMIN")	
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .loginPage("/employees/login")
                .loginProcessingUrl("/employees/loginDetails")
                .defaultSuccessUrl("/employees/list", true)
                .failureUrl("/employees/login?error=true")
                .permitAll()
            )
            .logout(logout -> logout
                .logoutUrl("/logout")
                .logoutSuccessUrl("/employees/login?logout=true")
                .permitAll()
            )
            .csrf(csrf -> csrf.disable()); 

        return http.build();
    }
}