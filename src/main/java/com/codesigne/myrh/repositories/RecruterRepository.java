package com.codesigne.myrh.repositories;

import com.codesigne.myrh.entities.RecruterEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruterRepository extends CrudRepository<RecruterEntity,Long> {
    RecruterEntity findByEmail(String email);
}
