
package com.deloitte.workersearch.api.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


public class RelatedPerson {

    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("relationship")
    private String relationship;
    @JsonProperty("email")
    private String email;
    @JsonProperty("nameData")
    private NameDataRelatedPerson nameData;
    @JsonProperty("address")
    private List<AddressRelatedPerson> address = null;
    @JsonProperty("phone")
    private List<PhoneRelatedPerson> phone = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("relationship")
    public String getRelationship() {
        return relationship;
    }

    @JsonProperty("relationship")
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("nameData")
    public NameDataRelatedPerson getNameData() {
        return nameData;
    }

    @JsonProperty("nameData")
    public void setNameData(NameDataRelatedPerson nameData) {
        this.nameData = nameData;
    }

    @JsonProperty("address")
    public List<AddressRelatedPerson> getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(List<AddressRelatedPerson> address) {
        this.address = address;
    }

    @JsonProperty("phone")
    public List<PhoneRelatedPerson> getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(List<PhoneRelatedPerson> phone) {
        this.phone = phone;
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
