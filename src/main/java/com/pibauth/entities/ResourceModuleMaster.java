package com.pibauth.entities;

import jakarta.persistence.*;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

@Entity
public class ResourceModuleMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String resourceModuleId;
    private String resourceModuleName;
    private String resourceModuleDesc;
    private String resourceModuleImg;

    @OneToMany(mappedBy = "resourceModuleMaster")
    private List<ResourceMaster> resourceMasterList;

    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private ZonedDateTime createdAt;

    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private ZonedDateTime updatedAt;

}
