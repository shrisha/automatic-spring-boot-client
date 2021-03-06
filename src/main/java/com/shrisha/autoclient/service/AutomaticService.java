package com.shrisha.autoclient.service;

import com.shrisha.autoclient.dto.Trip;
import com.shrisha.autoclient.dto.TripsResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Created by sradhakrishna on 5/3/15.
 */
public interface AutomaticService {

    ResponseEntity<Trip[]>  getTrips();
}
