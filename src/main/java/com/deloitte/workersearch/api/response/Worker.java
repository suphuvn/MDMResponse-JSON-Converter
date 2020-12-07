
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

public class Worker {

    @JsonProperty("employee")
    private Employee employee;
    @JsonProperty("nameData")
    private List<NameData> nameData;
    @JsonProperty("address")
    private List<Address> address = null;
    @JsonProperty("phone")
    private List<Phone> phone = null;
    @JsonProperty("email")
    private List<Email> email = null;
    @JsonProperty("position")
    private List<Position> position;
    @JsonProperty("supervisor")
    private List<Supervisor> supervisor;
    @JsonProperty("compensation")
    private Compensation compensation;
    @JsonProperty("transaction")
    private List<Transaction> transaction = null;
    @JsonProperty("relatedPerson")
    private List<RelatedPerson> relatedPerson;
    @JsonProperty("location")
    private List<Location> location;
    @JsonProperty("job")
    private List<Job> job;
    @JsonProperty("organization")
    private List<Organization> organization;
    @JsonProperty("learning")
    private Learning learning;
    @JsonProperty("contractor")
    private Contractor contractor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("employee")
    public Employee getEmployee() {
        return employee;
    }

    @JsonProperty("employee")
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	public List<NameData> getNameData() {
		return nameData;
	}

	public void setNameData(List<NameData> nameData) {
		this.nameData = nameData;
	}

	public List<Phone> getPhone() {
		return phone;
	}

	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}

	public List<Email> getEmail() {
		return email;
	}

	public void setEmail(List<Email> email) {
		this.email = email;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<Position> getPosition() {
		return position;
	}

	public void setPosition(List<Position> position) {
		this.position = position;
	}

	public List<Supervisor> getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(List<Supervisor> supervisor) {
		this.supervisor = supervisor;
	}

	public Compensation getCompensation() {
		return compensation;
	}

	public void setCompensation(Compensation compensation) {
		this.compensation = compensation;
	}

	public List<Transaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}

	public List<RelatedPerson> getRelatedPerson() {
		return relatedPerson;
	}

	public void setRelatedPerson(List<RelatedPerson> relatedPerson) {
		this.relatedPerson = relatedPerson;
	}

	public List<Location> getLocation() {
		return location;
	}

	public void setLocation(List<Location> location) {
		this.location = location;
	}

	public List<Job> getJob() {
		return job;
	}

	public void setJob(List<Job> job) {
		this.job = job;
	}

	public List<Organization> getOrganization() {
		return organization;
	}

	public void setOrganization(List<Organization> organization) {
		this.organization = organization;
	}

	public Learning getLearning() {
		return learning;
	}

	public void setLearning(Learning learning) {
		this.learning = learning;
	}

	public Contractor getContractor() {
		return contractor;
	}

	public void setContractor(Contractor contractor) {
		this.contractor = contractor;
	}

	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

    
}
