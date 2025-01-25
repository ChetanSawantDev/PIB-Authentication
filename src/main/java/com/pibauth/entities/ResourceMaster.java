package com.pibauth.entities;

import jakarta.persistence.*;
import java.time.ZonedDateTime;


@Entity
public class ResourceMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String resourceMasterId;

    private String resourceName;

    @ManyToOne()
    private ResourceModuleMaster resourceModuleMaster;

    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private ZonedDateTime createdAt;

    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private ZonedDateTime updatedAt;


}

