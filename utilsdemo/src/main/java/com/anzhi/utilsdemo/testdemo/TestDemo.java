package com.anzhi.utilsdemo.testdemo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TestDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("0", "11", "22", "22", "33", "22", "23", "55"));
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if ("22".equals(iterator.next())) {
                iterator.remove(); // 正确方式
                // list.remove(iterator.next()); // 会导致ConcurrentModificationException异常
            }
        }
        System.out.println(list);
        
        String str = "{\n" +
                "    \"total\":2,\n" +
                "    \"rows\":[\n" +
                "        {\n" +
                "            \"channelId\":\"\",\n" +
                "            \"defaultServiceType\":\"10099客服\",\n" +
                "            \"emailAddress\":\"717833898@qq.com\",\n" +
                "            \"idCardNo\":\"410101200001011234\",\n" +
                "            \"insertTime\":1654512561000,\n" +
                "            \"isprincipal\":\"0\",\n" +
                "            \"mobilePhone\":\"19213854474\",\n" +
                "            \"orgaId\":\"2206071529580000002\",\n" +
                "            \"page\":0,\n" +
                "            \"postId\":\"\",\n" +
                "            \"proviceId\":\"371\",\n" +
                "            \"prsnChnlTypeCd\":\"\",\n" +
                "            \"staffId\":\"wangjun\",\n" +
                "            \"staffIdStatus\":\"01\",\n" +
                "            \"staffName\":\"王军\",\n" +
                "            \"staffState\":\"1\",\n" +
                "            \"start\":0,\n" +
                "            \"tenantId\":\"-1\",\n" +
                "            \"updaTetime\":1681266081000\n" +
                "        },\n" +
                "        {\n" +
                "            \"channelId\":\"00\",\n" +
                "            \"defaultServiceType\":\"呼叫\",\n" +
                "            \"emailAddress\":\"343434@qq.com\",\n" +
                "            \"idCardNo\":\"142702198601123456\",\n" +
                "            \"isprincipal\":\"0\",\n" +
                "            \"mobilePhone\":\"19203710571\",\n" +
                "            \"orgaId\":\"2211222138000000001\",\n" +
                "            \"page\":0,\n" +
                "            \"postId\":\"00\",\n" +
                "            \"proviceId\":\"371\",\n" +
                "            \"prsnChnlTypeCd\":\"00\",\n" +
                "            \"staffId\":\"zhanggq\",\n" +
                "            \"staffIdStatus\":\"01\",\n" +
                "            \"staffName\":\"zhanggq\",\n" +
                "            \"staffState\":\"1\",\n" +
                "            \"start\":0,\n" +
                "            \"tenantId\":\"-1\",\n" +
                "            \"updaTetime\":1684811670000\n" +
                "        }\n" +
                "    ]\n" +
                "}\n" +
                "\n";
        Map<String, Object> map = JSON.parseObject(str, new TypeReference<Map<String,Object>>(){});
        System.out.println(JSON.toJSONString(map));

        Map map1 = new HashMap();
        String s = (String)map.get("data");
        if (Objects.isNull(s) || s.equals("null")) {
            s = "";
            System.out.println("----------------------------");
        }
        System.out.println("----------------" + s.toString());
    }
}
