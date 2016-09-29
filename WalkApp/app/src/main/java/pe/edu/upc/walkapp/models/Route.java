package pe.edu.upc.walkapp.models;

import java.util.Date;

/**
 * Created by Gonzalo on 27/09/2016.
 */

public class Route {
   private double initialLat;
    private double endLat;
    private double initialLong;
    private double endLong;

    public Route(double initialLat, double endLat, double initialLong, double endLong) {
        this.initialLat = initialLat;
        this.endLat = endLat;
        this.initialLong = initialLong;
        this.endLong = endLong;
    }

    public double getInitialLat() {
        return initialLat;
    }

    public void setInitialLat(double initialLat) {
        this.initialLat = initialLat;
    }

    public double getEndLat() {
        return endLat;
    }

    public void setEndLat(double endLat) {
        this.endLat = endLat;
    }

    public double getInitialLong() {
        return initialLong;
    }

    public void setInitialLong(double initialLong) {
        this.initialLong = initialLong;
    }

    public double getEndLong() {
        return endLong;
    }

    public void setEndLong(double endLong) {
        this.endLong = endLong;
    }
}
