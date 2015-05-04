package com.shrisha.autoclient.service;

import com.shrisha.autoclient.dto.Trip;
import com.shrisha.autoclient.dto.TripsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sradhakrishna on 5/3/15.
 */
@Service
public class AutomaticServiceImpl implements AutomaticService {

    @Autowired
    private RestOperations restOperations;

    @Override
    public ResponseEntity<Trip[]>  getTrips() {
        return restOperations.getForEntity("https://api.automatic.com/v1/trips",Trip[].class);
    }
}
