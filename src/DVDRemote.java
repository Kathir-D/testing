import java.util.Scanner;
public class DVDRemote implements RemoteControl,TVspecification{

    public void size() {
        System.out.println("DVD size is 24 inches");
    }

    public void color() {
        System.out.println("DVD color is white");
    }
    public int DVDVolume;
    // Implement the interface methods
    public void turnOn() {
        System.out.println("DVD player turned on");
    }

    public void turnOff() {
        System.out.println("DVD player turned off");
    }

    public void adjustVolume(int volumeLevel) {
        System.out.print("Enter the volume level: ");
        Scanner sc = new Scanner(System.in);
        DVDVolume = sc.nextInt();
        System.out.println("DVD volume adjusted to " + DVDVolume);
    }
}
/*
Design  interfaces named “TV_specifications,”RemoteControl” with methods for turning on, turning off
, and adjusting the volume of a device.
Implement classes for TVRemote, DVDRemote, and ACRemote, all of which implement the RemoteControl interface.
Allow the user to select a device and perform various operations on it.
You can also use multiple inheritance for it..
TVRemote implements TV_Specifications, Remotecontrol..
 */