package com.cliffordbechtel.spring6restmvc.services;

import com.cliffordbechtel.spring6restmvc.model.Beer;

import java.util.UUID;

public interface BeerService {

    Beer getBeerById(UUID id);
}
