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
import de.fraunhofer.sit.sse.vusc.javaclient.models.ELFMetadataAllOf;
import de.fraunhofer.sit.sse.vusc.javaclient.models.IPAMetadata;
import de.fraunhofer.sit.sse.vusc.javaclient.models.JARProgramMetadata;
import de.fraunhofer.sit.sse.vusc.javaclient.models.JNLPMetadata;
import de.fraunhofer.sit.sse.vusc.javaclient.models.JobMetadata;
import de.fraunhofer.sit.sse.vusc.javaclient.models.Platform;
import de.fraunhofer.sit.sse.vusc.javaclient.models.SpringApplicationMetadata;
import de.fraunhofer.sit.sse.vusc.javaclient.models.UWPMetadata;
import de.fraunhofer.sit.sse.vusc.javaclient.models.WARMetadata;
import de.fraunhofer.sit.sse.vusc.javaclient.models.WindowsMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Metadata for an ELF executable file
 */
@ApiModel(description = "Metadata for an ELF executable file")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-14T02:27:21.666995377Z[GMT]")
public class ELFMetadata extends JobMetadata {
  public static final String SERIALIZED_NAME_MACHINE_TYPE = "machineType";
  @SerializedName(SERIALIZED_NAME_MACHINE_TYPE)
  private String machineType;

  public static final String SERIALIZED_NAME_PROGRAM_INTERPRETER = "programInterpreter";
  @SerializedName(SERIALIZED_NAME_PROGRAM_INTERPRETER)
  private String programInterpreter;

  public ELFMetadata() { 
    this.type = this.getClass().getSimpleName();
  }

  public ELFMetadata machineType(String machineType) {
    
    this.machineType = machineType;
    return this;
  }

   /**
   * The specified machine type
   * @return machineType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "EM_X86_64", required = true, value = "The specified machine type")

  public String getMachineType() {
    return machineType;
  }


  public void setMachineType(String machineType) {
    this.machineType = machineType;
  }


  public ELFMetadata programInterpreter(String programInterpreter) {
    
    this.programInterpreter = programInterpreter;
    return this;
  }

   /**
   * The specified ELF interpreter
   * @return programInterpreter
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "/lib/ld-linux.so.2", required = true, value = "The specified ELF interpreter")

  public String getProgramInterpreter() {
    return programInterpreter;
  }


  public void setProgramInterpreter(String programInterpreter) {
    this.programInterpreter = programInterpreter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ELFMetadata elFMetadata = (ELFMetadata) o;
    return Objects.equals(this.machineType, elFMetadata.machineType) &&
        Objects.equals(this.programInterpreter, elFMetadata.programInterpreter) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(machineType, programInterpreter, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ELFMetadata {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    machineType: ").append(toIndentedString(machineType)).append("\n");
    sb.append("    programInterpreter: ").append(toIndentedString(programInterpreter)).append("\n");
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
