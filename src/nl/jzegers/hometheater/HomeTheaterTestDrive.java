package nl.jzegers.hometheater;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        Screen screen = new Screen("Theater Screen");
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);

        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(amp, cd, dvd, popper, projector, screen, lights, tuner);

        homeTheater.watchMovie("Tomb Raider");
        homeTheater.endMovie();
    }
}
