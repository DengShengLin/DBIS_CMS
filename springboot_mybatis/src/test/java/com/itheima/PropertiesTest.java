package com.itheima;
import	java.net.Authenticator;

import com.github.pagehelper.PageHelper;
import com.itheima.mapper.PropertyMapper;
import com.itheima.mapper.UserMapper;
import com.itheima.pojo.Property;
import com.itheima.pojo.User;
import com.itheima.service.PropertyService;
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
public class PropertiesTest {

    @Autowired
    private PropertyMapper propertyMapper;

    @Autowired
    private PropertyService propertyService;

    private List<Property> list = new ArrayList<Property> ();
    private Property property = new Property();
    /*
     * TODO 测试查询全部
     */
    @Test
    public void testselect(){

        List<Property> list = propertyService.select(property);

        for (Property p : list) {
            System.out.println(p);
        }
    }

    /**
     * TODO 测试查询插入
     *
     */
    @Test
    public void testinsert(){
        property.setId(3);
        property.setPropertyName("zhangsan");
//        property.setPropertyBrief("wujianjie");
        int i = propertyService.insert(property);

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
        Property prop = new Property();
        prop.setId(4);
        prop.setPropertyName("sadsa");
        list.add(prop);
        Property prop1 = new Property();
        prop1.setId(5);
        prop1.setPropertyName("sdffr");
        list.add(prop1);
//       返回插入条数
        int i = propertyService.insertList(list);

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
        property.setId(5);
        property.setPropertyName("第五个");

        int i = propertyService.update(property);
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
        property.setId(4);
        property.setPropertyName("sadsa");
        property.setPropertyBrief("fds");
        int i = propertyService.delete(property);
        if(i > 0){
            System.out.println("OK");
        }
    }
}
