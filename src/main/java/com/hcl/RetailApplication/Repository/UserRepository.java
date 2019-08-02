package com.hcl.RetailApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.stereotype.Repository;

import com.hcl.RetailApplication.Entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,String> {
User findByUserNameAndPassword(String userName,String password);
}
