package com.wisdom.product.dao.sqlserver;

import com.wisdom.product.vo.sqlserver.Worker;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WorkerMapper {
    List<Worker> getWorker();
}
