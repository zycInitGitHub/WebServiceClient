
package com.higgin.weather;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WeatherInterface", targetNamespace = "http://weather.Higgin.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherInterface {


    /**
     * 
     * @param cityName
     * @return
     *     returns java.util.List<com.higgin.weather.WeatherModel>
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "queryWeather", targetNamespace = "http://weather.Higgin.com/", className = "com.higgin.weather.QueryWeather")
    @ResponseWrapper(localName = "queryWeatherResponse", targetNamespace = "http://weather.Higgin.com/", className = "com.higgin.weather.QueryWeatherResponse")
    public List<WeatherModel> queryWeather(
            @WebParam(name = "cityName", targetNamespace = "")
                    String cityName);

}