package com.anzhi.utilsdemo.idgenerate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IdGenerateDemo {
    // 根据渠道code和子渠道code生成id
    public static String channelIdGenerate(String channelCode, String subChannelCode) {
        long id = (channelCode + subChannelCode).hashCode() & Long.MAX_VALUE;
        return String.valueOf(id);
    }
    
    // 根据 url 生成对应接口的id
    public static String plaInterfaceId (String url) {
        long id = url.hashCode() & Long.MAX_VALUE;
        return String.valueOf(id);
    }
    
    // 根据提供的接口服务类名和服务编码生成对应接口的id
    public static String outInterfaceId (String className, String outCode) {
        long id = (className + outCode).hashCode() & Long.MAX_VALUE;
        return String.valueOf(id);
    }

    public static void main(String[] args) {
        String channelId = IdGenerateDemo.channelIdGenerate("cmosanalyse", "bj_equity_order");
        log.info("id 为= {}", channelId);
    }
}
