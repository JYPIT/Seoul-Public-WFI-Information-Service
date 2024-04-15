package utils;

public class Distance {
    public double getDistance(double x1, double y1, double x2, double y2) {
        double result = 0;
        double dx = x2 - x1;
        double dy = y2 - y1;

        result = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));

        result = Double.parseDouble(String.format("%.4f", result));
        return result;
    }
}
