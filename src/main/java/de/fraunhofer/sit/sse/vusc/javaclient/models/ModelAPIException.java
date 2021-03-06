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
 * An exception has occurred while processing the request.
 */
@ApiModel(description = "An exception has occurred while processing the request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-14T02:27:21.666995377Z[GMT]")
public class ModelAPIException {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Integer code;

  public ModelAPIException() { 
  }

  public ModelAPIException title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * A short description of the error that occured
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Internal Error", required = true, value = "A short description of the error that occured")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ModelAPIException description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A more detailed description of the error that occured
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Out of storage space", required = true, value = "A more detailed description of the error that occured")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ModelAPIException code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCode() {
    return code;
  }


  public void setCode(Integer code) {
    this.code = code;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAPIException _apIException = (ModelAPIException) o;
    return Objects.equals(this.title, _apIException.title) &&
        Objects.equals(this.description, _apIException.description) &&
        Objects.equals(this.code, _apIException.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAPIException {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

