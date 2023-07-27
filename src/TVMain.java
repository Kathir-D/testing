import java.util.Scanner;
public class TVMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter the device you want to use: TV, DVD, ACR, or quit: ");
            choice = sc.nextLine().toUpperCase();
            switch (choice) {
                case "TV":
                    TVRemote device = null;
                    device = new TVRemote();
                    device.turnOn();
                    device.adjustVolume(70);
                    device.color();
                    device.size();
                    int choice1;
                    do {
                        System.out.println("Do you want to change volume again or turn off the TV? ");
                        System.out.println("Enter 1 to change volume again or 2 to turn off the TV: ");
                        choice1 = sc.nextInt();
                        switch (choice1){
                            case 1:
                                device.adjustVolume(70);
                                break;
                            case 2:
                                device.turnOff();
                                break;
                            default:
                                System.out.println("Invalid choice");
                                return;
                        }
                    }while (choice1 != 2);
                    break;
                case "DVD":
                    DVDRemote device1 = null;
                    device1 = new DVDRemote();
                    device1.turnOn();
                    device1.adjustVolume(70);
                    int choice2;
                    do {
                        System.out.println("Do you want to change volume again or turn off the DVD? ");
                        System.out.println("Enter 1 to change volume again or 2 to turn off the DVD: ");
                        choice2 = sc.nextInt();
                        switch (choice2){
                            case 1:
                                device1.adjustVolume(70);
                                break;
                            case 2:
                                device1.turnOff();
                                break;
                            default:
                                System.out.println("Invalid choice");
                                return;
                        }
                    }while (choice2 != 2);
                    break;
                case "ACR":
                    ACRemote device2 = null;
                    device2 = new ACRemote();
                    device2.turnOn();
                    device2.adjustVolume(70);
                    int choice3;
                    do {
                        System.out.println("Do you want to change volume again or turn off the ACR? ");
                        System.out.println("Enter 1 to change volume again or 2 to turn off the ACR: ");
                        choice3 = sc.nextInt();
                        switch (choice3){
                            case 1:
                                device2.adjustVolume(70);
                                break;
                            case 2:
                                device2.turnOff();
                                break;
                            default:
                                System.out.println("Invalid choice");
                                return;
                        }
                    }while (choice3 != 2);
                    break;
                case "QUIT":
                    System.out.println("Quiting....");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }while (choice != "QUIT") ;

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