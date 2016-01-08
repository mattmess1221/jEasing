package mnm.jeasing.types;

import mnm.jeasing.Easing;
import mnm.jeasing.EasingType;

public class Exponential implements EasingType {

    @Override
    public Easing in() {
        return (t, b, c, d) -> c * Math.pow(2, 10 * (t / d - 1)) + b;
    }

    @Override
    public Easing out() {
        return (t, b, c, d) -> c * (-Math.pow(2, -10 * t / d) + 1) + b;
    }

    @Override
    public Easing inOut() {
        return (t, b, c, d) -> {
            t /= d / 2;
            if (t < 1)
                return c / 2 * Math.pow(2, 10 * (t - 1)) + b;
            return c / 2 * (-Math.pow(2, -10 * t) + 2) + b;
        };
    }

}
