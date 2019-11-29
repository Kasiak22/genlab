package com.my.project.genlab.repositories;

import org.springframework.data.repository.CrudRepository;
import com.my.project.genlab.entities.users.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

        public Optional<User> findUserByFirstName(String firstName);

}
