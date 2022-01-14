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
import de.fraunhofer.sit.sse.vusc.javaclient.models.DynamicVerification;
import de.fraunhofer.sit.sse.vusc.javaclient.models.FailedVerification;
import de.fraunhofer.sit.sse.vusc.javaclient.models.Path;
import de.fraunhofer.sit.sse.vusc.javaclient.models.RemoteVerification;
import de.fraunhofer.sit.sse.vusc.javaclient.models.StaticVerification;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information about verification of this finding
 */
@ApiModel(description = "Information about verification of this finding")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-14T02:27:21.666995377Z[GMT]")
public class Verification {
  public static final String SERIALIZED_NAME_VERIFIER = "verifier";
  @SerializedName(SERIALIZED_NAME_VERIFIER)
  private String verifier;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private Path path;

  public static final String SERIALIZED_NAME_VERIFIED = "verified";
  @SerializedName(SERIALIZED_NAME_VERIFIED)
  private Boolean verified;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  protected String type;

  public Verification() { 
    this.type = this.getClass().getSimpleName();
  }

  public Verification verifier(String verifier) {
    
    this.verifier = verifier;
    return this;
  }

   /**
   * The verifier
   * @return verifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The verifier")

  public String getVerifier() {
    return verifier;
  }


  public void setVerifier(String verifier) {
    this.verifier = verifier;
  }


  public Verification path(Path path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Path getPath() {
    return path;
  }


  public void setPath(Path path) {
    this.path = path;
  }


  public Verification verified(Boolean verified) {
    
    this.verified = verified;
    return this;
  }

   /**
   * Whether this finding has been marked as verified
   * @return verified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether this finding has been marked as verified")

  public Boolean getVerified() {
    return verified;
  }


  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  public Verification type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of verification
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Static", required = true, value = "The type of verification")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Verification verification = (Verification) o;
    return Objects.equals(this.verifier, verification.verifier) &&
        Objects.equals(this.path, verification.path) &&
        Objects.equals(this.verified, verification.verified) &&
        Objects.equals(this.type, verification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verifier, path, verified, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Verification {\n");
    sb.append("    verifier: ").append(toIndentedString(verifier)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
