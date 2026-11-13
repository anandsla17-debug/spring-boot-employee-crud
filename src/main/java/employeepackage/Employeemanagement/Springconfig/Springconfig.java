package employeepackage.Employeemanagement.Springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Springconfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http){
        http.authorizeHttpRequests(authz->authz
                .requestMatchers("/employee/allemployee").permitAll())
                .httpBasic(basic->{})
                .formLogin(form->form.permitAll());

       return http.build();


    }

}
