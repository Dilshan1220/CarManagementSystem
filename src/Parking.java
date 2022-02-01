//Parking.java_Code
    public class Parking {
    private int car = 0, bike = 0, van = 0;

    public int getCar() {
        return car;
    }

    public void setCar(int car) {
        this.car = car;
    }

    public int getBike() {
        return bike;
    }

    public void setBike(int bike) {
        this.bike = bike;
    }

    public int getVan() {
        return van;
    }

    public void setVan(int van) {
        this.van = van;
    }

    public void delete() {
        car = 0;
        bike = 0;
        van = 0;
    }
}

