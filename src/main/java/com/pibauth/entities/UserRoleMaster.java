package com.pibauth.entities;

import jakarta.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "PIB_USER_ROLE_MASTER")
public class UserRoleMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userRoleId;

    @Column(length = 30)
    private String userROleName;

    @Column(length = 100)
    private String userRoleDescription;

    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private ZonedDateTime createdAt;

    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private ZonedDateTime updatedAt;


}
