package caioneves05.barber_cut_server.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Value("${username.default}")
    private String defaultUsername;

    @Value("${password.default}")
    private String passwordDefault;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return User.builder()
                .username(defaultUsername)
                .password("{noop}%s".formatted(passwordDefault))
                .build();
    }
}
