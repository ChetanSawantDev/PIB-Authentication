package com.pibauth.entities;

import jakarta.persistence.*;

import java.time.ZonedDateTime;

@Entity
public class ResourceModuleMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String resourceModuleId;
    private String resourceModuleName;
    private String resourceModuleDesc;
    private String resourceModuleImg;


    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private ZonedDateTime createdAt;

    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private ZonedDateTime updatedAt;

}
