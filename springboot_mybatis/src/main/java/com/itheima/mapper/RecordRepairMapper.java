package com.itheima.mapper;

import com.itheima.pojo.RecordRepair;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RecordRepairMapper {

    int insert(@Param("pojo") RecordRepair pojo);

    int insertList(@Param("pojos") List<RecordRepair> pojo);

    List<RecordRepair> select(@Param("pojo") RecordRepair pojo);

    int update(@Param("pojo") RecordRepair pojo);

    int delete(@Param("pojo") RecordRepair pojo);

}
