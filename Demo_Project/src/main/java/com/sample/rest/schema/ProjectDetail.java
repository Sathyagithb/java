
package com.sample.rest.schema;

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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "projectCode",
    "projectName",
    "projectDesc",
    "startDate",
    "endDate",
    "deptCode",
    "deptName",
    "employeeDetails"
})
@Generated("jsonschema2pojo")
public class ProjectDetail {

    @JsonProperty("projectCode")
    private String projectCode;
    @JsonProperty("projectName")
    private String projectName;
    @JsonProperty("projectDesc")
    private String projectDesc;
    @JsonProperty("startDate")
    private String startDate;
    @JsonProperty("endDate")
    private String endDate;
    @JsonProperty("deptCode")
    private String deptCode;
    @JsonProperty("deptName")
    private String deptName;
    @JsonProperty("employeeDetails")
    private List<EmployeeDetail> employeeDetails = new ArrayList<EmployeeDetail>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("projectCode")
    public String getProjectCode() {
        return projectCode;
    }

    @JsonProperty("projectCode")
    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    @JsonProperty("projectName")
    public String getProjectName() {
        return projectName;
    }

    @JsonProperty("projectName")
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @JsonProperty("projectDesc")
    public String getProjectDesc() {
        return projectDesc;
    }

    @JsonProperty("projectDesc")
    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
    }

    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("endDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    @JsonProperty("deptName")
    public String getDeptName() {
        return deptName;
    }

    @JsonProperty("deptName")
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @JsonProperty("employeeDetails")
    public List<EmployeeDetail> getEmployeeDetails() {
        return employeeDetails;
    }

    @JsonProperty("employeeDetails")
    public void setEmployeeDetails(List<EmployeeDetail> employeeDetails) {
        this.employeeDetails = employeeDetails;
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
        sb.append(ProjectDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("projectCode");
        sb.append('=');
        sb.append(((this.projectCode == null)?"<null>":this.projectCode));
        sb.append(',');
        sb.append("projectName");
        sb.append('=');
        sb.append(((this.projectName == null)?"<null>":this.projectName));
        sb.append(',');
        sb.append("projectDesc");
        sb.append('=');
        sb.append(((this.projectDesc == null)?"<null>":this.projectDesc));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("deptName");
        sb.append('=');
        sb.append(((this.deptName == null)?"<null>":this.deptName));
        sb.append(',');
        sb.append("employeeDetails");
        sb.append('=');
        sb.append(((this.employeeDetails == null)?"<null>":this.employeeDetails));
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
        result = ((result* 31)+((this.deptName == null)? 0 :this.deptName.hashCode()));
        result = ((result* 31)+((this.projectCode == null)? 0 :this.projectCode.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.employeeDetails == null)? 0 :this.employeeDetails.hashCode()));
        result = ((result* 31)+((this.projectDesc == null)? 0 :this.projectDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.projectName == null)? 0 :this.projectName.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectDetail) == false) {
            return false;
        }
        ProjectDetail rhs = ((ProjectDetail) other);
        return ((((((((((this.deptName == rhs.deptName)||((this.deptName!= null)&&this.deptName.equals(rhs.deptName)))&&((this.projectCode == rhs.projectCode)||((this.projectCode!= null)&&this.projectCode.equals(rhs.projectCode))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.employeeDetails == rhs.employeeDetails)||((this.employeeDetails!= null)&&this.employeeDetails.equals(rhs.employeeDetails))))&&((this.projectDesc == rhs.projectDesc)||((this.projectDesc!= null)&&this.projectDesc.equals(rhs.projectDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.projectName == rhs.projectName)||((this.projectName!= null)&&this.projectName.equals(rhs.projectName))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))));
    }

}
