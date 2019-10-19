package com.itheima;

import com.itheima.mapper.PropertyMapper;
import com.itheima.mapper.RecordRepairMapper;
import com.itheima.pojo.Property;
import com.itheima.pojo.RecordRepair;
import com.itheima.service.PropertyService;
import com.itheima.service.RecordRepairService;
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
public class RecordRepairTest {

    @Autowired
    private RecordRepairMapper recordRepairMapper;

    @Autowired
    private RecordRepairService recordRepairService;

    private List<RecordRepair> list = new ArrayList<RecordRepair> ();
    private RecordRepair recordRepair = new RecordRepair();
    /*
     * TODO 测试查询全部
     */
    @Test
    public void testselect(){

        List<RecordRepair> list = recordRepairService.select(recordRepair);

        for (RecordRepair r : list) {
            System.out.println(r);
        }
    }

    /**
     * TODO 测试查询插入
     *
     */
    @Test
    public void testinsert(){
        recordRepair.setId(3);
        recordRepair.setRecordId(3);
        recordRepair.setRepairCost(100.0);
        int i = recordRepairService.insert(recordRepair);

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
//        RecordRepair recordRepair = new RecordRepair();
        recordRepair.setId(4);
        recordRepair.setRecordId(4);
        list.add(recordRepair);
        RecordRepair recordRepair1 = new RecordRepair();
        recordRepair1.setId(5);
        recordRepair1.setRecordId(5);
        list.add(recordRepair1);
//       返回插入条数
        int i = recordRepairService.insertList(list);

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
        recordRepair.setId(5);
        recordRepair.setRepairCost(200.00);

        int i = recordRepairService.update(recordRepair);
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
        recordRepair.setId(5);
        recordRepair.setRecordId(5);
        recordRepair.setRepairCost(200);
        int i = recordRepairService.delete(recordRepair);
        if(i > 0){
            System.out.println("OK");
        }
    }
}
