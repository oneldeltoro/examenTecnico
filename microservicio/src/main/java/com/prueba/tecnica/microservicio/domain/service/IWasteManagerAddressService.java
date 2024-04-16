package com.prueba.tecnica.microservicio.domain.service;

import com.prueba.tecnica.microservicio.application.request.WasteManagerAddressEntityDto;
import com.prueba.tecnica.microservicio.application.response.ServicesResponse;
import org.springframework.validation.BindingResult;

public interface IWasteManagerAddressService {
    ServicesResponse create (WasteManagerAddressEntityDto wasteManagerDto,
                             BindingResult bindingResult ) throws Exception;
    ServicesResponse update( WasteManagerAddressEntityDto dto,
                           BindingResult bindingResult ) throws Exception;
    ServicesResponse findById(long wasteManagerAddressId) throws Exception;
    void deleteById(long wasteManagerAddressId) throws Exception;
    ServicesResponse getAll() throws Exception;
}
