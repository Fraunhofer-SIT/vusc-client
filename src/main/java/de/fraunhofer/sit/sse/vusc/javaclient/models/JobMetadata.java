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
import de.fraunhofer.sit.sse.vusc.javaclient.models.APKMetadata;
import de.fraunhofer.sit.sse.vusc.javaclient.models.EARMetadata;
import de.fraunhofer.sit.sse.vusc.javaclient.models.ELFMetadata;
import de.fraunhofer.sit.sse.vusc.javaclient.models.IPAMetadata;
import de.fraunhofer.sit.sse.vusc.javaclient.models.JARProgramMetadata;
import de.fraunhofer.sit.sse.vusc.javaclient.models.JNLPMetadata;
import de.fraunhofer.sit.sse.vusc.javaclient.models.Platform;
import de.fraunhofer.sit.sse.vusc.javaclient.models.SpringApplicationMetadata;
import de.fraunhofer.sit.sse.vusc.javaclient.models.UWPMetadata;
import de.fraunhofer.sit.sse.vusc.javaclient.models.WARMetadata;
import de.fraunhofer.sit.sse.vusc.javaclient.models.WindowsMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information about the Job
 */
@ApiModel(description = "Information about the Job")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-14T02:27:21.666995377Z[GMT]")
public class JobMetadata {
  public static final String SERIALIZED_NAME_SHA256_HASH = "sha256Hash";
  @SerializedName(SERIALIZED_NAME_SHA256_HASH)
  private String sha256Hash;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_VERSION_NAME = "versionName";
  @SerializedName(SERIALIZED_NAME_VERSION_NAME)
  private String versionName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  protected String type;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private Platform platform;

  public JobMetadata() { 
    this.type = this.getClass().getSimpleName();
  }

  public JobMetadata sha256Hash(String sha256Hash) {
    
    this.sha256Hash = sha256Hash;
    return this;
  }

   /**
   * The SHA-256 hash of the input file
   * @return sha256Hash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ED347A07305214AB98974A008674EB78CD03B1FEDB73C8BE9F79E40FB8E155B0", value = "The SHA-256 hash of the input file")

  public String getSha256Hash() {
    return sha256Hash;
  }


  public void setSha256Hash(String sha256Hash) {
    this.sha256Hash = sha256Hash;
  }


  public JobMetadata displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The job&#39;s title (as extracted from the uploaded binary)
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Example App", required = true, value = "The job's title (as extracted from the uploaded binary)")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public JobMetadata versionName(String versionName) {
    
    this.versionName = versionName;
    return this;
  }

   /**
   * The job input file version (as extracted from the uploaded binary), if available
   * @return versionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Version 1.0.0", value = "The job input file version (as extracted from the uploaded binary), if available")

  public String getVersionName() {
    return versionName;
  }


  public void setVersionName(String versionName) {
    this.versionName = versionName;
  }


  public JobMetadata type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of metadata
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "APKMetadata", required = true, value = "The type of metadata")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public JobMetadata platform(Platform platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Platform getPlatform() {
    return platform;
  }


  public void setPlatform(Platform platform) {
    this.platform = platform;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobMetadata jobMetadata = (JobMetadata) o;
    return Objects.equals(this.sha256Hash, jobMetadata.sha256Hash) &&
        Objects.equals(this.displayName, jobMetadata.displayName) &&
        Objects.equals(this.versionName, jobMetadata.versionName) &&
        Objects.equals(this.type, jobMetadata.type) &&
        Objects.equals(this.platform, jobMetadata.platform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sha256Hash, displayName, versionName, type, platform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobMetadata {\n");
    sb.append("    sha256Hash: ").append(toIndentedString(sha256Hash)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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
