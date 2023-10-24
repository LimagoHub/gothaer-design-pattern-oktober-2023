package trafficlight;

public class OffState extends AbstractTrafficLightState{
    public OffState(final TrafficLight trafficLight) {
        super(trafficLight);
    }

    @Override
    public void switchOn() {
        getTrafficLight().current = getTrafficLight().redState;
    }
}
