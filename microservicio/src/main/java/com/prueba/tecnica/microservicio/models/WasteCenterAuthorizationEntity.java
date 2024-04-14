package com.prueba.tecnica.microservicio.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "waste_center_authorization_entity")
@EqualsAndHashCode
public class WasteCenterAuthorizationEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "auth_number")
    private String authorizationNumber;

    @ManyToOne
    @JoinColumn(name = "waste_manager_entity_id", nullable = false)
    private WasteManagerEntity entity;

    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    @Column(name = "created_date", insertable = false, updatable = false)
    private Date createdDate;
    @UpdateTimestamp
    @Temporal(TemporalType.DATE)
    @Column(name = "last_modified_date", insertable = false, updatable = false)
    private Date lastModifiedDate;
}
