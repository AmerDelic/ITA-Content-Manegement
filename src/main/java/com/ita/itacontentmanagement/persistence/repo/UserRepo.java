package com.ita.itacontentmanagement.persistence.repo;

import com.ita.itacontentmanagement.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
