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
 * Information about a supported platform
 */
@ApiModel(description = "Information about a supported platform")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-14T02:27:21.666995377Z[GMT]")
public class Platform {
  public static final String SERIALIZED_NAME_HUMAN_READABLE_NAME = "humanReadableName";
  @SerializedName(SERIALIZED_NAME_HUMAN_READABLE_NAME)
  private String humanReadableName;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public Platform() { 
  }

  public Platform humanReadableName(String humanReadableName) {
    
    this.humanReadableName = humanReadableName;
    return this;
  }

   /**
   * The human readable name
   * @return humanReadableName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Android Application", required = true, value = "The human readable name")

  public String getHumanReadableName() {
    return humanReadableName;
  }


  public void setHumanReadableName(String humanReadableName) {
    this.humanReadableName = humanReadableName;
  }


  public Platform id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The machine readable id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ANDROID_APP_APK", required = true, value = "The machine readable id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Platform platform = (Platform) o;
    return Objects.equals(this.humanReadableName, platform.humanReadableName) &&
        Objects.equals(this.id, platform.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(humanReadableName, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Platform {\n");
    sb.append("    humanReadableName: ").append(toIndentedString(humanReadableName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

