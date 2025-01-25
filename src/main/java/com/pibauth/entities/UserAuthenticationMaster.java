package com.pibauth.entities;

import jakarta.persistence.*;
import java.time.ZonedDateTime;

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
