package nl.jzegers.hometheater;

public class HomeTheaterFacade {
    Amplifier amp;
    CdPlayer cd;
    DvdPlayer dvd;
    PopcornPopper popper;
    Projector projector;
    Screen screen;
    TheaterLights lights;
    Tuner tuner;

    public HomeTheaterFacade(Amplifier amp,
                             CdPlayer cd,
                             DvdPlayer dvd,
                             PopcornPopper popper,
                             Projector projector,
                             Screen screen,
                             TheaterLights lights,
                             Tuner tuner) {

        this.amp = amp;
        this.cd = cd;
        this.dvd = dvd;
        this.popper = popper;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.tuner = tuner;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

    public void listenToCd(String cdTitle) {
        System.out.println("Get ready for an audiophile experience...");
        lights.on();
        amp.on();
        amp.setCd(cd);
        amp.setStereoSound();
        amp.setVolume(5);
        cd.on();
        cd.play(cdTitle);
    }

    public void endCd() {
        System.out.println("Shutting down CD...");
        amp.off();
        amp.setCd(cd);
        cd.eject();
        cd.off();
    }

    public void listenToRadio(double frequency) {
        System.out.println("Tuning in the airwaves...");
        tuner.on();
        tuner.setFrequency(frequency);
        amp.on();
        amp.setTuner(tuner);
        amp.setVolume(5);
    }

    public void endRadio() {
        System.out.println("Shutting down the tuner...");
        tuner.off();
        amp.off();
    }
}
