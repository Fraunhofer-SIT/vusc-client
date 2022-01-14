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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Statistical aggregated information about findings
 */
@ApiModel(description = "Statistical aggregated information about findings")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-14T02:27:21.666995377Z[GMT]")
public class FindingStatistics {
  public static final String SERIALIZED_NAME_LOW = "low";
  @SerializedName(SERIALIZED_NAME_LOW)
  private Integer low;

  public static final String SERIALIZED_NAME_MEDIUM = "medium";
  @SerializedName(SERIALIZED_NAME_MEDIUM)
  private Integer medium;

  public static final String SERIALIZED_NAME_HIGH = "high";
  @SerializedName(SERIALIZED_NAME_HIGH)
  private Integer high;

  public FindingStatistics() { 
  }

  public FindingStatistics low(Integer low) {
    
    this.low = low;
    return this;
  }

   /**
   * The number of findings with low impact rating
   * @return low
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "The number of findings with low impact rating")

  public Integer getLow() {
    return low;
  }


  public void setLow(Integer low) {
    this.low = low;
  }


  public FindingStatistics medium(Integer medium) {
    
    this.medium = medium;
    return this;
  }

   /**
   * The number of findings with medium impact rating
   * @return medium
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "The number of findings with medium impact rating")

  public Integer getMedium() {
    return medium;
  }


  public void setMedium(Integer medium) {
    this.medium = medium;
  }


  public FindingStatistics high(Integer high) {
    
    this.high = high;
    return this;
  }

   /**
   * The number of findings with high impact rating
   * @return high
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "The number of findings with high impact rating")

  public Integer getHigh() {
    return high;
  }


  public void setHigh(Integer high) {
    this.high = high;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindingStatistics findingStatistics = (FindingStatistics) o;
    return Objects.equals(this.low, findingStatistics.low) &&
        Objects.equals(this.medium, findingStatistics.medium) &&
        Objects.equals(this.high, findingStatistics.high);
  }

  @Override
  public int hashCode() {
    return Objects.hash(low, medium, high);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindingStatistics {\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
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
