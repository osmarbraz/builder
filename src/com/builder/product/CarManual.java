package com.builder.product;

import com.builder.parts.Engine;
import com.builder.parts.TripComputer;
import com.builder.parts.Transmission;
import com.builder.parts.GPSNavigator;

/**
 * Carro Manual é outro produto. Note que ele não tem o mesmo ancestral como um
 * carro. Eles não estão relacionados.
 */
public class CarManual {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public CarManual(CarType carType, int seats, Engine engine, Transmission transmission,
            TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Tipo do carro: " + carType + "\n";
        info += "Quantidade de assentos: " + seats + "\n";
        info += "Motor: volume - " + engine.getVolume() + "; km - " + engine.getMileage() + "\n";
        info += "Transmissao: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Computador de viagem: Funcional" + "\n";
        } else {
            info += "Computador de viagem: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "Navegador GPS: Funcional" + "\n";
        } else {
            info += "Navegador GPS: N/A" + "\n";
        }
        return info;
    }
}
