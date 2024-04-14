package com.prueba.tecnica.microservicio.domain.models;

import com.prueba.tecnica.microservicio.domain.models.base.BaseIdEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import java.io.Serializable;

@Entity
@Table(name = "waste_manager_address_entity")
@EqualsAndHashCode
@Data
@NoArgsConstructor
public class WasteManagerAddressEntity extends BaseIdEntity implements Serializable {

    private String direccion;
    private Boolean isEnabled = Boolean.TRUE;
    @Version
    private Long version = 0L;

}
