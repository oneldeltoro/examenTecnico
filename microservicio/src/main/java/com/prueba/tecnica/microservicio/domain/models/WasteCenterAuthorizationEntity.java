package com.prueba.tecnica.microservicio.domain.models;

import com.prueba.tecnica.microservicio.domain.models.base.BaseIdEntity;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Entity
@Table(name = "waste_center_authorization_entity")
@EqualsAndHashCode
public class WasteCenterAuthorizationEntity extends BaseIdEntity implements Serializable {

    @Column(name = "auth_number")
    private String authorizationNumber;
    @ManyToOne
    @JoinColumn(name = "waste_manager_entity_id", nullable = false)
    private WasteManagerEntity entity;


}
