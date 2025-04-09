package com.example.cwiczenia1503;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("custom")
public class configClass {

    private String loginUrl;
    private nestedCredentials credentials;

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public void setCredentials(nestedCredentials credentials) {
        this.credentials = credentials;
    }

    public nestedCredentials getCredentials() {
        return credentials;
    }

    public static class nestedCredentials{
        private String user;
        private String password;


        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
