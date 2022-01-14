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
import de.fraunhofer.sit.sse.vusc.javaclient.models.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contains information about the login status
 */
@ApiModel(description = "Contains information about the login status")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-14T02:27:21.666995377Z[GMT]")
public class LoginStatus {
  public static final String SERIALIZED_NAME_LOGIN_REQUIRED = "loginRequired";
  @SerializedName(SERIALIZED_NAME_LOGIN_REQUIRED)
  private Boolean loginRequired;

  public static final String SERIALIZED_NAME_LOGGED_IN_USER = "loggedInUser";
  @SerializedName(SERIALIZED_NAME_LOGGED_IN_USER)
  private User loggedInUser;

  public LoginStatus() { 
  }

  public LoginStatus loginRequired(Boolean loginRequired) {
    
    this.loginRequired = loginRequired;
    return this;
  }

   /**
   * Whether login is required
   * @return loginRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether login is required")

  public Boolean getLoginRequired() {
    return loginRequired;
  }


  public void setLoginRequired(Boolean loginRequired) {
    this.loginRequired = loginRequired;
  }


  public LoginStatus loggedInUser(User loggedInUser) {
    
    this.loggedInUser = loggedInUser;
    return this;
  }

   /**
   * Get loggedInUser
   * @return loggedInUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public User getLoggedInUser() {
    return loggedInUser;
  }


  public void setLoggedInUser(User loggedInUser) {
    this.loggedInUser = loggedInUser;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginStatus loginStatus = (LoginStatus) o;
    return Objects.equals(this.loginRequired, loginStatus.loginRequired) &&
        Objects.equals(this.loggedInUser, loginStatus.loggedInUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginRequired, loggedInUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginStatus {\n");
    sb.append("    loginRequired: ").append(toIndentedString(loginRequired)).append("\n");
    sb.append("    loggedInUser: ").append(toIndentedString(loggedInUser)).append("\n");
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
