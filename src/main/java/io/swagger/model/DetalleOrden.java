package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Detalle de las ordenes de la plataforma Kallsonys
 */
@ApiModel(description = "Detalle de las ordenes de la plataforma Kallsonys")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-21T18:52:45.181Z")

public class DetalleOrden   {
  @JsonProperty("idDetOrden")
  private Integer idDetOrden = null;

  @JsonProperty("idOrden")
  private Integer idOrden = null;

  @JsonProperty("idProducto")
  private Integer idProducto = null;

  @JsonProperty("cantidad")
  private Integer cantidad = null;

  @JsonProperty("valorUnidad")
  private BigDecimal valorUnidad = null;

  @JsonProperty("idProveedor")
  private Integer idProveedor = null;

  @JsonProperty("estado")
  private String estado = null;

  public DetalleOrden idDetOrden(Integer idDetOrden) {
    this.idDetOrden = idDetOrden;
    return this;
  }

  /**
   * Get idDetOrden
   * @return idDetOrden
  **/
  @ApiModelProperty(value = "")


  public Integer getIdDetOrden() {
    return idDetOrden;
  }

  public void setIdDetOrden(Integer idDetOrden) {
    this.idDetOrden = idDetOrden;
  }

  public DetalleOrden idOrden(Integer idOrden) {
    this.idOrden = idOrden;
    return this;
  }

  /**
   * Get idOrden
   * @return idOrden
  **/
  @ApiModelProperty(value = "")


  public Integer getIdOrden() {
    return idOrden;
  }

  public void setIdOrden(Integer idOrden) {
    this.idOrden = idOrden;
  }

  public DetalleOrden idProducto(Integer idProducto) {
    this.idProducto = idProducto;
    return this;
  }

  /**
   * Get idProducto
   * @return idProducto
  **/
  @ApiModelProperty(value = "")


  public Integer getIdProducto() {
    return idProducto;
  }

  public void setIdProducto(Integer idProducto) {
    this.idProducto = idProducto;
  }

  public DetalleOrden cantidad(Integer cantidad) {
    this.cantidad = cantidad;
    return this;
  }

  /**
   * Get cantidad
   * @return cantidad
  **/
  @ApiModelProperty(value = "")


  public Integer getCantidad() {
    return cantidad;
  }

  public void setCantidad(Integer cantidad) {
    this.cantidad = cantidad;
  }

  public DetalleOrden valorUnidad(BigDecimal valorUnidad) {
    this.valorUnidad = valorUnidad;
    return this;
  }

  /**
   * Get valorUnidad
   * @return valorUnidad
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getValorUnidad() {
    return valorUnidad;
  }

  public void setValorUnidad(BigDecimal valorUnidad) {
    this.valorUnidad = valorUnidad;
  }

  public DetalleOrden idProveedor(Integer idProveedor) {
    this.idProveedor = idProveedor;
    return this;
  }

  /**
   * Get idProveedor
   * @return idProveedor
  **/
  @ApiModelProperty(value = "")


  public Integer getIdProveedor() {
    return idProveedor;
  }

  public void setIdProveedor(Integer idProveedor) {
    this.idProveedor = idProveedor;
  }

  public DetalleOrden estado(String estado) {
    this.estado = estado;
    return this;
  }

  /**
   * Get estado
   * @return estado
  **/
  @ApiModelProperty(value = "")


  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetalleOrden detalleOrden = (DetalleOrden) o;
    return Objects.equals(this.idDetOrden, detalleOrden.idDetOrden) &&
        Objects.equals(this.idOrden, detalleOrden.idOrden) &&
        Objects.equals(this.idProducto, detalleOrden.idProducto) &&
        Objects.equals(this.cantidad, detalleOrden.cantidad) &&
        Objects.equals(this.valorUnidad, detalleOrden.valorUnidad) &&
        Objects.equals(this.idProveedor, detalleOrden.idProveedor) &&
        Objects.equals(this.estado, detalleOrden.estado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idDetOrden, idOrden, idProducto, cantidad, valorUnidad, idProveedor, estado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalleOrden {\n");
    
    sb.append("    idDetOrden: ").append(toIndentedString(idDetOrden)).append("\n");
    sb.append("    idOrden: ").append(toIndentedString(idOrden)).append("\n");
    sb.append("    idProducto: ").append(toIndentedString(idProducto)).append("\n");
    sb.append("    cantidad: ").append(toIndentedString(cantidad)).append("\n");
    sb.append("    valorUnidad: ").append(toIndentedString(valorUnidad)).append("\n");
    sb.append("    idProveedor: ").append(toIndentedString(idProveedor)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
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

