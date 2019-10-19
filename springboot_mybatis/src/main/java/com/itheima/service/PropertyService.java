package com.itheima.service;

import com.itheima.mapper.PropertyMapper;
import com.itheima.pojo.Property;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PropertyService {

    @Resource
    private PropertyMapper propertyMapper;

    public int insert(Property pojo){
        return propertyMapper.insert(pojo);
    }

    public int insertList(List<Property> pojos){
        return propertyMapper.insertList(pojos);
    }

    public List<Property> select(Property pojo){
        return propertyMapper.select(pojo);
    }

    public int update(Property pojo){
        return propertyMapper.update(pojo);
    }

    public int delete(Property pojo){
        return propertyMapper.delete(pojo);
    }
}
