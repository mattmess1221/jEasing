package mnm.jeasing.types;

import mnm.jeasing.Easing;
import mnm.jeasing.EasingType;

public class Circular implements EasingType {

    @Override
    public Easing in() {
        return (t, b, c, d) -> {
            t /= d;
            return -c * (Math.sqrt(1 - t * t) - 1) + b;
        };
    }

    @Override
    public Easing out() {
        return (t, b, c, d) -> {
            t /= d;
            t--;
            return c * Math.sqrt(1 - t * t) + b;
        };
    }

    @Override
    public Easing inOut() {
        return (t, b, c, d) -> {
            t /= d / 2;
            if (t < 1)
                return -c / 2 * (Math.sqrt(1 - t * t) - 1) + b;
            return c / 2 * (Math.sqrt(1 - t * t) + 1) + b;
        };
    }

}
