package org.o7planning.restfulcrud.dao;
 
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.o7planning.restfulcrud.model.Sensor;
 
 
public class SensorDAO {
 
    private static final Map<String, Sensor> empMap = new HashMap<String, Sensor>();
 
    static {
        
    }
 
    public static Sensor getDatoSensor(String id) {
        return empMap.get(id);
    }
 
    public static Sensor addDatoSensor(Sensor sensor) {
        empMap.put(sensor.getId(), sensor);
        return sensor;
    }
 
    public static Sensor updateDatoSensor(Sensor sensor) {
      empMap.put(sensor.getId(), sensor);
        return sensor;
    }
 
    public static void deleteDatoSensor(String id) {
        empMap.remove(id);
    }
 
    public static List<Sensor> getAllDatoSensor() {
        Collection<Sensor> c = empMap.values();
        List<Sensor> list = new ArrayList<Sensor>();
        list.addAll(c);
        return list;
    }
     
    List<Sensor> list;
 
}