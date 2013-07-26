package com.exadel.borsch.security;

import com.exadel.borsch.entity.User;
import com.exadel.borsch.service.UserService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;

public class MKEUserDetailsServiceImpl implements UserDetailsService, InitializingBean {
    private PasswordEncoder passwordEncoder;

    private String adminUsername;
    private String adminPassword;

    @Autowired
    private UserService userService;

    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public void afterPropertiesSet() throws Exception {
        this.adminPassword = passwordEncoder.encodePassword(adminPassword, null);
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final User user;
        final MKEUser mkeuser;
        if (adminUsername.equals(username)) {
            mkeuser = new MKEUser(
                    adminUsername,
                    adminPassword,
                    new ArrayList<GrantedAuthority>() {
                        {
                            add(new SimpleGrantedAuthority("ROLE_ADMIN"));
                        }
                    }
            );
            user = new User(null, adminUsername, null, "ROLE_ADMIN",null,null);
            mkeuser.setUser(user);
        } else {

            user = userService.findUser(username);

            mkeuser = new MKEUser(
                    user.getLogin(),
                    user.getPassword(),
                    new ArrayList<GrantedAuthority>() {
                        {
                            add(new SimpleGrantedAuthority(user.getRole()));
                        }
                    }
            );
            user.setPassword(null);
            mkeuser.setUser(user);
        }

        return mkeuser;
    }
}
