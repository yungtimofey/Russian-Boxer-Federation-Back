package com.example.cusa4.security.models;

import com.example.cusa4.models.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

@Getter
@Setter
public class OurAuthToken extends AbstractAuthenticationToken {

    private User principal;
    private int userId;

    public OurAuthToken(int userId, User principal, Collection<? extends GrantedAuthority> authorities) {
        super(authorities);
        this.principal = principal;
        this.userId = userId;
        super.setAuthenticated(true);
    }

    @Override
    public Object getCredentials() {
        return null;
    }
}