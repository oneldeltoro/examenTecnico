package com.prueba.tecnica.microservicio.infrastructure.service;

import com.prueba.tecnica.microservicio.application.request.WasteManagerAddressEntityDto;
import com.prueba.tecnica.microservicio.application.response.ServicesResponse;
import com.prueba.tecnica.microservicio.domain.service.IWasteManagerAddressService;
import com.prueba.tecnica.microservicio.infrastructure.repository.IWasteManagerAddressEntityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

@Service
@Slf4j
public class WasteManagerAddressServiceImpl implements IWasteManagerAddressService {
    @Autowired
    IWasteManagerAddressEntityRepository repository;
    @Override
    public ServicesResponse create(WasteManagerAddressEntityDto wasteManagerDto, BindingResult bindingResult) throws Exception {
        return null;
    }

    @Override
    public ServicesResponse update(WasteManagerAddressEntityDto dto, BindingResult bindingResult) throws Exception {
        return null;
    }

    @Override
    public ServicesResponse findById(long wasteManagerAddressId) throws Exception {
        return null;
    }

    @Override
    public void deleteById(long wasteManagerAddressId) throws Exception {

    }

    @Override
    public ServicesResponse getAll() throws Exception {
        return null;
    }
}
