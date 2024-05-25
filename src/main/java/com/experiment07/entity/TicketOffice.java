package com.experiment07.entity;

import com.experiment07.entity.Department;
import com.experiment07.entity.Ticket;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TicketOffice {
    private String name;
    private List<Ticket> tickets = new LinkedList<>();
    private static Random random = new Random();

    public TicketOffice(String name) {
        this.name = name;
    }
    public synchronized Ticket sell() {

        Ticket ticket = null;
            try {
                Thread.sleep(random.nextInt(50));
                    ticket = Department.getTicket();
                    if (ticket != null) {
                        tickets.add(ticket);
                    }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        return ticket;

    }
    public int getCount() {
        return tickets.size();
    }
}
