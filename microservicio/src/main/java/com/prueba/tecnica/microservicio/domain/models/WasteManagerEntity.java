package com.prueba.tecnica.microservicio.domain.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "waste_manager_entity")
@EqualsAndHashCode
@Data
@NoArgsConstructor
public class WasteManagerEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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
    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    @Column(name = "created_date", insertable = false, updatable = false)
    private Date createdDate;
    @UpdateTimestamp
    @Temporal(TemporalType.DATE)
    @Column(name = "last_modified_date", insertable = false, updatable = false)
    private Date lastModifiedDate;
}
