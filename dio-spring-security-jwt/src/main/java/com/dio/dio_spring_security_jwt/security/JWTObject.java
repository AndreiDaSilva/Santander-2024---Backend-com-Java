package com.dio.dio_spring_security_jwt.security;

import java.util.Date;
import java.util.List;

import io.jsonwebtoken.lang.Arrays;

public class JWTObject {
    private String subject;
    private Date issuedAt;
    private Date expiration;
    private List<String> roles;

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the issuedAt
     */
    public Date getIssuedAt() {
        return issuedAt;
    }

    /**
     * @param issuedAt the issuedAt to set
     */
    public void setIssuedAt(Date issuedAt) {
        this.issuedAt = issuedAt;
    }

    /**
     * @return the expiration
     */
    public Date getExpiration() {
        return expiration;
    }

    /**
     * @param expiration the expiration to set
     */
    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    /**
     * @return the roles
     */
    public List<String> getRoles() {
        return roles;
    }

    /**
     * @param roles the roles to set
     */
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public void setRoles(String... roles) {
        this.roles = Arrays.asList(roles);
    }
}
