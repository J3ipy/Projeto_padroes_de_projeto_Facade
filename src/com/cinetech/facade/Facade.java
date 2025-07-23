package com.cinetech.facade;

import com.cinetech.subsystem.components.*;
import com.cinetech.subsystem.interfaces.*;
import com.cinetech.utils.*;

public class Facade {

    private final IAudioPlayer audioPlayer;
    private final ILights lights;
    private final IPopcornMachine popcornMachine;
    private final IProjector projector;
    private final ISoundSystem soundSystem;
    private final ISubtitleService subtitleService;
    private final ITheatreScreen screen;
    private final IVideoPlayer videoPlayer;

    private Facade(Builder builder) {
        this.audioPlayer = builder.audioPlayer;
        this.lights = builder.lights;
        this.popcornMachine = builder.popcornMachine;
        this.projector = builder.projector;
        this.soundSystem = builder.soundSystem;
        this.subtitleService = builder.subtitleService;
        this.screen = builder.screen;
        this.videoPlayer = builder.videoPlayer;
    }

    public void watchMovie(String movieName, String audioTrack) {
        Logger.info("### Preparando para assistir ao filme... ###");
        popcornMachine.turnOn();
        popcornMachine.makePopcorn();
        lights.setLevel(LightLevel.DIM);
        screen.down();
        projector.turnOn();
        projector.setInput("Player de Vídeo");
        soundSystem.turnOn();
        soundSystem.setMode(AudioMode.SURROUND);
        audioPlayer.setVolume(8);
        videoPlayer.load(movieName);
        audioPlayer.load(audioTrack);
        subtitleService.load(movieName);
        subtitleService.enable();
        videoPlayer.play();
        audioPlayer.play();
        Logger.info("### Filme em reprodução. Aproveite! ###");
    }

    public void endMovie() {
        Logger.info("### Finalizando a sessão do filme... ###");
        subtitleService.disable();
        videoPlayer.stop();
        audioPlayer.stop();
        soundSystem.turnOff();
        projector.turnOff();
        screen.up();
        lights.setLevel(LightLevel.BRIGHT);
        popcornMachine.turnOff();
        Logger.info("### Home Theater desligado. ###");
    }

    public void listenToMusic(String musicTrack) {
        Logger.info("### Preparando para ouvir música... ###");
        lights.setLevel(LightLevel.AMBIENT);
        soundSystem.turnOn();
        soundSystem.setMode(AudioMode.STEREO);
        audioPlayer.setVolume(6);
        audioPlayer.load(musicTrack);
        audioPlayer.play();
        Logger.info("### Música tocando. ###");
    }

    public void endMusic() {
        Logger.info("### Finalizando a sessão de música... ###");
        audioPlayer.stop();
        soundSystem.turnOff();
        lights.setLevel(LightLevel.BRIGHT);
        Logger.info("### Sistema de música desligado. ###");
    }

    // --- Builder Interno ---
    public static class Builder {
        private IAudioPlayer audioPlayer;
        private ILights lights;
        private IPopcornMachine popcornMachine;
        private IProjector projector;
        private ISoundSystem soundSystem;
        private ISubtitleService subtitleService;
        private ITheatreScreen screen;
        private IVideoPlayer videoPlayer;

        public Builder withAudioPlayer(IAudioPlayer audioPlayer) { this.audioPlayer = audioPlayer; return this; }
        public Builder withLights(ILights lights) { this.lights = lights; return this; }
        public Builder withPopcornMachine(IPopcornMachine popcornMachine) { this.popcornMachine = popcornMachine; return this; }
        public Builder withProjector(IProjector projector) { this.projector = projector; return this; }
        public Builder withSoundSystem(ISoundSystem soundSystem) { this.soundSystem = soundSystem; return this; }
        public Builder withSubtitleService(ISubtitleService subtitleService) { this.subtitleService = subtitleService; return this; }
        public Builder withScreen(ITheatreScreen screen) { this.screen = screen; return this; }
        public Builder withVideoPlayer(IVideoPlayer videoPlayer) { this.videoPlayer = videoPlayer; return this; }

        public Facade build() {
            // Se algum componente não for injetado, usa uma implementação padrão.
            if (audioPlayer == null) audioPlayer = new DefaultAudioPlayer();
            if (lights == null) lights = new DefaultLights();
            if (popcornMachine == null) popcornMachine = new DefaultPopcornMachine();
            if (projector == null) projector = new DefaultProjector();
            if (soundSystem == null) soundSystem = new DefaultSoundSystem();
            if (subtitleService == null) subtitleService = new DefaultSubtitleService();
            if (screen == null) screen = new DefaultTheatreScreen();
            if (videoPlayer == null) videoPlayer = new DefaultVideoPlayer();
            
            return new Facade(this);
        }
    }
}