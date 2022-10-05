package fr.caensup.rest.messagerie.repository;

import org.springframework.data.repository.CrudRepository;

import fr.caensup.rest.messagerie.models.Organization;

public interface OrganizationRepo extends CrudRepository<Organization, Integer> {

}
