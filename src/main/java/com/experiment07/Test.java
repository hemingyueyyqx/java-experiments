package com.experiment07;

import com.experiment07.entity.TicketOffice;

import java.util.concurrent.CountDownLatch;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        TicketOffice ticketOffice1 = new TicketOffice("哈站");
        TicketOffice ticketOffice2 = new TicketOffice("哈西站");
        TicketOffice ticketOffice3 = new TicketOffice("哈东站");
        int count = 600;
        CountDownLatch latch = new CountDownLatch(count);
        for (int i = 0; i < 600 / 3; i++) {
            new Thread(() -> {
                ticketOffice1.sell();
                latch.countDown();
            }).start();
        }
        for (int i = 0; i < 600 / 3; i++) {
            new Thread(() -> {
                ticketOffice2.sell();
                latch.countDown();
            }).start();
        }
        for (int i = 0; i < 600 / 3; i++) {
            new Thread(() -> {
                ticketOffice3.sell();
                latch.countDown();
            }).start();
        }
        latch.await();
        System.out.println(ticketOffice1.getCount());
        System.out.println(ticketOffice2.getCount());
        System.out.println(ticketOffice3.getCount());
    }
}

