package fr.caensup.rest.messagerie.repository;

import org.springframework.data.repository.CrudRepository;

import fr.caensup.rest.messagerie.models.User;

public interface UserRepo extends CrudRepository<User, Integer> {

}
