
package com.shrisha.autoclient.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "uri",
    "id",
    "user",
    "vehicle",
    "start_location",
    "start_time",
    "start_time_zone",
    "end_location",
    "end_time",
    "end_time_zone",
    "path",
    "distance_m",
    "hard_accels",
    "hard_brakes",
    "duration_over_80_s",
    "duration_over_75_s",
    "duration_over_70_s",
    "fuel_cost_usd",
    "fuel_volume_gal",
    "average_mpg",
    "drive_events"
})
public class Trip {

    @JsonProperty("uri")
    private String uri;
    @JsonProperty("id")
    private String id;
    @JsonProperty("user")
    private User user;
    @JsonProperty("vehicle")
    private Vehicle vehicle;
    @JsonProperty("start_location")
    private StartLocation startLocation;
    @JsonProperty("start_time")
    private Integer startTime;
    @JsonProperty("start_time_zone")
    private String startTimeZone;
    @JsonProperty("end_location")
    private EndLocation endLocation;
    @JsonProperty("end_time")
    private Integer endTime;
    @JsonProperty("end_time_zone")
    private String endTimeZone;
    @JsonProperty("path")
    private String path;
    @JsonProperty("distance_m")
    private Double distanceM;
    @JsonProperty("hard_accels")
    private Integer hardAccels;
    @JsonProperty("hard_brakes")
    private Integer hardBrakes;
    @JsonProperty("duration_over_80_s")
    private Integer durationOver80S;
    @JsonProperty("duration_over_75_s")
    private Integer durationOver75S;
    @JsonProperty("duration_over_70_s")
    private Integer durationOver70S;
    @JsonProperty("fuel_cost_usd")
    private Double fuelCostUsd;
    @JsonProperty("fuel_volume_gal")
    private Double fuelVolumeGal;
    @JsonProperty("average_mpg")
    private Double averageMpg;
    @JsonProperty("drive_events")
    private List<DriveEvent> driveEvents = new ArrayList<DriveEvent>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The uri
     */
    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    /**
     * 
     * @param uri
     *     The uri
     */
    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The user
     */
    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * 
     * @return
     *     The vehicle
     */
    @JsonProperty("vehicle")
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * 
     * @param vehicle
     *     The vehicle
     */
    @JsonProperty("vehicle")
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * 
     * @return
     *     The startLocation
     */
    @JsonProperty("start_location")
    public StartLocation getStartLocation() {
        return startLocation;
    }

    /**
     * 
     * @param startLocation
     *     The start_location
     */
    @JsonProperty("start_location")
    public void setStartLocation(StartLocation startLocation) {
        this.startLocation = startLocation;
    }

    /**
     * 
     * @return
     *     The startTime
     */
    @JsonProperty("start_time")
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * 
     * @param startTime
     *     The start_time
     */
    @JsonProperty("start_time")
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * 
     * @return
     *     The startTimeZone
     */
    @JsonProperty("start_time_zone")
    public String getStartTimeZone() {
        return startTimeZone;
    }

    /**
     * 
     * @param startTimeZone
     *     The start_time_zone
     */
    @JsonProperty("start_time_zone")
    public void setStartTimeZone(String startTimeZone) {
        this.startTimeZone = startTimeZone;
    }

    /**
     * 
     * @return
     *     The endLocation
     */
    @JsonProperty("end_location")
    public EndLocation getEndLocation() {
        return endLocation;
    }

    /**
     * 
     * @param endLocation
     *     The end_location
     */
    @JsonProperty("end_location")
    public void setEndLocation(EndLocation endLocation) {
        this.endLocation = endLocation;
    }

    /**
     * 
     * @return
     *     The endTime
     */
    @JsonProperty("end_time")
    public Integer getEndTime() {
        return endTime;
    }

    /**
     * 
     * @param endTime
     *     The end_time
     */
    @JsonProperty("end_time")
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    /**
     * 
     * @return
     *     The endTimeZone
     */
    @JsonProperty("end_time_zone")
    public String getEndTimeZone() {
        return endTimeZone;
    }

    /**
     * 
     * @param endTimeZone
     *     The end_time_zone
     */
    @JsonProperty("end_time_zone")
    public void setEndTimeZone(String endTimeZone) {
        this.endTimeZone = endTimeZone;
    }

    /**
     * 
     * @return
     *     The path
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * 
     * @param path
     *     The path
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 
     * @return
     *     The distanceM
     */
    @JsonProperty("distance_m")
    public Double getDistanceM() {
        return distanceM;
    }

    /**
     * 
     * @param distanceM
     *     The distance_m
     */
    @JsonProperty("distance_m")
    public void setDistanceM(Double distanceM) {
        this.distanceM = distanceM;
    }

    /**
     * 
     * @return
     *     The hardAccels
     */
    @JsonProperty("hard_accels")
    public Integer getHardAccels() {
        return hardAccels;
    }

    /**
     * 
     * @param hardAccels
     *     The hard_accels
     */
    @JsonProperty("hard_accels")
    public void setHardAccels(Integer hardAccels) {
        this.hardAccels = hardAccels;
    }

    /**
     * 
     * @return
     *     The hardBrakes
     */
    @JsonProperty("hard_brakes")
    public Integer getHardBrakes() {
        return hardBrakes;
    }

    /**
     * 
     * @param hardBrakes
     *     The hard_brakes
     */
    @JsonProperty("hard_brakes")
    public void setHardBrakes(Integer hardBrakes) {
        this.hardBrakes = hardBrakes;
    }

    /**
     * 
     * @return
     *     The durationOver80S
     */
    @JsonProperty("duration_over_80_s")
    public Integer getDurationOver80S() {
        return durationOver80S;
    }

    /**
     * 
     * @param durationOver80S
     *     The duration_over_80_s
     */
    @JsonProperty("duration_over_80_s")
    public void setDurationOver80S(Integer durationOver80S) {
        this.durationOver80S = durationOver80S;
    }

    /**
     * 
     * @return
     *     The durationOver75S
     */
    @JsonProperty("duration_over_75_s")
    public Integer getDurationOver75S() {
        return durationOver75S;
    }

    /**
     * 
     * @param durationOver75S
     *     The duration_over_75_s
     */
    @JsonProperty("duration_over_75_s")
    public void setDurationOver75S(Integer durationOver75S) {
        this.durationOver75S = durationOver75S;
    }

    /**
     * 
     * @return
     *     The durationOver70S
     */
    @JsonProperty("duration_over_70_s")
    public Integer getDurationOver70S() {
        return durationOver70S;
    }

    /**
     * 
     * @param durationOver70S
     *     The duration_over_70_s
     */
    @JsonProperty("duration_over_70_s")
    public void setDurationOver70S(Integer durationOver70S) {
        this.durationOver70S = durationOver70S;
    }

    /**
     * 
     * @return
     *     The fuelCostUsd
     */
    @JsonProperty("fuel_cost_usd")
    public Double getFuelCostUsd() {
        return fuelCostUsd;
    }

    /**
     * 
     * @param fuelCostUsd
     *     The fuel_cost_usd
     */
    @JsonProperty("fuel_cost_usd")
    public void setFuelCostUsd(Double fuelCostUsd) {
        this.fuelCostUsd = fuelCostUsd;
    }

    /**
     * 
     * @return
     *     The fuelVolumeGal
     */
    @JsonProperty("fuel_volume_gal")
    public Double getFuelVolumeGal() {
        return fuelVolumeGal;
    }

    /**
     * 
     * @param fuelVolumeGal
     *     The fuel_volume_gal
     */
    @JsonProperty("fuel_volume_gal")
    public void setFuelVolumeGal(Double fuelVolumeGal) {
        this.fuelVolumeGal = fuelVolumeGal;
    }

    /**
     * 
     * @return
     *     The averageMpg
     */
    @JsonProperty("average_mpg")
    public Double getAverageMpg() {
        return averageMpg;
    }

    /**
     * 
     * @param averageMpg
     *     The average_mpg
     */
    @JsonProperty("average_mpg")
    public void setAverageMpg(Double averageMpg) {
        this.averageMpg = averageMpg;
    }

    /**
     * 
     * @return
     *     The driveEvents
     */
    @JsonProperty("drive_events")
    public List<DriveEvent> getDriveEvents() {
        return driveEvents;
    }

    /**
     * 
     * @param driveEvents
     *     The drive_events
     */
    @JsonProperty("drive_events")
    public void setDriveEvents(List<DriveEvent> driveEvents) {
        this.driveEvents = driveEvents;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(uri).append(id).append(user).append(vehicle).append(startLocation).append(startTime).append(startTimeZone).append(endLocation).append(endTime).append(endTimeZone).append(path).append(distanceM).append(hardAccels).append(hardBrakes).append(durationOver80S).append(durationOver75S).append(durationOver70S).append(fuelCostUsd).append(fuelVolumeGal).append(averageMpg).append(driveEvents).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Trip) == false) {
            return false;
        }
        Trip rhs = ((Trip) other);
        return new EqualsBuilder().append(uri, rhs.uri).append(id, rhs.id).append(user, rhs.user).append(vehicle, rhs.vehicle).append(startLocation, rhs.startLocation).append(startTime, rhs.startTime).append(startTimeZone, rhs.startTimeZone).append(endLocation, rhs.endLocation).append(endTime, rhs.endTime).append(endTimeZone, rhs.endTimeZone).append(path, rhs.path).append(distanceM, rhs.distanceM).append(hardAccels, rhs.hardAccels).append(hardBrakes, rhs.hardBrakes).append(durationOver80S, rhs.durationOver80S).append(durationOver75S, rhs.durationOver75S).append(durationOver70S, rhs.durationOver70S).append(fuelCostUsd, rhs.fuelCostUsd).append(fuelVolumeGal, rhs.fuelVolumeGal).append(averageMpg, rhs.averageMpg).append(driveEvents, rhs.driveEvents).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
