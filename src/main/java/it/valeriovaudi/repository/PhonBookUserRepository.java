package it.valeriovaudi.repository;

import it.valeriovaudi.web.model.PhoneBookUser;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Valerio on 30/07/2014.
 */
public interface PhonBookUserRepository extends CrudRepository<PhoneBookUser,Long> {
    public PhoneBookUser findByUserName(String userName);
}
