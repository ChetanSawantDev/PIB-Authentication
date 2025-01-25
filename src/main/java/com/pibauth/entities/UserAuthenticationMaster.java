package com.pibauth.entities;

import jakarta.persistence.*;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "PIB_USER_AUTH_MASTER")
public class UserAuthenticationMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(length = 255)
    private String userMastId;

    @Column(length = 25,nullable = false,unique = true)
    private String userMastUsername;

    @Column(length = 15)
    private String userMastPassword;

    @Column(unique = true)
    private String userDetailsId;

    @OneToOne
    @JoinColumn(columnDefinition = "userRoleId")
    private UserRoleMaster userMastRole;

    @ManyToMany
    @JoinTable(
            name = "JT_USER_RESOURCE_MAPPING", // Name of the join table
            joinColumns = @JoinColumn(name = "user_auth_mast_id"), // Foreign key for UserRoleMaster
            inverseJoinColumns = @JoinColumn(name = "resource_mast_id") // Foreign key for ResourceMaster
    )
    private List<ResourceMaster> resourceMaster;

    @Column(nullable = false)
    private boolean isActiveUser;

    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private ZonedDateTime createdAt;

    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private ZonedDateTime updatedAt;

    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private ZonedDateTime lastLoggedInAt;

    private String companyId;


}
