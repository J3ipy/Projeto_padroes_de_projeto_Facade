import com.cinetech.facade.EnhancedHomeTheaterFacade;
import com.cinetech.subsystem.components.*;
import com.cinetech.utils.Logger;

public class AdvancedHomeTheaterApp {

    public static void main(String[] args) {
        Logger.info("Iniciando a montagem do sistema de Home Theater...");

        EnhancedHomeTheaterFacade homeTheater = new EnhancedHomeTheaterFacade.Builder()
                .withAudioPlayer(new DefaultAudioPlayer())
                .withLights(new DefaultLights())
                .withPopcornMachine(new DefaultPopcornMachine())
                .withProjector(new DefaultProjector())
                .withScreen(new DefaultTheatreScreen())
                .withSoundSystem(new DefaultSoundSystem())
                .withSubtitleService(new DefaultSubtitleService())
                .withVideoPlayer(new DefaultVideoPlayer())
                .build();
        
        Logger.info("Sistema montado. Iniciando operações.");
        
        homeTheater.watchMovie("Design Patterns: A Vingança do Código Limpo", "Trilha Sonora Refatorada");
        homeTheater.endMovie();

        System.out.println("\n------------------------------------------------\n");

        homeTheater.listenToMusic("The Sound of Silence (by Simon & Garfunkel)");
        homeTheater.endMusic();
    }
}
