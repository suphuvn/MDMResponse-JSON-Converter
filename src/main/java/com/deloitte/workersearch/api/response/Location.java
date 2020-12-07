
package com.deloitte.workersearch.api.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class Location {

    @JsonProperty("locationId")
    private String locationId;
    @JsonProperty("locationName")
    private String locationName;
    @JsonProperty("usage")
    private String usage;
    @JsonProperty("type")
    private String type;
    @JsonProperty("isPrimaryAddress")
    private Boolean isPrimaryAddress;
    @JsonProperty("timezoneName")
    private String timezoneName;
    @JsonProperty("addressLine1")
    private String addressLine1;
    @JsonProperty("countryName")
    private String countryName;
    @JsonProperty("countrySubdivisionCode")
    private String countrySubdivisionCode;
    @JsonProperty("countrySubdivisionName")
    private String countrySubdivisionName;
    @JsonProperty("city")
    private String city;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("roomNumber")
    private String roomNumber;
    @JsonProperty("floorNumber")
    private String floorNumber;
    @JsonProperty("buildingId")
    private Integer buildingId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	@JsonProperty("locationName")
    public String getLocationName() {
        return locationName;
    }

    @JsonProperty("locationName")
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    @JsonProperty("usage")
    public String getUsage() {
        return usage;
    }

    @JsonProperty("usage")
    public void setUsage(String usage) {
        this.usage = usage;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("isPrimaryAddress")
    public Boolean getIsPrimaryAddress() {
        return isPrimaryAddress;
    }

    @JsonProperty("isPrimaryAddress")
    public void setIsPrimaryAddress(Boolean isPrimaryAddress) {
        this.isPrimaryAddress = isPrimaryAddress;
    }

    @JsonProperty("timezoneName")
    public String getTimezoneName() {
        return timezoneName;
    }

    @JsonProperty("timezoneName")
    public void setTimezoneName(String timezoneName) {
        this.timezoneName = timezoneName;
    }

    @JsonProperty("addressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }

    @JsonProperty("addressLine1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @JsonProperty("countryName")
    public String getCountryName() {
        return countryName;
    }

    @JsonProperty("countryName")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @JsonProperty("countrySubdivisionCode")
    public String getCountrySubdivisionCode() {
        return countrySubdivisionCode;
    }

    @JsonProperty("countrySubdivisionCode")
    public void setCountrySubdivisionCode(String countrySubdivisionCode) {
        this.countrySubdivisionCode = countrySubdivisionCode;
    }

    @JsonProperty("countrySubdivisionName")
    public String getCountrySubdivisionName() {
        return countrySubdivisionName;
    }

    @JsonProperty("countrySubdivisionName")
    public void setCountrySubdivisionName(String countrySubdivisionName) {
        this.countrySubdivisionName = countrySubdivisionName;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(String floorNumber) {
		this.floorNumber = floorNumber;
	}

	public Integer getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(Integer buildingId) {
		this.buildingId = buildingId;
	}

	@JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
