package com.sgl.smartpra.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgl.smartpra.app.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, String>{

}
