interface RemoteControl {
    void turnOn();
    void turnOff();
    void adjustVolume(int volumeLevel);
}


/*
Design  interfaces named “TV_specifications,”RemoteControl” with methods for turning on, turning off
, and adjusting the volume of a device.
Implement classes for TVRemote, DVDRemote, and ACRemote, all of which implement the RemoteControl interface.
Allow the user to select a device and perform various operations on it.
You can also use multiple inheritance for it..
TVRemote implements TV_Specifications, Remotecontrol..
 */