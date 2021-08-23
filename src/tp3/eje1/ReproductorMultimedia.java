package tp3.eje1;

public class ReproductorMultimedia implements VideoClip {


    @Override
    public void play() {
        System.out.println("Play reproductor multimedia");
    }

    @Override
    public void bucle() {
        System.out.println("Buble reproductor multimedia");
    }

    @Override
    public void stop() {
        System.out.println("Stop reproductor multimedia");
    }
}
