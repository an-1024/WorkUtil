package com.anzhi.utilsdemo.worktest;

import cn.hutool.core.bean.BeanUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OutputObject {
    private static final long serialVersionUID = -3079721020471426577L;
    private String busiCode;
    private String opId;
    private String phone;
    private String returnCode;
    private String returnMessage;
    private Map<String, Object> bean = new HashMap<String, Object>();
    private List<Map<String, Object>> beans = new ArrayList<Map<String, Object>>();
    private Object object;
    /** 无参构造器 **/
    public OutputObject() {
    }

    /** 构造器 **/
    public OutputObject(String returnCode) {
        this.setReturnCode(returnCode);
    }

    /** 构造器 **/
    public OutputObject(String returnCode, String returnMessage) {
        this.setReturnCode(returnCode);
        this.setReturnMessage(returnMessage);
    }

    public String getBusiCode() {
        return busiCode;
    }

    public void setBusiCode(String busiCode) {
        this.busiCode = busiCode;
    }

    public String getOpId() {
        return opId;
    }

    public void setOpId(String opId) {
        this.opId = opId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    public Map<String, Object> getBean() {
        return bean;
    }

    public void setBean(Map<String, Object> bean) {
        this.bean = bean;
    }

    public List<Map<String, Object>> getBeans() {
        return beans;
    }

    public void setBeans(List<Map<String, Object>> beans) {
        this.beans = beans;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }


    /**
     * 往bean属性中放入键值对
     *
     * @param key
     * @param toKey
     * @param value
     */
    public void addBean(String key, String toKey, String value) {
        if (BeanUtil.isNotEmpty(toKey)) {
            bean.put(toKey, String.valueOf(value));
        } else {
            bean.put(key, String.valueOf(value));
        }
    }

    /**
     * 往beans中的index处的Map中放入键值对
     *
     * @param key
     * @param toKey
     * @param index
     * @param value
     */
    public void addBeans(String key, String toKey, int index,
                         String value) {
        if (beans.size() <= index) {
            beans.add(new HashMap<String, Object>());
        }
        if (BeanUtil.isNotEmpty(toKey)) {
            beans.get(index).put(toKey, value);
        } else {
            beans.get(index).put(key, value);
        }
    }
}
