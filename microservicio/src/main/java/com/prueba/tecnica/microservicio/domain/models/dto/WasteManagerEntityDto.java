package com.prueba.tecnica.microservicio.domain.models.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
public class WasteManagerEntityDto  implements Serializable {

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;
    @NotBlank(message = "El identificador es obligatorio")
    private String nif;

    private WasteManagerAddressEntityDto wasteManagerAddressEntity;

    private List<WasteCenterAuthorizationEntityDto>
            listOfWasteCenterAuthorization = new ArrayList<>();
    private Boolean isEnabled = Boolean.TRUE;

}
