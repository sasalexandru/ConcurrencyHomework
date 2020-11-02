package org.example;

public class App {
    public static void main(String[] args) throws InterruptedException {
        FestivalGate fg = new FestivalGate();
        FestivalAttendeeThread fat = new FestivalAttendeeThread(fg);
        FestivalStatisticsThread festivalStatisticsThread = new FestivalStatisticsThread(fg);
        festivalStatisticsThread.start();
        fat.start();

//        fat.join();
//        fg.showInfo();
    }

}
