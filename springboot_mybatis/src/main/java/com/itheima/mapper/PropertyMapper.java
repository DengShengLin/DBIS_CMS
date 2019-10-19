package com.itheima.mapper;

import com.itheima.pojo.Property;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PropertyMapper {

    int insert(@Param("pojo") Property pojo);

    int insertList(@Param("pojos") List<Property> pojo);

    List<Property> select(@Param("pojo") Property pojo);

    int update(@Param("pojo") Property pojo);

    int delete(@Param("pojo") Property pojo);
}
