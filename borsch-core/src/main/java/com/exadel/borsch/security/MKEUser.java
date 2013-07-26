package com.exadel.borsch.security;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class MKEUser extends User {

    private static final long serialVersionUID = 1L;
    private com.exadel.borsch.entity.User user;

    public MKEUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public MKEUser(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }

    public com.exadel.borsch.entity.User getUser() {
        return user;
    }

    public void setUser(com.exadel.borsch.entity.User user) {
        this.user = user;
    }
}
