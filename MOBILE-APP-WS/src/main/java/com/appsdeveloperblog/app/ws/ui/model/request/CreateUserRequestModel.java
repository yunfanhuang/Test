/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appsdeveloperblog.app.ws.ui.model.request;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author BOBO
 */
@XmlRootElement
public class CreateUserRequestModel {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * private String firstName; private String lastName; private String email;
     * private String password;
     *
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
