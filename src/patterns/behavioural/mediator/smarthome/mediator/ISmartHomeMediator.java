package patterns.behavioural.mediator.smarthome.mediator;

import patterns.behavioural.mediator.smarthome.colleagues.Device;

public interface ISmartHomeMediator {
    void registerDevice(Device device);
    void notifyDevice(Device sender);
}
