package io.bootique.mvc.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement()
@JsonPropertyOrder({"userName", "displayName"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User implements Serializable {

    public User() {
    }

    public User(String userName, String password, String displayName) {
        this.userName = userName;
        this.password = password;
        this.displayName = displayName;
    }

    private String userName;
    private String displayName;

    @JsonIgnore
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return "User{" +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", nicname='" + displayName + '\'' +
                '}';
    }
}