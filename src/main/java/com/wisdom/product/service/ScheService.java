package com.wisdom.product.service;

import com.wisdom.product.vo.sqlserver.Worker;

import java.util.List;

public interface ScheService {
    void createMps();

    void newsensordata();

    List<Worker> queryWorker();
}
