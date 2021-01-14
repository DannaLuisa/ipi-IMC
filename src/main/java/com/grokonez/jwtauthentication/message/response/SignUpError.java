package com.grokonez.jwtauthentication.message.response;


public class SignUpError {
    private String message;
    private String status = "Error";

    public SignUpError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
}
