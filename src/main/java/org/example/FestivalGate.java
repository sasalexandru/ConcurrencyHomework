package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class FestivalGate {
    private int full, fullVip, freePass, oneDay, oneDayVip;
    private int persons;
    private Queue<TicketType> queue = new LinkedList<>();

    public void showInfo() {
        countTickets();
        setPersons(queue.size());
        System.out.println(getPersons() + " persons entered the festival " + '\n' +
                getFull() + " people have full tickets" + '\n' +
                getFreePass() + " have free passes" + '\n' +
                getFullVip() + " have full VIP passes" + '\n' +
                getOneDay() + " have one day passes" + '\n' +
                getOneDayVip() + " have one day VIP passes" + '\n');


    }

    public void addTickets(TicketType ticketType) {
        queue.add(ticketType);
    }

    public void resetTickets() {
        setFull(0);
        setFullVip(0);
        setFreePass(0);
        setOneDay(0);
        setOneDayVip(0);
    }
    public void countTickets(){
        resetTickets();
        for(TicketType ticketType: queue){
            switch(ticketType) {
                case FULL:
                    full++;
                    break;
                case FULL_VIP:
                    fullVip++;
                    break;
                case FREE_PASS:
                    freePass++;
                    break;
                case ONE_DAY:
                    oneDay++;
                    break;
                case ONE_DAY_VIP:
                    oneDayVip++;
                    break;
            }
        }
    }

    public int getFull() {
        return full;
    }

    public void setFull(int full) {
        this.full = full;
    }

    public int getFullVip() {
        return fullVip;
    }

    public void setFullVip(int fullVip) {
        this.fullVip = fullVip;
    }

    public int getFreePass() {
        return freePass;
    }

    public void setFreePass(int freePass) {
        this.freePass = freePass;
    }

    public int getOneDay() {
        return oneDay;
    }

    public void setOneDay(int oneDay) {
        this.oneDay = oneDay;
    }

    public int getOneDayVip() {
        return oneDayVip;
    }

    public void setOneDayVip(int oneDayVip) {
        this.oneDayVip = oneDayVip;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public Queue<TicketType> getQueue() {
        return queue;
    }

    public void setQueue(Queue<TicketType> queue) {
        this.queue = queue;
    }
}
