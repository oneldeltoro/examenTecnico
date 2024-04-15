package com.prueba.tecnica.microservicio.domain.models.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;

@Data
public class WasteCenterAuthorizationEntityDto implements Serializable {

    @NotBlank(message = "El nombre es obligatorio")
    private String authorizationNumber;

    private WasteManagerEntityDTO entity;


}
