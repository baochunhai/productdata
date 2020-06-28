package com.wisdom.product.service.impl;

import com.wisdom.product.dao.sqlserver.WorkerMapper;
import com.wisdom.product.service.ScheService;
import com.wisdom.product.vo.sqlserver.Worker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheServiceImpl implements ScheService {
    private static Logger logger = LoggerFactory.getLogger(ScheServiceImpl.class);
    @Autowired
    private WorkerMapper workerMapper;

    @Override
    public void createMps() {

    }

    @Override
    public void newsensordata() {

    }

    @Override
    public List<Worker> queryWorker() {
        List<Worker> worker = workerMapper.getWorker();
        return worker;
    }

}
