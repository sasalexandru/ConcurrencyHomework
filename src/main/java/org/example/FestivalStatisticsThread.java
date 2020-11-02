package org.example;

public class FestivalStatisticsThread extends Thread {
    FestivalGate festivalGate ;

    public FestivalStatisticsThread(FestivalGate festivalGate) {
        this.festivalGate = festivalGate;
        setDaemon(true);
    }

    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(5000);
                if(!festivalGate.getQueue().isEmpty()){
                    festivalGate.showInfo();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
