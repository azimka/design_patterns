package com.azimka.creational.factorymethod.creator;

import com.azimka.creational.factorymethod.product.Transport;

abstract public class TransportCreator {
    abstract Transport createTransport();

    public void doSomeLogic() {
        System.out.println("Some logic here");
        Transport transport = createTransport();

        transport.deliver();
    }
}
