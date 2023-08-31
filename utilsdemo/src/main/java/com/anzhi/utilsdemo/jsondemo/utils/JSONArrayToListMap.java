package com.anzhi.utilsdemo.jsondemo.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Map;

public class JSONArrayToListMap {
    /**
     * 将JSON数组转换为List<Map>
     * @param json JSON数组字符串
     * @return List<Map>
     * @throws Exception
     */
    public static List<Map<String, Object>> jsonArrayToList(String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, new TypeReference<List<Map<String, Object>>>() {});
    }
}
