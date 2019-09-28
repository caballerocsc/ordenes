package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DetalleOrden;
import io.swagger.model.Orden;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * información de devuelta.
 */
@ApiModel(description = "información de devuelta.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-28T14:02:48.580Z")

public class ParametrosDeSalidaType   {
	
	public ParametrosDeSalidaType() {
	}
	
  @JsonProperty("ordenes")
  @Valid
  private List<Orden> ordenes = null;

  @JsonProperty("detalles")
  @Valid
  private List<DetalleOrden> detalles = null;

  public ParametrosDeSalidaType ordenes(List<Orden> ordenes) {
    this.ordenes = ordenes;
    return this;
  }

  public ParametrosDeSalidaType addOrdenesItem(Orden ordenesItem) {
    if (this.ordenes == null) {
      this.ordenes = new ArrayList<Orden>();
    }
    this.ordenes.add(ordenesItem);
    return this;
  }

  /**
   * Get ordenes
   * @return ordenes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Orden> getOrdenes() {
    return ordenes;
  }

  public void setOrdenes(List<Orden> ordenes) {
    this.ordenes = ordenes;
  }

  public ParametrosDeSalidaType detalles(List<DetalleOrden> detalles) {
    this.detalles = detalles;
    return this;
  }

  public ParametrosDeSalidaType addDetallesItem(DetalleOrden detallesItem) {
    if (this.detalles == null) {
      this.detalles = new ArrayList<DetalleOrden>();
    }
    this.detalles.add(detallesItem);
    return this;
  }

  /**
   * Get detalles
   * @return detalles
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DetalleOrden> getDetalles() {
    return detalles;
  }

  public void setDetalles(List<DetalleOrden> detalles) {
    this.detalles = detalles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParametrosDeSalidaType parametrosDeSalidaType = (ParametrosDeSalidaType) o;
    return Objects.equals(this.ordenes, parametrosDeSalidaType.ordenes) &&
        Objects.equals(this.detalles, parametrosDeSalidaType.detalles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ordenes, detalles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametrosDeSalidaType {\n");
    
    sb.append("    ordenes: ").append(toIndentedString(ordenes)).append("\n");
    sb.append("    detalles: ").append(toIndentedString(detalles)).append("\n");
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

