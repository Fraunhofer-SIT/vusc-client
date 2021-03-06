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
import de.fraunhofer.sit.sse.vusc.javaclient.models.IPAPermissionAllOf;
import de.fraunhofer.sit.sse.vusc.javaclient.models.Permission;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A single permission used in a IPA file
 */
@ApiModel(description = "A single permission used in a IPA file")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-14T02:27:21.666995377Z[GMT]")
public class IPAPermission {
  public static final String SERIALIZED_NAME_PERMISSION = "permission";
  @SerializedName(SERIALIZED_NAME_PERMISSION)
  private String permission;

  public static final String SERIALIZED_NAME_USAGE_DESCRIPTION = "usageDescription";
  @SerializedName(SERIALIZED_NAME_USAGE_DESCRIPTION)
  private String usageDescription;

  public IPAPermission() { 
  }

  public IPAPermission permission(String permission) {
    
    this.permission = permission;
    return this;
  }

   /**
   * The name of the permission.
   * @return permission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the permission.")

  public String getPermission() {
    return permission;
  }


  public void setPermission(String permission) {
    this.permission = permission;
  }


  public IPAPermission usageDescription(String usageDescription) {
    
    this.usageDescription = usageDescription;
    return this;
  }

   /**
   * A human readable justification of the requested permission.
   * @return usageDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The camera is used to capture a profile picture.", value = "A human readable justification of the requested permission.")

  public String getUsageDescription() {
    return usageDescription;
  }


  public void setUsageDescription(String usageDescription) {
    this.usageDescription = usageDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPAPermission ipAPermission = (IPAPermission) o;
    return Objects.equals(this.permission, ipAPermission.permission) &&
        Objects.equals(this.usageDescription, ipAPermission.usageDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission, usageDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAPermission {\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    usageDescription: ").append(toIndentedString(usageDescription)).append("\n");
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

