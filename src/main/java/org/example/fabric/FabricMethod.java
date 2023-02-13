package org.example.fabric;

interface IProduction {
    void release();
}

class Car implements IProduction {

    @Override
    public void release() {
        System.out.println("Выпускаю легковой автомобиль");
    }

}

class Truck implements IProduction {

    @Override
    public void release() {
        System.out.println("Выпускаю грузовой автомобиль");
    }
}

interface TransportShop {
    IProduction create();
}

class CarShop implements TransportShop {

    @Override
    public IProduction create() {
        return new Car();
    }
}

class TruckShop implements TransportShop {

    @Override
    public IProduction create() {
        return new Truck();
    }
}

public class FabricMethod {

    public static void main(String[] args) {

        TransportShop creator = new CarShop();
        IProduction car = creator.create();
        creator = new TruckShop();
        IProduction truck = creator.create();

        car.release();
        truck.release();
    }
}
