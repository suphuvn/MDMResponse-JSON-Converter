package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExEmploymentStatus{
    public String rowidObject;
    public String label;
    public String emplymntStsDesc;
    public String emplymntStsCd;
    @JsonProperty("ExEmplymntStsName") 
    public String exEmplymntStsName;
}