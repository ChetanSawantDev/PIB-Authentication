package com.pibauth.repositories;

import com.pibauth.entities.ResourceModuleMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface ResourceModuleRepo extends JpaRepository<ResourceModuleMaster, String> {
}
