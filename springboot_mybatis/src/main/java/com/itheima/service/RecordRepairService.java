package com.itheima.service;

import com.itheima.mapper.RecordRepairMapper;
import com.itheima.pojo.RecordRepair;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecordRepairService {

    @Resource
    private RecordRepairMapper recordRepairMapper;

    public int insert(RecordRepair pojo){
        return recordRepairMapper.insert(pojo);
    }

    public int insertList(List<RecordRepair> pojos){
        return recordRepairMapper.insertList(pojos);
    }

    public List<RecordRepair> select(RecordRepair pojo){
        return recordRepairMapper.select(pojo);
    }

    public int update(RecordRepair pojo){

        return recordRepairMapper.update(pojo);
    }
    public int delete(RecordRepair pojo){
        return recordRepairMapper.delete(pojo);
    }

}
