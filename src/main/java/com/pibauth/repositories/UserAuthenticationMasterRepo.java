package com.pibauth.repositories;

import com.pibauth.entities.UserAuthenticationMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserAuthenticationMasterRepo extends JpaRepository<UserAuthenticationMaster, String> {
}
