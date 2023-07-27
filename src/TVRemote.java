import java.util.Scanner;
public class TVRemote implements RemoteControl, TVspecification {

    public void size() {
        System.out.println("TV size is 32 inches");
    }

    public void color() {
        System.out.println("TV color is black");
    }

    public int TVVolume;

    // Implement the interface methods
    public void turnOn() {
        System.out.println("TV turned on");
    }

    public void turnOff() {
        System.out.println("TV turned off");
    }


    public void adjustVolume(int volumeLevel) {
        System.out.print("Enter the volume level: ");
        Scanner sc = new Scanner(System.in);
        TVVolume = sc.nextInt();
        System.out.println("TV volume adjusted to " + TVVolume);
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