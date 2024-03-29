package fr.ulco.springshop.model.form;

import java.io.Serializable;

public class LoginForm implements Serializable {
    private String username;
    private String password;

    //need default constructor for JSON Parsing
    public LoginForm()
    {

    }
    public LoginForm(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }
    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}