import java.util.Scanner;

import javax.sound.midi.MidiChannel;

public class vehicle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int v=in.nextInt();
        int w=in.nextInt();
        int TW=((v*4)-w)/2;
        System.out.println("TW = "+TW+"\n"+"FW = "+(v-TW));
    }
}
