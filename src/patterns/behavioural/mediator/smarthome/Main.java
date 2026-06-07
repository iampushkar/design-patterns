package patterns.behavioural.mediator.smarthome;

import patterns.behavioural.mediator.smarthome.colleagues.Alarm;
import patterns.behavioural.mediator.smarthome.colleagues.Light;
import patterns.behavioural.mediator.smarthome.colleagues.Sprinkler;
import patterns.behavioural.mediator.smarthome.colleagues.Thermostat;
import patterns.behavioural.mediator.smarthome.mediator.ISmartHomeMediator;
import patterns.behavioural.mediator.smarthome.mediator.SmartHomeMediator;

public class Main {
    public static void main(String[] args) {
        ISmartHomeMediator mediator =  new SmartHomeMediator();
        Light light = new Light(mediator);
        Thermostat thermostat = new Thermostat(mediator);
        Sprinkler sprinkler = new Sprinkler(mediator);
        Alarm alarm = new Alarm(mediator);

        mediator.registerDevice(light);
        mediator.registerDevice(thermostat);
        mediator.registerDevice(sprinkler);
        mediator.registerDevice(alarm);

        System.out.println("Thermostat - Temperature Changes");
        thermostat.updateState();

        System.out.println("Alarm - Triggered");
        alarm.updateState();
    }
}
