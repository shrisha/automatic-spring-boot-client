package com.shrisha.autoclient.web;

/**
 * Created by sradhakrishna on 5/2/15.
 */


import com.shrisha.autoclient.dto.Trip;
import com.shrisha.autoclient.dto.TripsResponse;
import com.shrisha.autoclient.service.AutomaticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private AutomaticService automaticService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        return trips(model);
    }

    @RequestMapping(value = "/automatic/trips", method = RequestMethod.GET)
    public String trips(Model model) {
        ResponseEntity<Trip[]> tripsResponse = automaticService.getTrips();
        if(tripsResponse.getStatusCode()== HttpStatus.OK){
            model.addAttribute("trips",tripsResponse.getBody());
        }
        return "trips";
    }

    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String tripsCallbackFromAutomatic(Model model) {
        return trips(model);
    }



}