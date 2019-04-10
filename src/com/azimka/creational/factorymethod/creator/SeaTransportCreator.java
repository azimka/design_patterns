package com.azimka.creational.factorymethod.creator;

import com.azimka.creational.factorymethod.product.SeaTransport;
import com.azimka.creational.factorymethod.product.Transport;

public class SeaTransportCreator extends TransportCreator{
    @Override
    Transport createTransport() {
        return new SeaTransport();
    }
}
