
package com.sample.rest.schema;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "empCode",
    "empName",
    "empContact",
    "designation",
    "empProjStartDate",
    "empProjEndDate",
    "empStatus"
})
@Generated("jsonschema2pojo")
public class EmployeeDetail {

    @JsonProperty("empCode")
    private String empCode;
    @JsonProperty("empName")
    private String empName;
    @JsonProperty("empContact")
    private String empContact;
    @JsonProperty("designation")
    private String designation;
    @JsonProperty("empProjStartDate")
    private String empProjStartDate;
    @JsonProperty("empProjEndDate")
    private String empProjEndDate;
    @JsonProperty("empStatus")
    private EmployeeDetail.EmpStatus empStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("empCode")
    public String getEmpCode() {
        return empCode;
    }

    @JsonProperty("empCode")
    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    @JsonProperty("empName")
    public String getEmpName() {
        return empName;
    }

    @JsonProperty("empName")
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @JsonProperty("empContact")
    public String getEmpContact() {
        return empContact;
    }

    @JsonProperty("empContact")
    public void setEmpContact(String empContact) {
        this.empContact = empContact;
    }

    @JsonProperty("designation")
    public String getDesignation() {
        return designation;
    }

    @JsonProperty("designation")
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @JsonProperty("empProjStartDate")
    public String getEmpProjStartDate() {
        return empProjStartDate;
    }

    @JsonProperty("empProjStartDate")
    public void setEmpProjStartDate(String empProjStartDate) {
        this.empProjStartDate = empProjStartDate;
    }

    @JsonProperty("empProjEndDate")
    public String getEmpProjEndDate() {
        return empProjEndDate;
    }

    @JsonProperty("empProjEndDate")
    public void setEmpProjEndDate(String empProjEndDate) {
        this.empProjEndDate = empProjEndDate;
    }

    @JsonProperty("empStatus")
    public EmployeeDetail.EmpStatus getEmpStatus() {
        return empStatus;
    }

    @JsonProperty("empStatus")
    public void setEmpStatus(EmployeeDetail.EmpStatus empStatus) {
        this.empStatus = empStatus;
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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("empCode");
        sb.append('=');
        sb.append(((this.empCode == null)?"<null>":this.empCode));
        sb.append(',');
        sb.append("empName");
        sb.append('=');
        sb.append(((this.empName == null)?"<null>":this.empName));
        sb.append(',');
        sb.append("empContact");
        sb.append('=');
        sb.append(((this.empContact == null)?"<null>":this.empContact));
        sb.append(',');
        sb.append("designation");
        sb.append('=');
        sb.append(((this.designation == null)?"<null>":this.designation));
        sb.append(',');
        sb.append("empProjStartDate");
        sb.append('=');
        sb.append(((this.empProjStartDate == null)?"<null>":this.empProjStartDate));
        sb.append(',');
        sb.append("empProjEndDate");
        sb.append('=');
        sb.append(((this.empProjEndDate == null)?"<null>":this.empProjEndDate));
        sb.append(',');
        sb.append("empStatus");
        sb.append('=');
        sb.append(((this.empStatus == null)?"<null>":this.empStatus));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.empCode == null)? 0 :this.empCode.hashCode()));
        result = ((result* 31)+((this.empStatus == null)? 0 :this.empStatus.hashCode()));
        result = ((result* 31)+((this.empName == null)? 0 :this.empName.hashCode()));
        result = ((result* 31)+((this.empContact == null)? 0 :this.empContact.hashCode()));
        result = ((result* 31)+((this.empProjEndDate == null)? 0 :this.empProjEndDate.hashCode()));
        result = ((result* 31)+((this.empProjStartDate == null)? 0 :this.empProjStartDate.hashCode()));
        result = ((result* 31)+((this.designation == null)? 0 :this.designation.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeDetail) == false) {
            return false;
        }
        EmployeeDetail rhs = ((EmployeeDetail) other);
        return (((((((((this.empCode == rhs.empCode)||((this.empCode!= null)&&this.empCode.equals(rhs.empCode)))&&((this.empStatus == rhs.empStatus)||((this.empStatus!= null)&&this.empStatus.equals(rhs.empStatus))))&&((this.empName == rhs.empName)||((this.empName!= null)&&this.empName.equals(rhs.empName))))&&((this.empContact == rhs.empContact)||((this.empContact!= null)&&this.empContact.equals(rhs.empContact))))&&((this.empProjEndDate == rhs.empProjEndDate)||((this.empProjEndDate!= null)&&this.empProjEndDate.equals(rhs.empProjEndDate))))&&((this.empProjStartDate == rhs.empProjStartDate)||((this.empProjStartDate!= null)&&this.empProjStartDate.equals(rhs.empProjStartDate))))&&((this.designation == rhs.designation)||((this.designation!= null)&&this.designation.equals(rhs.designation))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    @Generated("jsonschema2pojo")
    public enum EmpStatus {

        ACTIVE("ACTIVE"),
        INACTIVE("INACTIVE");
        private final String value;
        private final static Map<String, EmployeeDetail.EmpStatus> CONSTANTS = new HashMap<String, EmployeeDetail.EmpStatus>();

        static {
            for (EmployeeDetail.EmpStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        EmpStatus(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static EmployeeDetail.EmpStatus fromValue(String value) {
            EmployeeDetail.EmpStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
