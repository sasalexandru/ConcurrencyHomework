package org.example;

import java.util.Random;

public enum TicketType {
    FULL, FULL_VIP, FREE_PASS, ONE_DAY, ONE_DAY_VIP;

    private static final TicketType[] TYPES = values();
    private static final int SIZE = TYPES.length;
    private static final Random RANDOM = new Random();

    public static TicketType getRandomTicket() {
        return TYPES[RANDOM.nextInt(SIZE)];
    }

}
