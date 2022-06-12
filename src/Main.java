import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
       Scanner s =new Scanner(System.in);
        File file = new File("neffex.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = " ";

        while (!response.equals("q")) {
            System.out.print("p= play , s=Stop, r=reset, q=quit");
            System.out.println("\n-------------------------------------");
            System.out.print("\nEnter your choice: ");
            response = s.next();

            switch(response){
                case("p") : clip.start();
                break;
                case ("s") : clip.stop();
                break;
                case ("r") : clip.setMicrosecondPosition(0);
                break;
                case ("q") : clip.close();
                break;
                default:
                    System.out.println("Not a valid response ! ");
            }
        }
        System.out.println("Byeeee!! ");
    }
}
