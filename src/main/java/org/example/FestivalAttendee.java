package org.example;

public class FestivalAttendee {
    private TicketType ticket;

    public FestivalAttendee() {
        this.ticket = TicketType.getRandomTicket();
    }

    public TicketType getTicketType() {
        return ticket;
    }
}
