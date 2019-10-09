package io.swagger.api;

import io.swagger.model.DetalleOrden;
import io.swagger.model.Orden;
import io.swagger.model.OrdenRsType;
import io.swagger.model.ParametrosDeSalidaType;
import io.swagger.model.StatusType;
import io.swagger.repository.DetalleOrdenRepository;
import io.swagger.repository.OrdenRepository;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-21T18:52:45.181Z")

@Controller
public class OrdenApiController implements OrdenApi {

	@Autowired
	private OrdenRepository ordenR;
	
	@Autowired
	private DetalleOrdenRepository detOrdenR;
	
    private static final Logger log = LoggerFactory.getLogger(OrdenApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OrdenApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<OrdenRsType> actualizarOrdenPorId(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKall4" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Id del orden a inactivar",required=true) @PathVariable("idOrden") Integer idOrden,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Orden orden) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	Orden o = ordenR.save(orden);
            	System.out.println(o.toString());
            	StatusType statusType = new StatusType(200, "EXITO");
            	OrdenRsType ost = new OrdenRsType();
            	ost.setStatus(statusType);
            	return new ResponseEntity<OrdenRsType>(ost,HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OrdenRsType>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OrdenRsType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OrdenRsType> conultarDetalleOrdenPorIdOrden(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKall4" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@NotNull @ApiParam(value = "Id del orden a consultar Detalle", required = true) @Valid @RequestParam(value = "idOrden", required = true) Integer idOrden) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	List<DetalleOrden> det = detOrdenR.findByIdOrden(idOrden);
            	System.out.println(det.get(0).toString());
            	ParametrosDeSalidaType ps = new ParametrosDeSalidaType();
            	ps.detalles(det);
            	StatusType statusType = new StatusType(200, "EXITO");
            	OrdenRsType ost = new OrdenRsType();
            	ost.datosBasicos(ps);
            	ost.setStatus(statusType);
            	return new ResponseEntity<OrdenRsType>(ost,HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OrdenRsType>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OrdenRsType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OrdenRsType> conultarOrdenPorCliente(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKall4" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@NotNull @ApiParam(value = "idCliente", required = true) @Valid @RequestParam(value = "idCliente", required = true) String idCliente) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	System.out.println("id cliente: "+idCliente);
            	List<Orden> ordenes = ordenR.findByIdCliente(idCliente) ;
            	//System.out.println(ordenes.get(0).toString());
            	StatusType statusType = new StatusType(200, "EXITO");
            	ParametrosDeSalidaType ps = new ParametrosDeSalidaType();
            	ps.ordenes(ordenes);
            	OrdenRsType or = new OrdenRsType();
            	or.datosBasicos(ps);
            	or.setStatus(statusType);
            	return new ResponseEntity<OrdenRsType>(or,HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OrdenRsType>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OrdenRsType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OrdenRsType> conultarOrdenPorId(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKall4" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Id del orden a consultar",required=true) @PathVariable("idOrden") Integer idOrden) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	Orden orden = ordenR.findByIdOrden(idOrden) ;
            	System.out.println(orden.toString());
            	StatusType statusType = new StatusType(200, "EXITO");
            	ParametrosDeSalidaType ps = new ParametrosDeSalidaType();
            	ps.addOrdenesItem(orden);
            	OrdenRsType or = new OrdenRsType();
            	or.datosBasicos(ps);
            	or.setStatus(statusType);
            	return new ResponseEntity<OrdenRsType>(or,HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OrdenRsType>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OrdenRsType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OrdenRsType> conultarOrdenesPorEstado(String headerRq, String serviceID, int idEstado) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	List<Orden> orden = ordenR.findByIdEstado(idEstado);
            	System.out.println(orden.get(0).toString());
            	StatusType statusType = new StatusType(200, "EXITO");
            	ParametrosDeSalidaType ps = new ParametrosDeSalidaType();
            	ps.ordenes(orden);
            	OrdenRsType or = new OrdenRsType();
            	or.datosBasicos(ps);
            	or.setStatus(statusType);
            	return new ResponseEntity<OrdenRsType>(or,HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OrdenRsType>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OrdenRsType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OrdenRsType> conultarOrdenesPorIdProducto(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKall4" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@NotNull @ApiParam(value = "Id del producto para listar las ordenes que lo contienen", required = true) @Valid @RequestParam(value = "idProducto", required = true) Integer idProducto) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	List<DetalleOrden> det = detOrdenR.findByIdProducto(idProducto);
            	System.out.println(det.get(0).toString());
            	StatusType statusType = new StatusType(200, "EXITO");
            	ParametrosDeSalidaType ps = new ParametrosDeSalidaType();
            	ps.detalles(det);
            	OrdenRsType or = new OrdenRsType();
            	or.datosBasicos(ps);
            	or.setStatus(statusType);
            	return new ResponseEntity<OrdenRsType>(or,HttpStatus.OK);
                //return new ResponseEntity<OrdenRsType>(objectMapper.readValue("{  \"datosBasicos\" : { },  \"status\" : {    \"statusDesc\" : \"statusDesc\",    \"statusCode\" : 0  }}", OrdenRsType.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OrdenRsType>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OrdenRsType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OrdenRsType> registrarOrden(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKall4" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Orden a registrar" ,required=true )  @Valid @RequestBody Orden orden) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	Orden o = ordenR.save(orden);
            	//List<Orden> lo = new ArrayList<Orden>();
            	//lo.add(o);
            	System.out.println(o.toString());
            	StatusType statusType = new StatusType(200, "EXITO");
            	ParametrosDeSalidaType ps = new ParametrosDeSalidaType();
            	ps.addOrdenesItem(o);
            	OrdenRsType orsstype = new OrdenRsType();
            	orsstype.datosBasicos(ps);
            	orsstype.setStatus(statusType);
            	return new ResponseEntity<OrdenRsType>(orsstype,HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OrdenRsType>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OrdenRsType>(HttpStatus.NOT_IMPLEMENTED);
    }


}
