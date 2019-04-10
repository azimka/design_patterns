package com.azimka.creational.factorymethod.creator;

import com.azimka.creational.factorymethod.product.AirTransport;
import com.azimka.creational.factorymethod.product.Transport;

public class AirTransportCreator extends TransportCreator{
    @Override
    Transport createTransport() {
        return new AirTransport();
    }
}
