package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Ordenes de la plataforma Kallsonys
 */
@ApiModel(description = "Ordenes de la plataforma Kallsonys")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-21T18:52:45.181Z")

@Entity
@Table(name = "ordenes")
public class Orden   {
	
	
	
  public Orden() {
		
	}

  @Column(name = "idorden")
  @JsonProperty("idorden")
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idorden = null;

  @Column(name = "idcliente")
  @JsonProperty("idCliente")
  private String idCliente = null;

  @Column(name = "iddireccion")
  @JsonProperty("idDireccion")
  private String idDireccion = null;

  @Column(name = "valortotal")
  @JsonProperty("valorTotal")
  private BigDecimal valorTotal = null;

  @Column(name = "cantidadproductos")
  @JsonProperty("cantidadProductos")
  private Integer cantidadProductos = null;

  @Column(name = "fechasolicitud")
  @JsonProperty("fechaSolicitud")
  private String fechaSolicitud = null;

  @Column(name = "fechaaprobacion")
  @JsonProperty("fechaAprobacion")
  private String fechaAprobacion = null;

  @Column(name = "fechacierre")
  @JsonProperty("fechaCierre")
  private String fechaCierre = null;

  @Column(name = "estado")
  @JsonProperty("estado")
  private Integer estado = null;

  @Column(name = "comentario")
  @JsonProperty("comentario")
  private String comentario = null;

  @Column(name = "origen")
  @JsonProperty("origen")
  private String origen = null;

  public Orden idOrden(Integer idOrden) {
    this.idorden = idOrden;
    return this;
  }

  /**
   * Get idOrden
   * @return idOrden
  **/
  @ApiModelProperty(value = "")


  public Integer getIdOrden() {
    return idorden;
  }

  public void setIdOrden(Integer idOrden) {
    this.idorden = idOrden;
  }

  public Orden idCliente(String idCliente) {
    this.idCliente = idCliente;
    return this;
  }

  /**
   * Get idCliente
   * @return idCliente
  **/
  @ApiModelProperty(value = "")


  public String getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(String idCliente) {
    this.idCliente = idCliente;
  }

  public Orden idDireccion(String idDireccion) {
    this.idDireccion = idDireccion;
    return this;
  }

  /**
   * Get idDireccion
   * @return idDireccion
  **/
  @ApiModelProperty(value = "")


  public String getIdDireccion() {
    return idDireccion;
  }

  public void setIdDireccion(String idDireccion) {
    this.idDireccion = idDireccion;
  }

  public Orden valorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }

  /**
   * Get valorTotal
   * @return valorTotal
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  public Orden cantidadProductos(Integer cantidadProductos) {
    this.cantidadProductos = cantidadProductos;
    return this;
  }

  /**
   * Get cantidadProductos
   * @return cantidadProductos
  **/
  @ApiModelProperty(value = "")


  public Integer getCantidadProductos() {
    return cantidadProductos;
  }

  public void setCantidadProductos(Integer cantidadProductos) {
    this.cantidadProductos = cantidadProductos;
  }

  public Orden fechaSolicitud(String fechaSolicitud) {
    this.fechaSolicitud = fechaSolicitud;
    return this;
  }

  /**
   * Get fechaSolicitud
   * @return fechaSolicitud
  **/
  @ApiModelProperty(value = "")


  public String getFechaSolicitud() {
    return fechaSolicitud;
  }

  public void setFechaSolicitud(String fechaSolicitud) {
    this.fechaSolicitud = fechaSolicitud;
  }

  public Orden fechaAprobacion(String fechaAprobacion) {
    this.fechaAprobacion = fechaAprobacion;
    return this;
  }

  /**
   * Get fechaAprobacion
   * @return fechaAprobacion
  **/
  @ApiModelProperty(value = "")


  public String getFechaAprobacion() {
    return fechaAprobacion;
  }

  public void setFechaAprobacion(String fechaAprobacion) {
    this.fechaAprobacion = fechaAprobacion;
  }

  public Orden fechaCierre(String fechaCierre) {
    this.fechaCierre = fechaCierre;
    return this;
  }

  /**
   * Get fechaCierre
   * @return fechaCierre
  **/
  @ApiModelProperty(value = "")


  public String getFechaCierre() {
    return fechaCierre;
  }

  public void setFechaCierre(String fechaCierre) {
    this.fechaCierre = fechaCierre;
  }

  public Orden estado(Integer estado) {
    this.estado = estado;
    return this;
  }

  /**
   * Get estado
   * @return estado
  **/
  @ApiModelProperty(value = "")


  public Integer getEstado() {
    return estado;
  }

  public void setEstado(Integer estado) {
    this.estado = estado;
  }

  public Orden comentario(String comentario) {
    this.comentario = comentario;
    return this;
  }

  /**
   * Get comentario
   * @return comentario
  **/
  @ApiModelProperty(value = "")


  public String getComentario() {
    return comentario;
  }

  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

  public Orden origen(String origen) {
    this.origen = origen;
    return this;
  }

  /**
   * Get origen
   * @return origen
  **/
  @ApiModelProperty(value = "")


  public String getOrigen() {
    return origen;
  }

  public void setOrigen(String origen) {
    this.origen = origen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Orden orden = (Orden) o;
    return Objects.equals(this.idorden, orden.idorden) &&
        Objects.equals(this.idCliente, orden.idCliente) &&
        Objects.equals(this.idDireccion, orden.idDireccion) &&
        Objects.equals(this.valorTotal, orden.valorTotal) &&
        Objects.equals(this.cantidadProductos, orden.cantidadProductos) &&
        Objects.equals(this.fechaSolicitud, orden.fechaSolicitud) &&
        Objects.equals(this.fechaAprobacion, orden.fechaAprobacion) &&
        Objects.equals(this.fechaCierre, orden.fechaCierre) &&
        Objects.equals(this.estado, orden.estado) &&
        Objects.equals(this.comentario, orden.comentario) &&
        Objects.equals(this.origen, orden.origen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idorden, idCliente, idDireccion, valorTotal, cantidadProductos, fechaSolicitud, fechaAprobacion, fechaCierre, estado, comentario, origen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Orden {\n");
    
    sb.append("    idOrden: ").append(toIndentedString(idorden)).append("\n");
    sb.append("    idCliente: ").append(toIndentedString(idCliente)).append("\n");
    sb.append("    idDireccion: ").append(toIndentedString(idDireccion)).append("\n");
    sb.append("    valorTotal: ").append(toIndentedString(valorTotal)).append("\n");
    sb.append("    cantidadProductos: ").append(toIndentedString(cantidadProductos)).append("\n");
    sb.append("    fechaSolicitud: ").append(toIndentedString(fechaSolicitud)).append("\n");
    sb.append("    fechaAprobacion: ").append(toIndentedString(fechaAprobacion)).append("\n");
    sb.append("    fechaCierre: ").append(toIndentedString(fechaCierre)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    comentario: ").append(toIndentedString(comentario)).append("\n");
    sb.append("    origen: ").append(toIndentedString(origen)).append("\n");
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

