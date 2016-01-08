# jEasings

jEasings is an api for calculating tweening values in animations. It requires Java 8.

## Usage

Start by accessing the Factory instance. From there, you can access different easing types which can ease in, out and in-out.

```java
// get the factory instance
Easings easings = EasingsFactory.getInstance();
// get the type. Others are available.
EasingType quad = easings.quadratic();
// the in easing. There is also out and inOut.
Easing in = quad.in();

double duration; // the time the tween will take
double time; // the current time - animation start
double location; // original location
double change; // the amount to move

double eased = in.ease(time, location, change, duration);
```

## Available Types:
- Linear
- Quadratic
- Cubic
- Quartic
- Quintic
- Sinusoidal
- Circular