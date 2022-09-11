package com.crud.hibernet.demo.repository;

import com.crud.hibernet.demo.model.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
}
