package com.codesigne.myrh.repositories;

import com.codesigne.myrh.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruterRepository extends CrudRepository<UserEntity,Long> {
    UserEntity findByEmail(String email);
}
