package com.mkyong.rest;
 
import java.util.List;
 
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
import org.o7planning.restfulcrud.dao.SensorDAO;
import org.o7planning.restfulcrud.model.Sensor;
 
@Path("/sensores")
public class SensorService {
 
    // URI:
    // /contextPath/servletPath/employees
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<Sensor> getSensores_JSON() {
        List<Sensor> listaSensores = SensorDAO.getAllDatoSensor();
        return listaSensores;
    }
 
    // URI:
    // /contextPath/servletPath/employees/{empNo}
    @GET
    @Path("/{id}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Sensor getSensor(@PathParam("id") String id) {
        return SensorDAO.getDatoSensor(id);
    }
 
    // URI:
    // /contextPath/servletPath/employees
    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Sensor addDatoSensor(Sensor sensor) {
        return SensorDAO.addDatoSensor(sensor);
    }
 
    // URI:
    // /contextPath/servletPath/employees
    @PUT
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Sensor updateDatoSensor(Sensor emp) {
        return SensorDAO.updateDatoSensor(emp);
    }
 
    @DELETE
    @Path("/{id}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public void deleteDatoSensor(@PathParam("id") String id) {
        SensorDAO.deleteDatoSensor(id);
    }
 
}