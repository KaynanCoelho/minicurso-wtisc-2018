package com.minicurso.ms.msdistancecalculator.commons;

public class HaversineDistanceUtil {

    public static final double KM_IN_METERS = 1000;

    public static final double EARTH_RADIUS_KM = 6371;

    public static double distanceInMeters(double lat1, double lon1, double lat2, double lon2) {
        return distanceInKm(lat1, lon1, lat2, lon2) * KM_IN_METERS;
    }

    public static double distanceInKm(double lat1, double lon1, double lat2, double lon2) {
        double sinDeltaLat = sinDelta(lat1, lat2);
        double sinDeltaLon = sinDelta(lon1, lon2);
        double a = sinDeltaLat + sinDeltaLon * cos(lat1, lat2);
        return EARTH_RADIUS_KM * 2 * Math.asin(Math.sqrt(a));
    }

    private static double sinDelta(double v1, double v2) {
        double delta = Math.toRadians(v2 - v1);
        return Math.pow(Math.sin(delta / 2), 2);
    }

    private static double cos(double lat1, double lat2) {
        double rlat1 = Math.toRadians(lat1);
        double rlat2 = Math.toRadians(lat2);
        return Math.cos(rlat1) * Math.cos(rlat2);
    }

}
