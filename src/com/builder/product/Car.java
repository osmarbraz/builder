package com.builder.product;

import com.builder.parts.Engine;
import com.builder.parts.TripComputer;
import com.builder.parts.Transmission;
import com.builder.parts.GPSNavigator;

/**
 * Car é a classe produto. Um carro pode ter um GPS, computador de bordo, e
 * alguns assentos. Diferentes modelos de carros (esportivo, SUV, conversível)
 * podem ter diferentes funcionalidades instaladas ou equipadas.
 */
public class Car {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission,
            TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
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
