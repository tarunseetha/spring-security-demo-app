package com.seetha.springsecurityjpa.repository;

import com.seetha.springsecurityjpa.entity.UserMaster;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserMaster, Long> {

    Optional<UserMaster> findByUserName(String userName);
}
