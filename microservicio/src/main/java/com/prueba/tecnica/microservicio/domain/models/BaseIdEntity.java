package com.prueba.tecnica.microservicio.domain.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
public abstract class BaseIdEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    @Basic(fetch = FetchType.EAGER)
    public Long id;

    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    @Column(name = "created_date", insertable = false, updatable = false)
    private Date createdDate;
    @UpdateTimestamp
    @Temporal(TemporalType.DATE)
    @Column(name = "last_modified_date", insertable = false, updatable = false)
    private Date lastModifiedDate;
}