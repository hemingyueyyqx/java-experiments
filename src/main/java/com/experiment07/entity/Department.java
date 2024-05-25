package com.experiment07.entity;

import java.util.LinkedList;
import java.util.List;

public class Department {
   private static List<Ticket> tickets = create();

   private static List<Ticket> create() {
       List<Ticket> tickets = new LinkedList<>();
       for (int i = 0; i < 200; i++) {
           tickets.add(new Ticket(i + 1, "哈尔滨", "北京"));

       }
       return tickets;
   }
   public static synchronized Ticket getTicket() {
       Ticket ticket = null;
       if(tickets.size() > 0) {
           ticket = tickets.remove(0);
       }
       return ticket;
   }
}
