package employeepackage.Employeemanagement.Springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Springconfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http){
        http.csrf(csrf->csrf.disable())
                .authorizeHttpRequests(authz->authz
                .requestMatchers("/employee/allemployee").hasRole("USER")
                        .requestMatchers("/employee/displayemp/**").authenticated()
                        .anyRequest().permitAll())
                .httpBasic(basic->{})
                .formLogin(form->form.permitAll());

       return http.build();


    }

   @Bean
   public UserDetailsService userDetailsService(){
        UserDetails user1= User.withUsername("max")
                .password( encry().encode("123") )
                .roles("ADMIN").build();
        UserDetails user2=User.withUsername("anand")
                .password(encry().encode("12345"))
                .roles("USER").build();
        return  new InMemoryUserDetailsManager(user1,user2);
    }

    @Bean
    public BCryptPasswordEncoder encry(){
        return  new BCryptPasswordEncoder();
    }
}
