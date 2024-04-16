package com.prueba.tecnica.microservicio.application.rest;

import com.prueba.tecnica.microservicio.application.request.WasteManagerEntityDto;
import com.prueba.tecnica.microservicio.application.response.ServicesResponse;
import com.prueba.tecnica.microservicio.domain.service.IWasteManagerService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/entity")
@Slf4j

public class WasteManagerEntityController {
    @Autowired
    IWasteManagerService managerService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    //@ApiOperation(value = "Obtener listado de Entidads", notes = "Retorna una lista de Entidads")
    public ResponseEntity<ServicesResponse> getAllEntidades() {
        log.debug("invocando servicio para obtener listado de Entidades");
        ServicesResponse resultado = managerService.getAll();
        return new ResponseEntity(resultado, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    // @ApiOperation(value = "Obtener Entidad", notes = "Retorna una Entidad por Id")
    public ResponseEntity<ServicesResponse> getEntidad(
            @PathVariable(name = "id") Long identificador) {
        log.debug("invocando servicio para obtener una Entidad");
        ServicesResponse findResponse = managerService.findById(identificador);
        return new ResponseEntity(findResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    // @ApiOperation(value = "Guardar Entidad", notes = "Almacena una Entidad")
    public ResponseEntity<ServicesResponse> postEntidad(@RequestBody @Valid WasteManagerEntityDto dto, BindingResult bindingResult) {
        log.debug("invocando servicio para almacenar Entidad");
        ServicesResponse stored = managerService.create(dto, bindingResult);
        return new ResponseEntity(stored, HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
//    @ApiOperation(value = "Modificar Entidad", notes = "Almacena una Entidad modificada")
    public ResponseEntity<ServicesResponse> putEntidad( @RequestBody @Valid WasteManagerEntityDto dto, BindingResult bindingResult) {
        log.debug("invocando servicio para modificar una Entidad");
        ServicesResponse update = managerService.update(dto, bindingResult);
        return new ResponseEntity(update, HttpStatus.OK);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    // @ApiOperation(value = "Elimina una Entidad", notes = "Elimina una Entidad por Id")
    public ResponseEntity deleteEntidad(
            @PathVariable(name = "id") Long identificador) {
        log.debug("invocando servicio para eliminar una Entidad");
        ServicesResponse delete = managerService.deleteById(identificador);
        return new ResponseEntity(delete, HttpStatus.OK);
    }

}
