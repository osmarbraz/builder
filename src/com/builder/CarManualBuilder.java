package com.builder;

import com.builder.product.CarManual;
import com.builder.product.CarType;
import com.builder.parts.Engine;
import com.builder.parts.TripComputer;
import com.builder.parts.Transmission;
import com.builder.parts.GPSNavigator;

/**
 * Ao contrário de outros padrões de criação, o Builder pode construir produtos
 * não relacionados, que não possuem a interface comum.
 *
 * Neste caso, construímos um manual do usuário para um carro, usando os mesmos
 * passos que construiu um carro. Isso permite produzir manuais para modelos de
 * carros específicos, configurado com diferentes recursos.
 */
public class CarManualBuilder implements Builder {

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public CarManual getResult() {
        return new CarManual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
