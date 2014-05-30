/*
 * Position.java
 *
 * Created on 8. februar 2007, 11:11
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.rometools.modules.georss.geometries;

import java.io.Serializable;

/**
 * A two dimensional position represented by latitude and longitude decimal degrees in WGS84
 *
 * @author runaas
 */
public class Position implements Cloneable, Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private double latitude;
    private double longitude;

    /** Creates a new instance of Position */
    public Position() {
        latitude = Double.NaN;
        longitude = Double.NaN;
    }

    /**
     * Create Position from a pair of coordinate values
     *
     * @param latitude
     * @param longitude
     */
    public Position(final double latitude, final double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }

        final Position p = (Position) obj;
        return p.latitude == latitude && p.longitude == longitude;
    }

    /**
     * @return latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Set the latitude
     *
     * @param latitude the new latitude
     */
    public void setLatitude(final double latitude) {
        this.latitude = latitude;
    }

    /**
     * @return longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Set the longitude
     *
     * @param longitude the new longitude
     */
    public void setLongitude(final double longitude) {
        this.longitude = longitude;
    }
}