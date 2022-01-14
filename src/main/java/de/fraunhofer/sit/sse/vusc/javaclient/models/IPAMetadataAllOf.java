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
import de.fraunhofer.sit.sse.vusc.javaclient.models.IPAPermission;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IPAMetadataAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-14T02:27:21.666995377Z[GMT]")
public class IPAMetadataAllOf {
  public static final String SERIALIZED_NAME_BUNDLE_IDENTIFIER = "bundleIdentifier";
  @SerializedName(SERIALIZED_NAME_BUNDLE_IDENTIFIER)
  private String bundleIdentifier;

  public static final String SERIALIZED_NAME_MINIMUM_O_S_VERSION = "minimumOSVersion";
  @SerializedName(SERIALIZED_NAME_MINIMUM_O_S_VERSION)
  private String minimumOSVersion;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<IPAPermission> permissions = null;

  public IPAMetadataAllOf() { 
  }

  public IPAMetadataAllOf bundleIdentifier(String bundleIdentifier) {
    
    this.bundleIdentifier = bundleIdentifier;
    return this;
  }

   /**
   * The specified bundle name
   * @return bundleIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "com.examplecompany.appname", value = "The specified bundle name")

  public String getBundleIdentifier() {
    return bundleIdentifier;
  }


  public void setBundleIdentifier(String bundleIdentifier) {
    this.bundleIdentifier = bundleIdentifier;
  }


  public IPAMetadataAllOf minimumOSVersion(String minimumOSVersion) {
    
    this.minimumOSVersion = minimumOSVersion;
    return this;
  }

   /**
   * The specified minimum os version
   * @return minimumOSVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8.0", value = "The specified minimum os version")

  public String getMinimumOSVersion() {
    return minimumOSVersion;
  }


  public void setMinimumOSVersion(String minimumOSVersion) {
    this.minimumOSVersion = minimumOSVersion;
  }


  public IPAMetadataAllOf permissions(List<IPAPermission> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public IPAMetadataAllOf addPermissionsItem(IPAPermission permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<IPAPermission>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * The used permissions
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The used permissions")

  public List<IPAPermission> getPermissions() {
    return permissions;
  }


  public void setPermissions(List<IPAPermission> permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPAMetadataAllOf ipAMetadataAllOf = (IPAMetadataAllOf) o;
    return Objects.equals(this.bundleIdentifier, ipAMetadataAllOf.bundleIdentifier) &&
        Objects.equals(this.minimumOSVersion, ipAMetadataAllOf.minimumOSVersion) &&
        Objects.equals(this.permissions, ipAMetadataAllOf.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleIdentifier, minimumOSVersion, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAMetadataAllOf {\n");
    sb.append("    bundleIdentifier: ").append(toIndentedString(bundleIdentifier)).append("\n");
    sb.append("    minimumOSVersion: ").append(toIndentedString(minimumOSVersion)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

