package com.madhavi.weathersamplingapplication.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.time.LocalDateTime;

@JacksonXmlRootElement(localName = "alert")
public class DataRequestXMLDTO
{
    @JacksonXmlProperty
    private String identifier;
    @JacksonXmlProperty
    private String sender;
    @JacksonXmlProperty
    private String sent;
    @JacksonXmlProperty
    private String status;
    @JacksonXmlProperty
    private String msgType;
    @JacksonXmlProperty
    private String scope;
    @JacksonXmlProperty
    private Info info;

    @JacksonXmlProperty
    private double humidity;
    @JacksonXmlProperty
    private double lightIntensity;
    @JacksonXmlProperty
    private double barometricPressure;
    @JacksonXmlProperty
    private double temperature;

    public LocalDateTime getTimestamp()
    {
        return timestamp;
    }

    public void setTimestamp( LocalDateTime timestamp )
    {
        this.timestamp = timestamp;
    }

    public double getHumidity()
    {
        return humidity;
    }

    public void setHumidity( double humidity )
    {
        this.humidity = humidity;
    }

    public double getLightIntensity()
    {
        return lightIntensity;
    }

    public void setLightIntensity( double lightIntensity )
    {
        this.lightIntensity = lightIntensity;
    }

    public double getBarometricPressure()
    {
        return barometricPressure;
    }

    public void setBarometricPressure( double barometricPressure )
    {
        this.barometricPressure = barometricPressure;
    }

    public double getTemperature()
    {
        return temperature;
    }

    public void setTemperature( double temperature )
    {
        this.temperature = temperature;
    }
}
