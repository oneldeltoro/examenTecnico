package com.prueba.tecnica.microservicio.domain.service;

import com.prueba.tecnica.microservicio.domain.models.dto.WasteManagerEntityDto;
import com.prueba.tecnica.microservicio.domain.response.ServicesResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

public interface IWasteManagerService {
    ServicesResponse create (WasteManagerEntityDto wasteManagerDto,
                             BindingResult bindingResult ) throws Exception;
    ServicesResponse update( WasteManagerEntityDto dto,
                           BindingResult bindingResult ) throws Exception;
    ServicesResponse findById(long wasteManagerId) throws Exception;
    void deleteById(long wasteManagerId) throws Exception;
}
