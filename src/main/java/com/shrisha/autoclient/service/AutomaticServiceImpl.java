package com.shrisha.autoclient.service;

import com.shrisha.autoclient.dto.Trip;
import com.shrisha.autoclient.dto.TripsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by sradhakrishna on 5/3/15.
 */
@Service
public class AutomaticServiceImpl implements AutomaticService {

    @Autowired
    private RestOperations restOperations;

    @Override
    public TripsResponse getTrips() {
        TripsResponse tripsResponse = restOperations.getForObject("https://api.automatic.com/v1/trips",TripsResponse.class);
        return tripsResponse;
    }
}
