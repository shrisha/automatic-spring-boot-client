package com.shrisha.autoclient.dto;

import java.util.List;

/**
 * Created by sradhakrishna on 5/3/15.
 */
public class TripsResponse {

    private List<Trip> trips;

    public List<Trip> getTrips() {
        return trips;
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }
}
