package com.pibauth.repositories;

import com.pibauth.entities.UserRoleMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;


@Repository
public interface UserRoleMasterRepo extends JpaRepository<UserRoleMaster, String> {
}
