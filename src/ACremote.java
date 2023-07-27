import java.util.Scanner;

class ACRemote implements RemoteControl, TVspecification {

    public void size() {
        System.out.println("TV size is 28 inches");
    }

    public void color() {
        System.out.println("TV color is gray");
    }
    public int ACRVolume;


    // Implement the interface methods
    public void turnOn() {
        System.out.println("ACR turned on");
    }

    public void turnOff() {
        System.out.println("ACR turned off");
    }

    public void adjustVolume(int volumeLevel) {
        System.out.print("Enter the volume level: ");
        Scanner sc = new Scanner(System.in);
        ACRVolume = sc.nextInt();
        System.out.println("ACR volume adjusted to " + ACRVolume);    }
}


/*
Design  interfaces named “TV_specifications,”RemoteControl” with methods for turning on, turning off
, and adjusting the volume of a device.
Implement classes for TVRemote, DVDRemote, and ACRemote, all of which implement the RemoteControl interface.
Allow the user to select a device and perform various operations on it.
You can also use multiple inheritance for it..
TVRemote implements TV_Specifications, Remotecontrol..
 */