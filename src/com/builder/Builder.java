package com.builder;

import com.builder.product.CarType;
import com.builder.parts.Engine;
import com.builder.parts.TripComputer;
import com.builder.parts.Transmission;
import com.builder.parts.GPSNavigator;

/**
 * A interface do Builder define todas as formas possíveis de configurar um
 * produto.
 *
 */
public interface Builder {

    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
