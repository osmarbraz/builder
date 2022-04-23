package com.builder.builders;

import com.builder.cars.CarType;
import com.builder.components.Engine;
import com.builder.components.TripComputer;
import com.builder.components.Transmission;
import com.builder.components.GPSNavigator;

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
