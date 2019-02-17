package com.rent.rank.controller;

import com.rent.rank.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BuildingController {

    @Autowired
    private BuildingService buildingService;
}
