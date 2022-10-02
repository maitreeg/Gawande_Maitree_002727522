/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aed.model;

/**
 *
 * @author mg
 */
public class Contact_Info {
    private String contactNumber;
    private String email;

    public Contact_Info(String contactNumber, String email) {
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact_Info{" + "contactNumber=" + contactNumber 
            + ", email=" + email + '}';
    }
    
    
    

	
}
