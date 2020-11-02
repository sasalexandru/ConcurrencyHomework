package org.example;

public class FestivalAttendeeThread extends Thread {
    private final FestivalGate festivalGate;
    private FestivalAttendee festivalAttendee = new FestivalAttendee();
    private int peopleAtFestival = 150;
    private int number;

    public FestivalAttendeeThread(FestivalGate festivalGate) {
        this.festivalGate = festivalGate;
    }

    @Override
    public void run() {
        synchronized (festivalGate) {

            for (int i = 1; i < peopleAtFestival; i++) {
                try{
                    Thread.sleep(500);
                    festivalAttendee = new FestivalAttendee();
                    festivalGate.addTickets(festivalAttendee.getTicketType());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                setNumber(getNumber()+1);
                System.out.println("Person --> " + getNumber() + " with: " + festivalAttendee.getTicketType());
            }
        }
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
