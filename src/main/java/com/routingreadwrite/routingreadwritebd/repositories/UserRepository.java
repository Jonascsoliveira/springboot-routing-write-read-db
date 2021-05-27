package com.routingreadwrite.routingreadwritebd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.routingreadwrite.routingreadwritebd.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
