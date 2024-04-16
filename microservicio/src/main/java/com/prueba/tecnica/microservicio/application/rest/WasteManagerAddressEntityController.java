package com.prueba.tecnica.microservicio.application.rest;

import com.prueba.tecnica.microservicio.domain.service.IWasteManagerAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class WasteManagerAddressEntityController {
    @Autowired
    IWasteManagerAddressService addressService;
}
