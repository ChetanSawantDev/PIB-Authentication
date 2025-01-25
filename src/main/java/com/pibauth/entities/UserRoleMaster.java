package com.pibauth.entities;

import jakarta.persistence.*;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

@Entity
public class UserRoleMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userRoleId;

    @Column(length = 30)
    private String userRoleName;

    @Column(length = 100)
    private String userRoleDescription;

    @ManyToMany
    @JoinTable(
            name = "JT_ROLE_RESOURCE_MAPPING",
            joinColumns = @JoinColumn(name = "role_mast_id"),
            inverseJoinColumns = @JoinColumn(name = "resource_mast_id")
    )
    private List<ResourceMaster> resourceMaster;

    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private ZonedDateTime createdAt;

    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private ZonedDateTime updatedAt;


}
