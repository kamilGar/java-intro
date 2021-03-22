// package pl.futurecollars.lesson5.task5;

class Car extends Vehicle {

    @Override
    protected void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
        }
    }

    @Override
    protected void stopEngine() {
        if (engineStarted) {
            engineStarted = false;
        }
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public void setEngineStarted(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }

}
