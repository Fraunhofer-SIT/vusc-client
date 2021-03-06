/*
 * Public API
 * Assessment API
 *
 * The version of the OpenAPI document: 0.1
 * Contact: helpdesk@codeinspect.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.fraunhofer.sit.sse.vusc.javaclient.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.fraunhofer.sit.sse.vusc.javaclient.models.Communication;
import de.fraunhofer.sit.sse.vusc.javaclient.models.InformationFinding;
import de.fraunhofer.sit.sse.vusc.javaclient.models.ResidualData;
import de.fraunhofer.sit.sse.vusc.javaclient.models.UsedLibrary;
import de.fraunhofer.sit.sse.vusc.javaclient.models.VulnerabilityFinding;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A collection of found vulnerabilities and communications for a job
 */
@ApiModel(description = "A collection of found vulnerabilities and communications for a job")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-14T02:27:21.666995377Z[GMT]")
public class JobResults {
  public static final String SERIALIZED_NAME_VULNERABILITY_FINDINGS = "vulnerabilityFindings";
  @SerializedName(SERIALIZED_NAME_VULNERABILITY_FINDINGS)
  private List<VulnerabilityFinding> vulnerabilityFindings = null;

  public static final String SERIALIZED_NAME_INFORMATION_FINDINGS = "informationFindings";
  @SerializedName(SERIALIZED_NAME_INFORMATION_FINDINGS)
  private List<InformationFinding> informationFindings = null;

  public static final String SERIALIZED_NAME_COMMUNICATIONS = "communications";
  @SerializedName(SERIALIZED_NAME_COMMUNICATIONS)
  private List<Communication> communications = null;

  public static final String SERIALIZED_NAME_RESIDUAL_DATA = "residualData";
  @SerializedName(SERIALIZED_NAME_RESIDUAL_DATA)
  private List<ResidualData> residualData = null;

  public static final String SERIALIZED_NAME_USED_LIBRARIES = "usedLibraries";
  @SerializedName(SERIALIZED_NAME_USED_LIBRARIES)
  private List<UsedLibrary> usedLibraries = null;

  public JobResults() { 
  }

  public JobResults vulnerabilityFindings(List<VulnerabilityFinding> vulnerabilityFindings) {
    
    this.vulnerabilityFindings = vulnerabilityFindings;
    return this;
  }

  public JobResults addVulnerabilityFindingsItem(VulnerabilityFinding vulnerabilityFindingsItem) {
    if (this.vulnerabilityFindings == null) {
      this.vulnerabilityFindings = new ArrayList<VulnerabilityFinding>();
    }
    this.vulnerabilityFindings.add(vulnerabilityFindingsItem);
    return this;
  }

   /**
   * A list of all found vulnerabilities
   * @return vulnerabilityFindings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of all found vulnerabilities")

  public List<VulnerabilityFinding> getVulnerabilityFindings() {
    return vulnerabilityFindings;
  }


  public void setVulnerabilityFindings(List<VulnerabilityFinding> vulnerabilityFindings) {
    this.vulnerabilityFindings = vulnerabilityFindings;
  }


  public JobResults informationFindings(List<InformationFinding> informationFindings) {
    
    this.informationFindings = informationFindings;
    return this;
  }

  public JobResults addInformationFindingsItem(InformationFinding informationFindingsItem) {
    if (this.informationFindings == null) {
      this.informationFindings = new ArrayList<InformationFinding>();
    }
    this.informationFindings.add(informationFindingsItem);
    return this;
  }

   /**
   * A list of additional information
   * @return informationFindings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of additional information")

  public List<InformationFinding> getInformationFindings() {
    return informationFindings;
  }


  public void setInformationFindings(List<InformationFinding> informationFindings) {
    this.informationFindings = informationFindings;
  }


  public JobResults communications(List<Communication> communications) {
    
    this.communications = communications;
    return this;
  }

  public JobResults addCommunicationsItem(Communication communicationsItem) {
    if (this.communications == null) {
      this.communications = new ArrayList<Communication>();
    }
    this.communications.add(communicationsItem);
    return this;
  }

   /**
   * A list of all found communications
   * @return communications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of all found communications")

  public List<Communication> getCommunications() {
    return communications;
  }


  public void setCommunications(List<Communication> communications) {
    this.communications = communications;
  }


  public JobResults residualData(List<ResidualData> residualData) {
    
    this.residualData = residualData;
    return this;
  }

  public JobResults addResidualDataItem(ResidualData residualDataItem) {
    if (this.residualData == null) {
      this.residualData = new ArrayList<ResidualData>();
    }
    this.residualData.add(residualDataItem);
    return this;
  }

   /**
   * A list of discovered data such as paths, user names or phone numbers
   * @return residualData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of discovered data such as paths, user names or phone numbers")

  public List<ResidualData> getResidualData() {
    return residualData;
  }


  public void setResidualData(List<ResidualData> residualData) {
    this.residualData = residualData;
  }


  public JobResults usedLibraries(List<UsedLibrary> usedLibraries) {
    
    this.usedLibraries = usedLibraries;
    return this;
  }

  public JobResults addUsedLibrariesItem(UsedLibrary usedLibrariesItem) {
    if (this.usedLibraries == null) {
      this.usedLibraries = new ArrayList<UsedLibrary>();
    }
    this.usedLibraries.add(usedLibrariesItem);
    return this;
  }

   /**
   * A list of discovered libraries
   * @return usedLibraries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of discovered libraries")

  public List<UsedLibrary> getUsedLibraries() {
    return usedLibraries;
  }


  public void setUsedLibraries(List<UsedLibrary> usedLibraries) {
    this.usedLibraries = usedLibraries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobResults jobResults = (JobResults) o;
    return Objects.equals(this.vulnerabilityFindings, jobResults.vulnerabilityFindings) &&
        Objects.equals(this.informationFindings, jobResults.informationFindings) &&
        Objects.equals(this.communications, jobResults.communications) &&
        Objects.equals(this.residualData, jobResults.residualData) &&
        Objects.equals(this.usedLibraries, jobResults.usedLibraries);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(vulnerabilityFindings, informationFindings, communications, residualData, usedLibraries);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobResults {\n");
    sb.append("    vulnerabilityFindings: ").append(toIndentedString(vulnerabilityFindings)).append("\n");
    sb.append("    informationFindings: ").append(toIndentedString(informationFindings)).append("\n");
    sb.append("    communications: ").append(toIndentedString(communications)).append("\n");
    sb.append("    residualData: ").append(toIndentedString(residualData)).append("\n");
    sb.append("    usedLibraries: ").append(toIndentedString(usedLibraries)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

