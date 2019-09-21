package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ParametrosDeSalidaType;
import io.swagger.model.StatusType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Respuesta genérica.
 */
@ApiModel(description = "Respuesta genérica.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-21T18:52:45.181Z")

public class OrdenRsType   {
  @JsonProperty("status")
  private StatusType status = null;

  @JsonProperty("datosBasicos")
  private ParametrosDeSalidaType datosBasicos = null;

  public OrdenRsType status(StatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public StatusType getStatus() {
    return status;
  }

  public void setStatus(StatusType status) {
    this.status = status;
  }

  public OrdenRsType datosBasicos(ParametrosDeSalidaType datosBasicos) {
    this.datosBasicos = datosBasicos;
    return this;
  }

  /**
   * Get datosBasicos
   * @return datosBasicos
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ParametrosDeSalidaType getDatosBasicos() {
    return datosBasicos;
  }

  public void setDatosBasicos(ParametrosDeSalidaType datosBasicos) {
    this.datosBasicos = datosBasicos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrdenRsType ordenRsType = (OrdenRsType) o;
    return Objects.equals(this.status, ordenRsType.status) &&
        Objects.equals(this.datosBasicos, ordenRsType.datosBasicos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, datosBasicos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdenRsType {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    datosBasicos: ").append(toIndentedString(datosBasicos)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

