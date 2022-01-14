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
 * Information about a version such as VUSC or CodeInspect.
 */
@ApiModel(description = "Information about a version such as VUSC or CodeInspect.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-14T02:27:21.666995377Z[GMT]")
public class ProductVersion {
  public static final String SERIALIZED_NAME_BUILD_DATE = "buildDate";
  @SerializedName(SERIALIZED_NAME_BUILD_DATE)
  private String buildDate;

  public static final String SERIALIZED_NAME_VERSION_STRING = "versionString";
  @SerializedName(SERIALIZED_NAME_VERSION_STRING)
  private String versionString;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public ProductVersion() { 
  }

  public ProductVersion buildDate(String buildDate) {
    
    this.buildDate = buildDate;
    return this;
  }

   /**
   * The build date and time (German local time)
   * @return buildDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "28/07/2021 11:07", value = "The build date and time (German local time)")

  public String getBuildDate() {
    return buildDate;
  }


  public void setBuildDate(String buildDate) {
    this.buildDate = buildDate;
  }


  public ProductVersion versionString(String versionString) {
    
    this.versionString = versionString;
    return this;
  }

   /**
   * The version string
   * @return versionString
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1.9.1", required = true, value = "The version string")

  public String getVersionString() {
    return versionString;
  }


  public void setVersionString(String versionString) {
    this.versionString = versionString;
  }


  public ProductVersion name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The product namae
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "VUSC", required = true, value = "The product namae")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductVersion productVersion = (ProductVersion) o;
    return Objects.equals(this.buildDate, productVersion.buildDate) &&
        Objects.equals(this.versionString, productVersion.versionString) &&
        Objects.equals(this.name, productVersion.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildDate, versionString, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductVersion {\n");
    sb.append("    buildDate: ").append(toIndentedString(buildDate)).append("\n");
    sb.append("    versionString: ").append(toIndentedString(versionString)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
