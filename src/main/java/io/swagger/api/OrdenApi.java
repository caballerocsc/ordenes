/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.8).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Orden;
import io.swagger.model.OrdenRsType;
import io.swagger.model.PatchRequest;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-21T18:52:45.181Z")

@CrossOrigin
@Api(value = "orden", description = "the orden API")
public interface OrdenApi {

    @ApiOperation(value = "Actualizar Inactivar Orden por ID", nickname = "actualizarOrdenPorId", notes = "Actualizar un orden", response = OrdenRsType.class, tags={ "Orden", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = OrdenRsType.class),
        @ApiResponse(code = 400, message = "Bad request", response = OrdenRsType.class),
        @ApiResponse(code = 404, message = "Not found", response = OrdenRsType.class) })
    @RequestMapping(value = "/orden/{idOrden}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<OrdenRsType> actualizarOrdenPorId(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKall4" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Id del orden a inactivar",required=true) @PathVariable("idOrden") Integer idOrden,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Orden orden);


    @ApiOperation(value = "Consultar Detalle por IdOrden", nickname = "conultarDetalleOrdenPorIdOrden", notes = "Retorna una orden", response = OrdenRsType.class, tags={ "Detalle Orden", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = OrdenRsType.class),
        @ApiResponse(code = 400, message = "Bad request", response = OrdenRsType.class),
        @ApiResponse(code = 404, message = "Not found", response = OrdenRsType.class) })
    @RequestMapping(value = "/orden/detallePorIdOrden",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<OrdenRsType> conultarDetalleOrdenPorIdOrden(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKall4" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@NotNull @ApiParam(value = "Id del orden a consultar Detalle", required = true) @Valid @RequestParam(value = "idOrden", required = true) Integer idOrden);


    @ApiOperation(value = "Consultar Orden por Cliente", nickname = "conultarOrdenPorCliente", notes = "Retorna un orden", response = OrdenRsType.class, tags={ "Orden", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = OrdenRsType.class),
        @ApiResponse(code = 400, message = "Bad request", response = OrdenRsType.class),
        @ApiResponse(code = 404, message = "Not found", response = OrdenRsType.class) })
    @RequestMapping(value = "/orden/consultarPorCliente",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<OrdenRsType> conultarOrdenPorCliente(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKall4" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@NotNull @ApiParam(value = "idCliente", required = true) @Valid @RequestParam(value = "idCliente", required = true) String idCliente);


    @ApiOperation(value = "Consultar Orden por ID", nickname = "conultarOrdenPorId", notes = "Retorna un orden", response = OrdenRsType.class, tags={ "Orden", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = OrdenRsType.class),
        @ApiResponse(code = 400, message = "Bad request", response = OrdenRsType.class),
        @ApiResponse(code = 404, message = "Not found", response = OrdenRsType.class) })
    @RequestMapping(value = "/orden/{idOrden}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<OrdenRsType> conultarOrdenPorId(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKall4" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Id del orden a consultar",required=true) @PathVariable("idOrden") Integer idOrden);


    @ApiOperation(value = "Consultar Ordenes Activas", nickname = "conultarOrdenesActivas", notes = "Retorna ordenes activas", response = OrdenRsType.class, tags={ "Orden", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = OrdenRsType.class),
        @ApiResponse(code = 400, message = "Bad request", response = OrdenRsType.class),
        @ApiResponse(code = 404, message = "Not found", response = OrdenRsType.class) })
    @RequestMapping(value = "/orden/consultarActivas",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<OrdenRsType> conultarOrdenesActivas(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKall4" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID);


    @ApiOperation(value = "Consultar Detalle por IdProducto", nickname = "conultarOrdenesPorIdProducto", notes = "Retorna una orden por producto", response = OrdenRsType.class, tags={ "Orden", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = OrdenRsType.class),
        @ApiResponse(code = 400, message = "Bad request", response = OrdenRsType.class),
        @ApiResponse(code = 404, message = "Not found", response = OrdenRsType.class) })
    @RequestMapping(value = "/orden/ordenesPorProducto",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<OrdenRsType> conultarOrdenesPorIdProducto(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKall4" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@NotNull @ApiParam(value = "Id del producto para listar las ordenes que lo contienen", required = true) @Valid @RequestParam(value = "idProducto", required = true) Integer idProducto);


    @ApiOperation(value = "Registrar una Orden", nickname = "registrarOrden", notes = "", response = OrdenRsType.class, tags={ "Orden", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = OrdenRsType.class),
        @ApiResponse(code = 400, message = "Bad request", response = OrdenRsType.class),
        @ApiResponse(code = 404, message = "Not found", response = OrdenRsType.class) })
    @RequestMapping(value = "/orden",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<OrdenRsType> registrarOrden(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKall4" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Orden a registrar" ,required=true )  @Valid @RequestBody Orden orden);

}
