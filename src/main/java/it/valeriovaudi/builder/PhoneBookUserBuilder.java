package it.valeriovaudi.builder;

import it.valeriovaudi.web.model.PhoneBookUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.Column;

/**
 * Created by Valerio on 22/10/2014.
 */
public class PhoneBookUserBuilder {
    private PhoneBookUser phoneBookUser;

    private PasswordEncoder passwordEncoder;

    @Autowired
    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public PhoneBookUserBuilder buildId(Long id){
        this.phoneBookUser.setId(id);
        return this;
    }

    public PhoneBookUserBuilder buildUserName(String userName){
        this.phoneBookUser.setUserName(userName);
        return this;
    }

    public PhoneBookUserBuilder buildPassword(String password){
        this.phoneBookUser.setPassword(passwordEncoder.encode(password));
        return this;
    }

    public PhoneBookUserBuilder buildFirstName(String firstName){
        this.phoneBookUser.setFirstName(firstName);
        return this;
    }

    public PhoneBookUserBuilder buildLastName(String lastName){
        this.phoneBookUser.setLastName(lastName);
        return this;
    }

    public PhoneBookUserBuilder buildMail(String mail){
        this.phoneBookUser.setMail(mail);
        return this;
    }

    public PhoneBookUser buildPhoneBookUser(){
        return phoneBookUser;
    }

}
