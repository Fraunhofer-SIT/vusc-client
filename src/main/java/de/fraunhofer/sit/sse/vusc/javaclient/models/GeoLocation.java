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
 * A geolocation type
 */
@ApiModel(description = "A geolocation type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-14T02:27:21.666995377Z[GMT]")
public class GeoLocation {
  public static final String SERIALIZED_NAME_LAT = "lat";
  @SerializedName(SERIALIZED_NAME_LAT)
  private Double lat;

  public static final String SERIALIZED_NAME_LON = "lon";
  @SerializedName(SERIALIZED_NAME_LON)
  private Double lon;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public GeoLocation() { 
  }

  public GeoLocation lat(Double lat) {
    
    this.lat = lat;
    return this;
  }

   /**
   * The coordinate&#39;s latitude
   * @return lat
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "52.37403", required = true, value = "The coordinate's latitude")

  public Double getLat() {
    return lat;
  }


  public void setLat(Double lat) {
    this.lat = lat;
  }


  public GeoLocation lon(Double lon) {
    
    this.lon = lon;
    return this;
  }

   /**
   * The coordinate&#39;s longitude
   * @return lon
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4.88969", required = true, value = "The coordinate's longitude")

  public Double getLon() {
    return lon;
  }


  public void setLon(Double lon) {
    this.lon = lon;
  }


  public GeoLocation country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The country this location is in
   * @return country
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Netherlands", required = true, value = "The country this location is in")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public GeoLocation city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The city this location is in
   * @return city
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Amsterdam", required = true, value = "The city this location is in")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public GeoLocation countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The country code
   * @return countryCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "NL", required = true, value = "The country code")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoLocation geoLocation = (GeoLocation) o;
    return Objects.equals(this.lat, geoLocation.lat) &&
        Objects.equals(this.lon, geoLocation.lon) &&
        Objects.equals(this.country, geoLocation.country) &&
        Objects.equals(this.city, geoLocation.city) &&
        Objects.equals(this.countryCode, geoLocation.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lon, country, city, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoLocation {\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

