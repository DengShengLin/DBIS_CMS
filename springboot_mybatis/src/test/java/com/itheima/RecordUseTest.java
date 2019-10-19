package com.itheima;

import com.itheima.mapper.RecordRepairMapper;
import com.itheima.mapper.RecordUseMapper;
import com.itheima.pojo.RecordRepair;
import com.itheima.pojo.RecordUse;
import com.itheima.service.RecordRepairService;
import com.itheima.service.RecordUseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dsl
 * @date 2019/10/13 16:02
 * @description
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class RecordUseTest {

    @Autowired
    private RecordUseMapper recordUseMapper;

    @Autowired
    private RecordUseService recordUseService;

    private List<RecordUse> list = new ArrayList<RecordUse> ();
    private RecordUse recordUse = new RecordUse();
    /*
     * TODO 测试查询全部
     */
    @Test
    public void testselect(){

        List<RecordUse> list = recordUseService.select(recordUse);

        for (RecordUse r : list) {
            System.out.println(r);
        }
    }

    /**
     * TODO 测试查询插入
     *
     */
    @Test
    public void testinsert(){
        recordUse.setId(2);
        recordUse.setRecordGrantUserId(1);
        recordUse.setRecordUserId(2);
        int i = recordUseService.insert(recordUse);

        if(i > 0){
            System.out.println("OK");
        }
    }

    /**
     * TODO 测试查询插入多条
     *
     */
    @Test
    public void testinsertList() {
        recordUse.setId(3);
        recordUse.setRecordPropertyId(2);
        recordUse.setRecordGrantUserId(1);
        recordUse.setRecordUserId(3);
        list.add(recordUse);
        RecordUse recordUse1 = new RecordUse();
        recordUse1.setId(4);
        recordUse1.setRecordPropertyId(2);
        recordUse1.setRecordGrantUserId(2);
        recordUse1.setRecordUserId(3);
        list.add(recordUse1);
//       返回插入条数
        int i = recordUseService.insertList(list);

        if(i > 0){
            System.out.println(i + ",OK");
        }

    }

    /**
     * TODO 测试更新
     *
     */
    @Test
    public void testupdate(){
        recordUse.setId(4);
        recordUse.setRecordPropertyId(1);
        int i = recordUseService.update(recordUse);
        if(i > 0) {
            System.out.println("OK");
        }
    }


    /**
     * TODO 测试删除
     *
     */
    @Test
    public void testudelete() {
        recordUse.setId(4);
        recordUse.setRecordPropertyId(1);
        recordUse.setRecordUserId(3);
        int i = recordUseService.delete(recordUse);
        if(i > 0){
            System.out.println("OK");
        }
    }
}
