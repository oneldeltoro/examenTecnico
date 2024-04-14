package com.prueba.tecnica.microservicio.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "waste_manager_address_entity")
@EqualsAndHashCode
@Data
@NoArgsConstructor
public class WasteManagerAddressEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String direccion;
    private Boolean isEnabled = Boolean.TRUE;
    @Version
    private Long version = 0L;
    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    @Column(name = "created_date", insertable = false, updatable = false)
    private Date createdDate;
    @UpdateTimestamp
    @Temporal(TemporalType.DATE)
    @Column(name = "last_modified_date", insertable = false, updatable = false)
    private Date lastModifiedDate;
}
