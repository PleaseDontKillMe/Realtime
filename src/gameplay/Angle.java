package gameplay;

import ui.gfx.IntTransition;

import static java.lang.Math.toDegrees;
import static java.lang.Math.toRadians;

public final class Angle {
    private final double angle;

    public Angle() {
        this(0.0);
    }

    public Angle(double value) {
        this.angle = value;
    }

    public Angle(Angle angle) {
        this(angle.angle);
    }

    public double getValue() {
        return angle;
    }

    private double getDegreeValue() {
        return toDegrees(angle);
    }

    public Angle add(Angle a) {
        return new Angle(this.angle + a.angle);
    }

    public static Angle fromDegrees(int degrees) {
        return new Angle(toRadians(degrees));
    }

    public static class Transition {
        public static Angle linear(Angle beginning, Angle end, double transitionValue) {
            double a = beginning.getValue(),  // 350
                    b = end.getValue();       // 0

            if (b - a > Math.PI) a += Math.PI * 2;       // 370
            if (a - b > Math.PI) b += Math.PI * 2;

            return new Angle(IntTransition.linear(a, b, transitionValue));
        }

        public static Angle cosine(Angle beginning, Angle end, double transitionValue) {
            double a = beginning.getValue(),  // 350
                    b = end.getValue();       // 0

            if (b - a > Math.PI) a += Math.PI * 2;       // 370
            if (a - b > Math.PI) b += Math.PI * 2;

            return new Angle(IntTransition.cosine(a, b, transitionValue));
        }

        public static Angle cubic(Angle beginning, Angle end, Angle a, Angle b, double transitionValue) {
            double[] values = {beginning.getValue(), end.getValue(), a.getValue(), b.getValue()};
            for (int i = 1; i < values.length; i++) {
                if (values[i - 1] - values[i] > Math.PI) {
                    for (int j = i; j < values.length; j++) {
                        values[j] += 2 * Math.PI;
                    }
                } else if (values[i] - values[i - 1] > Math.PI) {
                    for (int j = 0; j < i; j++) {
                        values[j] += 2 * Math.PI;
                    }
                }
            }

            return new Angle(IntTransition.cubic(values[0], values[1], values[2], values[3], transitionValue));
        }
    }

    @Override
    public String toString() {
        return "Angle: " + String.format("%.2f", getDegreeValue()) + " degrees";
    }
}
