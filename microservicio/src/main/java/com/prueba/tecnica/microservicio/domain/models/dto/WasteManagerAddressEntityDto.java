package com.prueba.tecnica.microservicio.domain.models.dto;

import com.prueba.tecnica.microservicio.domain.models.base.BaseIdEntity;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@EqualsAndHashCode
@Data
@NoArgsConstructor
public class WasteManagerAddressEntityDto  implements Serializable {
    @NotBlank(message = "la direccion es obligatoria")
    private String direccion;
    private Boolean isEnabled = Boolean.TRUE;


}
