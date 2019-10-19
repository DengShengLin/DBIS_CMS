package com.itheima.mapper;

import com.itheima.pojo.RecordUse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RecordUseMapper {

    int insert(@Param("pojo") RecordUse pojo);

    int insertList(@Param("pojos") List<RecordUse> pojo);

    List<RecordUse> select(@Param("pojo") RecordUse pojo);

    int update(@Param("pojo") RecordUse pojo);

    int delete(@Param("pojo") RecordUse pojo);

}
