
package com.shrisha.autoclient.dto;

import java.util.HashMap;
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
    "type",
    "start_distance_m",
    "end_distance_m",
    "start_time",
    "end_time",
    "velocity_mph",
    "lat",
    "lon",
    "ts",
    "g"
})
public class DriveEvent {

    @JsonProperty("type")
    private String type;
    @JsonProperty("start_distance_m")
    private Double startDistanceM;
    @JsonProperty("end_distance_m")
    private Double endDistanceM;
    @JsonProperty("start_time")
    private Long startTime;
    @JsonProperty("end_time")
    private Long endTime;
    @JsonProperty("velocity_mph")
    private Integer velocityMph;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("lon")
    private Double lon;
    @JsonProperty("ts")
    private Long ts;
    @JsonProperty("g")
    private Double g;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The startDistanceM
     */
    @JsonProperty("start_distance_m")
    public Double getStartDistanceM() {
        return startDistanceM;
    }

    /**
     * 
     * @param startDistanceM
     *     The start_distance_m
     */
    @JsonProperty("start_distance_m")
    public void setStartDistanceM(Double startDistanceM) {
        this.startDistanceM = startDistanceM;
    }

    /**
     * 
     * @return
     *     The endDistanceM
     */
    @JsonProperty("end_distance_m")
    public Double getEndDistanceM() {
        return endDistanceM;
    }

    /**
     * 
     * @param endDistanceM
     *     The end_distance_m
     */
    @JsonProperty("end_distance_m")
    public void setEndDistanceM(Double endDistanceM) {
        this.endDistanceM = endDistanceM;
    }

    /**
     * 
     * @return
     *     The startTime
     */
    @JsonProperty("start_time")
    public Long getStartTime() {
        return startTime;
    }

    /**
     * 
     * @param startTime
     *     The start_time
     */
    @JsonProperty("start_time")
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * 
     * @return
     *     The endTime
     */
    @JsonProperty("end_time")
    public Long getEndTime() {
        return endTime;
    }

    /**
     * 
     * @param endTime
     *     The end_time
     */
    @JsonProperty("end_time")
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * 
     * @return
     *     The velocityMph
     */
    @JsonProperty("velocity_mph")
    public Integer getVelocityMph() {
        return velocityMph;
    }

    /**
     * 
     * @param velocityMph
     *     The velocity_mph
     */
    @JsonProperty("velocity_mph")
    public void setVelocityMph(Integer velocityMph) {
        this.velocityMph = velocityMph;
    }

    /**
     * 
     * @return
     *     The lat
     */
    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * 
     * @return
     *     The lon
     */
    @JsonProperty("lon")
    public Double getLon() {
        return lon;
    }

    /**
     * 
     * @param lon
     *     The lon
     */
    @JsonProperty("lon")
    public void setLon(Double lon) {
        this.lon = lon;
    }

    /**
     * 
     * @return
     *     The ts
     */
    @JsonProperty("ts")
    public Long getTs() {
        return ts;
    }

    /**
     * 
     * @param ts
     *     The ts
     */
    @JsonProperty("ts")
    public void setTs(Long ts) {
        this.ts = ts;
    }

    /**
     * 
     * @return
     *     The g
     */
    @JsonProperty("g")
    public Double getG() {
        return g;
    }

    /**
     * 
     * @param g
     *     The g
     */
    @JsonProperty("g")
    public void setG(Double g) {
        this.g = g;
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
        return new HashCodeBuilder().append(type).append(startDistanceM).append(endDistanceM).append(startTime).append(endTime).append(velocityMph).append(lat).append(lon).append(ts).append(g).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DriveEvent) == false) {
            return false;
        }
        DriveEvent rhs = ((DriveEvent) other);
        return new EqualsBuilder().append(type, rhs.type).append(startDistanceM, rhs.startDistanceM).append(endDistanceM, rhs.endDistanceM).append(startTime, rhs.startTime).append(endTime, rhs.endTime).append(velocityMph, rhs.velocityMph).append(lat, rhs.lat).append(lon, rhs.lon).append(ts, rhs.ts).append(g, rhs.g).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
