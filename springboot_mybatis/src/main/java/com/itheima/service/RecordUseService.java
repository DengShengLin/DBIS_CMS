package com.itheima.service;

import com.itheima.mapper.RecordUseMapper;
import com.itheima.pojo.RecordUse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecordUseService {

    @Resource
    private RecordUseMapper recordUseMapper;

    public int insert(RecordUse pojo){
        return recordUseMapper.insert(pojo);
    }

    public int insertList(List<RecordUse> pojos){
        return recordUseMapper.insertList(pojos);
    }

    public List<RecordUse> select(RecordUse pojo){
        return recordUseMapper.select(pojo);
    }

    public int update(RecordUse pojo){
        return recordUseMapper.update(pojo);
    }
    public int delete(RecordUse pojo){
        return recordUseMapper.delete(pojo);
    }

}
