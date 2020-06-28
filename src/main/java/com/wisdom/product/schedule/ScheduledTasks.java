package com.wisdom.product.schedule;

import com.wisdom.product.service.ScheService;
import com.wisdom.product.vo.sqlserver.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Administrator
 */
@Component
@Configurable
@EnableScheduling
public class ScheduledTasks {
    @Autowired
    private ScheService scheService;

    /**
     *每分钟执行一次
     */
    @Scheduled(cron = "0/1 * * * * * ")
    public void cdata(){
        List<Worker> workers = scheService.queryWorker();
        for (int i = 0; i < workers.size(); i++) {
            System.out.println(workers.get(0).getOperationname());
        }
        System.out.println("test");
    }
}
