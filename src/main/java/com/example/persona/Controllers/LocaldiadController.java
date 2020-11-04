package com.example.persona.Controllers;

import com.example.persona.Entities.Localidad;
import com.example.persona.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocaldiadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
}
