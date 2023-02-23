package com.cliffordbechtel.spring6restmvc.controllers;

import com.cliffordbechtel.spring6restmvc.services.BeerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;


}
