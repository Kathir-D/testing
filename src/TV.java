//i need to fix
//it broken
import java.util.*;
public class TV {

    double channel;
    int volumeLevel;
    boolean isON;

    public TV(boolean isON, int volumeLevel, double channel) {
        this.isON = isON;
        this.volumeLevel = volumeLevel;
        this.channel = channel;
    }

    //setChannel isnt working (could be from it value being defined in perenthesis)
    public void setChannel() {
        System.out.println("Set channel to a number between 1 and 120");
        Scanner sc = new Scanner(System.in);
        channel = sc.nextDouble();
    }

    public void ChannelUP() {
        channel++;
    }

    public void ChannelDown() {
        channel--;
    }

    public double getChannel() {
        return channel;
    }

    //setVolumeLevel isnt working (could be from it value being defined in perenthesis)
    public void setVolumeLevel() {
        System.out.println("Set channel to a number between 1 and 120");
        Scanner sc = new Scanner(System.in);
        volumeLevel = sc.nextInt();
    }

    public void VolumeUp() {
        volumeLevel++;
    }

    public void VolumeDown() {
        volumeLevel--;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void turnON() {
        isON = true;
    }

    public void turnOFF() {
        isON = false;
    }

    public boolean isTVON() {
        return isON;
    }





    public static void main(String[] args){
        TV tv1 = new TV(true,3,111); // set initial values
        TV tv2 = new TV(true,3,83);  // for tv2

        System.out.println("tv1 channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel + " and power status is " + tv1.isTVON());
        System.out.println("tv2 channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel + " and power status is " + tv2.isTVON());

        tv2.turnOFF();
        tv1.VolumeDown();

        System.out.println("tv1 channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel + " and power status is " + tv1.isTVON());
        System.out.println("tv2 channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel + " and power status is " + tv2.isTVON());

    }
}



/*
class SimpleCircle{
    double radius;

    SimpleCircle(){
        radius = 1;
    }
    SimpleCircle(double newRadius){
        radius = newRadius;
    }
    double getArea(){
        return 2 * radius * Math.PI;
    }
}
 */