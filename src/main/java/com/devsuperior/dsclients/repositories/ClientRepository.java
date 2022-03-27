package com.devsuperior.dsclients.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsclients.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
