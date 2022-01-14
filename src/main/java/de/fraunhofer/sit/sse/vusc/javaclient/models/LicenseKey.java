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
import de.fraunhofer.sit.sse.vusc.javaclient.models.ConsumedItemType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Represents a license key
 */
@ApiModel(description = "Represents a license key")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-14T02:27:21.666995377Z[GMT]")
public class LicenseKey {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALID_UNTIL = "validUntil";
  @SerializedName(SERIALIZED_NAME_VALID_UNTIL)
  private OffsetDateTime validUntil;

  public static final String SERIALIZED_NAME_VALID_FROM = "validFrom";
  @SerializedName(SERIALIZED_NAME_VALID_FROM)
  private OffsetDateTime validFrom;

  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private String product;

  public static final String SERIALIZED_NAME_CONSUMED = "consumed";
  @SerializedName(SERIALIZED_NAME_CONSUMED)
  private List<ConsumedItemType> consumed = new ArrayList<ConsumedItemType>();

  public LicenseKey() { 
  }

  public LicenseKey key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The license key
   * @return key
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The license key")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public LicenseKey validUntil(OffsetDateTime validUntil) {
    
    this.validUntil = validUntil;
    return this;
  }

   /**
   * The date the license key expires
   * @return validUntil
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The date the license key expires")

  public OffsetDateTime getValidUntil() {
    return validUntil;
  }


  public void setValidUntil(OffsetDateTime validUntil) {
    this.validUntil = validUntil;
  }


  public LicenseKey validFrom(OffsetDateTime validFrom) {
    
    this.validFrom = validFrom;
    return this;
  }

   /**
   * The start date the license key is valid
   * @return validFrom
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The start date the license key is valid")

  public OffsetDateTime getValidFrom() {
    return validFrom;
  }


  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }


  public LicenseKey product(String product) {
    
    this.product = product;
    return this;
  }

   /**
   * The product
   * @return product
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The product")

  public String getProduct() {
    return product;
  }


  public void setProduct(String product) {
    this.product = product;
  }


  public LicenseKey consumed(List<ConsumedItemType> consumed) {
    
    this.consumed = consumed;
    return this;
  }

  public LicenseKey addConsumedItem(ConsumedItemType consumedItem) {
    this.consumed.add(consumedItem);
    return this;
  }

   /**
   * The list of consumed item types
   * @return consumed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The list of consumed item types")

  public List<ConsumedItemType> getConsumed() {
    return consumed;
  }


  public void setConsumed(List<ConsumedItemType> consumed) {
    this.consumed = consumed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseKey licenseKey = (LicenseKey) o;
    return Objects.equals(this.key, licenseKey.key) &&
        Objects.equals(this.validUntil, licenseKey.validUntil) &&
        Objects.equals(this.validFrom, licenseKey.validFrom) &&
        Objects.equals(this.product, licenseKey.product) &&
        Objects.equals(this.consumed, licenseKey.consumed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, validUntil, validFrom, product, consumed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseKey {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    consumed: ").append(toIndentedString(consumed)).append("\n");
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
