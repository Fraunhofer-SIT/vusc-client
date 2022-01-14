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
import java.util.ArrayList;
import java.util.List;

/**
 * Contains information about self registration
 */
@ApiModel(description = "Contains information about self registration")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-14T02:27:21.666995377Z[GMT]")
public class SelfRegistrationInformation {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_ALLOWED_MAIL_SUFFIXES = "allowedMailSuffixes";
  @SerializedName(SERIALIZED_NAME_ALLOWED_MAIL_SUFFIXES)
  private List<String> allowedMailSuffixes = null;

  public static final String SERIALIZED_NAME_ALL_ALLOWED = "allAllowed";
  @SerializedName(SERIALIZED_NAME_ALL_ALLOWED)
  private Boolean allAllowed;

  public SelfRegistrationInformation() { 
  }

  public SelfRegistrationInformation enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether self-registration is enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether self-registration is enabled")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public SelfRegistrationInformation allowedMailSuffixes(List<String> allowedMailSuffixes) {
    
    this.allowedMailSuffixes = allowedMailSuffixes;
    return this;
  }

  public SelfRegistrationInformation addAllowedMailSuffixesItem(String allowedMailSuffixesItem) {
    if (this.allowedMailSuffixes == null) {
      this.allowedMailSuffixes = new ArrayList<String>();
    }
    this.allowedMailSuffixes.add(allowedMailSuffixesItem);
    return this;
  }

   /**
   * The allowed mail suffixes
   * @return allowedMailSuffixes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The allowed mail suffixes")

  public List<String> getAllowedMailSuffixes() {
    return allowedMailSuffixes;
  }


  public void setAllowedMailSuffixes(List<String> allowedMailSuffixes) {
    this.allowedMailSuffixes = allowedMailSuffixes;
  }


  public SelfRegistrationInformation allAllowed(Boolean allAllowed) {
    
    this.allAllowed = allAllowed;
    return this;
  }

   /**
   * Whether all email addresses are allowed
   * @return allAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether all email addresses are allowed")

  public Boolean getAllAllowed() {
    return allAllowed;
  }


  public void setAllAllowed(Boolean allAllowed) {
    this.allAllowed = allAllowed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelfRegistrationInformation selfRegistrationInformation = (SelfRegistrationInformation) o;
    return Objects.equals(this.enabled, selfRegistrationInformation.enabled) &&
        Objects.equals(this.allowedMailSuffixes, selfRegistrationInformation.allowedMailSuffixes) &&
        Objects.equals(this.allAllowed, selfRegistrationInformation.allAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, allowedMailSuffixes, allAllowed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfRegistrationInformation {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    allowedMailSuffixes: ").append(toIndentedString(allowedMailSuffixes)).append("\n");
    sb.append("    allAllowed: ").append(toIndentedString(allAllowed)).append("\n");
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
