// package pl.futurecollars.lesson5.task5;

class Bicycle extends Vehicle {

    @Override
    protected void startEngine() {
        throw new UnsupportedOperationException("Bicycle does not have engine");
    }
    @Override
    protected void stopEngine() {
        throw new UnsupportedOperationException("Bicycle does not have engine");
    }

}
