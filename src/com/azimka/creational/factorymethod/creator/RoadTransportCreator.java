package com.azimka.creational.factorymethod.creator;

import com.azimka.creational.factorymethod.product.RoadTransport;
import com.azimka.creational.factorymethod.product.Transport;

public class RoadTransportCreator extends TransportCreator{
    @Override
    Transport createTransport() {
        return new RoadTransport();
    }
}
