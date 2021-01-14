package com.grokonez.jwtauthentication.message.response;

public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private String status = "Success";
    private String idUser;
    private String name ="";

    public JwtResponse(String accessToken, String idUser, String name) {
        this.token = accessToken;
        this.idUser = idUser;
        this.name = name;
    }

    public String getAccessToken() {
        return token;
    }

    public void setAccessToken(String accessToken) {
        this.token = accessToken;
    }

    public String getTokenType() {
        return type;
    }

    public void setTokenType(String tokenType) {
        this.type = tokenType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}