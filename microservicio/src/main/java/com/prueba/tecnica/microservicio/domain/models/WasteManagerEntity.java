package com.prueba.tecnica.microservicio.domain.models;

import com.prueba.tecnica.microservicio.domain.models.base.BaseIdEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "waste_manager_entity")
@EqualsAndHashCode
@Data
@NoArgsConstructor
public class WasteManagerEntity extends BaseIdEntity implements Serializable {

    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "nif", nullable = false)
    private String nif;
    @ManyToOne
    @JoinColumn(name = "waste_manager_address_entity_id", nullable = false)
    private WasteManagerAddressEntity wasteManagerAddressEntity;
    @OneToMany(mappedBy = "entity", fetch = FetchType.EAGER)
    private List<WasteCenterAuthorizationEntity>
            listOfWasteCenterAuthorization = new ArrayList<>();
    private Boolean isEnabled = Boolean.TRUE;
    @Version
    private Long version = 0L;

}
