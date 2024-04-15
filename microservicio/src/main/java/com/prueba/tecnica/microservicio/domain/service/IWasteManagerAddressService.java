package com.prueba.tecnica.microservicio.domain.service;

import com.prueba.tecnica.microservicio.domain.models.dto.WasteManagerAddressEntityDto;
import com.prueba.tecnica.microservicio.domain.models.dto.WasteManagerEntityDto;
import com.prueba.tecnica.microservicio.domain.response.ServicesResponse;
import org.springframework.validation.BindingResult;

public interface IWasteManagerAddressService {
    ServicesResponse create (WasteManagerAddressEntityDto wasteManagerDto,
                             BindingResult bindingResult ) throws Exception;
    ServicesResponse update( WasteManagerAddressEntityDto dto,
                           BindingResult bindingResult ) throws Exception;
    ServicesResponse findById(long wasteManagerAddressId) throws Exception;
    void deleteById(long wasteManagerAddressId) throws Exception;
}
