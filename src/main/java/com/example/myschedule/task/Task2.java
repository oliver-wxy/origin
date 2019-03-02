package com.example.myschedule.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author wxy
 * @create 2019-03-01 21:14
 **/
@Component
public class Task2 {
    private static final Logger log = LoggerFactory.getLogger(Task2.class);
    @Scheduled(fixedDelay = 5000)
    public void task1() {
        try {
            for (int i = 0; i < 10; i++) {
                log.info("task2-1:{}", i);

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Scheduled(fixedDelay = 5000)
    public void task2() {
        try {
            for (int i = 0; i < 10; i++) {
                log.info("task2-2:{}", i);

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
