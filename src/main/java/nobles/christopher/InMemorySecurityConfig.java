package nobles.christopher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

/**
 * Created by christophernobles on 10/26/16.
 */
public class InMemorySecurityConfig {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user").password("password").roles("USER")
                .and().withUser("admin").password("admin").roles("USER", "ADMIN");
    }
}
