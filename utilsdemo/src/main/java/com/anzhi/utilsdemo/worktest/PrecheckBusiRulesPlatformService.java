package com.anzhi.utilsdemo.worktest;

import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import lombok.extern.slf4j.Slf4j;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Slf4j
public class PrecheckBusiRulesPlatformService {
    public static void main(String args[]) {
        OutputObject outObjPutBroads = new OutputObject();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\n" +
                "    \"rtnCode\": \"0\",\n" +
                "    \"rtnMsg\": \"成功!\",\n" +
                "    \"bean\": {},\n" +
                "    \"beans\": [],\n" +
                "    \"object\": {\n" +
                "        \"result\": {\n" +
                "            \"COMBINATION_OFFER_LIST\": [],\n" +
                "            \"IS_5G_MAIN\": \"1\",\n" +
                "            \"OFFER_INFO_LIST\": [\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"可视电话\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984121176\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040010108\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"移动云盘内蒙古入套专属权益包\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"移动云盘内蒙古入套专属权益包\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984121175\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"300000344941\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"高清语音视频通话功能\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"高清语音视频通话功能\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984121174\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101030550000\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"全家享套餐-99元—存量客户8折（12个月）\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"全家享套餐-99元—存量客户8折（12个月）\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984119147\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"300000356542\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"全家享资费-智能组网服务\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"全家享资费-智能组网服务\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984119149\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"300000341141\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");
        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"视频彩铃\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"BR20190428034\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984119148\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"300000223812\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"99元升档活动-10GB流量包\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"99元升档活动-10GB流量包\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984119146\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"300000404030\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");
        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"1\",\n" +
                "                        \"REMARKS\": \"全家享套餐-99元\",\n" +
                "                        \"CBOSS_EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"IS_BUNDLE\": \"1\",\n" +
                "                        \"OFFER_TYPE\": \"01\",\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"OFFER_NAME\": \"全家享套餐-99元\",\n" +
                "                        \"DESCRIPTION\": \"全家享套餐-99元档，入网首月套餐费及包含内容按日折算一次性收取及提供，次月开始，按照完整账期收取套餐费及提供套餐内容。套餐包含来电显示，500分钟国内通话分钟数（含国内高清视频通话），20GB国内流量。可办理最高300M宽带，包含OTT基础会员。套餐包含最高价值20元的OTT会员优惠券，可根据实际需求选择OTT会员产品或IPTV会员产品，超出优惠部分需额外收费（有效期为12个月，在协议期满前三个月内，如无异议，本协议自动顺延12个月）。超出部分国内通话0.15元/分钟，流量按照0.29元/M收取，累计到5元可免费用到1G，以此类推，短信0.1元/条，彩信0.3元/条。该套餐语音可共享不可滚存，流量可共享可滚存，套内包含2张共享卡共享权益。上述资费描述所述的国内均指国内(不含港澳台地区)。您办理套餐产品支持选择多项增值权益产品使用，请您到移动“手机营业厅-权益专区”领取，权益价值5-15元，使用期一年，到期自动顺延。如合约期内取消增值权益产品，需到营业厅办理取消并确认解除免费使用合约协议。（我公司承诺资费方案有效期为一年（双方有特殊约定的除外，并有权在有效期截止后修改资费方案。如需修改，我公司将在修改前两个月通知您，您可以选择修改后的资费方案或我公司提供的其他资费方案。如无需修改，则原资费方案顺延一年，顺延次数不限）\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984119145\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"OFFER_ID\": \"300000304744\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"BRAND\": \"1\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");
        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"4G-LTE\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"4G签约\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984121167\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101030540000\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"全家享99元档尊享权益\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"全家享99元档尊享权益\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984121166\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"300000305715\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");
        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"WLAN签约\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"WLAN签约\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984121168\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040000001\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"GPRS业务\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305025\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984121160\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040001018\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"国内漫游\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"国内漫游\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984121161\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040014008\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"全家享套餐—多终端共享帐前优惠20元\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"全家享套餐—多终端共享帐前优惠20元\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984121165\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"300000304752\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"国内直拨\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305001\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984121164\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040001001\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"呼叫保持\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305019\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984121163\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040001014\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"来电显示\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"来电显示\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984121162\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040016043\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");
        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"全家享套餐-99元-VPMN\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"全家享套餐-99元-VPMN\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984121172\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"300000304730\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"全家享套餐-99元-语音\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"全家享套餐-99元-语音\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984121171\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"300000304723\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"全家享套餐-99元促销\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"全家享套餐-99元促销\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984121173\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"300000304737\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"99元升档活动-10GB流量包（合约）\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"99元升档活动-10GB流量包（合约）\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984121182\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"300000422133\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"无条件转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305010\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984121181\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040001009\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"无应答转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305054\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984121180\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040001008\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"不可达转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305008\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984121179\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040001007\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"遇忙转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305007\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984121178\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040001006\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"关机呼转\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305023\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984121177\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040001017\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"呼叫等待\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305014\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984121170\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040001011\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"短消息服务\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305013\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984121169\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040001010\",\n" +
                "                        \"CREATE_DATE\": \"20230309103450\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"咪咕视频黄金会员-优惠\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984115324\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101430\",\n" +
                "                        \"OFFER_ID\": \"300000232565\",\n" +
                "                        \"CREATE_DATE\": \"20230309103521\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"REMARKS\": \"咪咕视频黄金会员包月6.9元\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"PRICE_PLAN_NAME\": \"6.9元/月\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"VALUE\": \"698040\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SP_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"VALUE\": \"69804040011001\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"OPERATOR_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"16\",\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"OFFER_NAME\": \"咪咕视频黄金会员包月6.9元\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984115325\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"OFFER_ID\": \"300000086920\",\n" +
                "                        \"DONE_DATE\": \"20230320101430\",\n" +
                "                        \"CREATE_DATE\": \"20230309103521\",\n" +
                "                        \"BRAND\": \"\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"尊享权益随心选2022版-20元A-促销\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"尊享权益随心选2022版-20元A-促销\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984115323\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101430\",\n" +
                "                        \"OFFER_ID\": \"300000359172\",\n" +
                "                        \"CREATE_DATE\": \"20230309103521\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"黑卡PLUS会员连续包月原子\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"黑卡PLUS会员连续包月原子\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984115322\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101430\",\n" +
                "                        \"OFFER_ID\": \"300000359113\",\n" +
                "                        \"CREATE_DATE\": \"20230309103521\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"20元权益组A\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"20元权益组A\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984115321\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101430\",\n" +
                "                        \"OFFER_ID\": \"300000359165\",\n" +
                "                        \"CREATE_DATE\": \"20230309103521\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"权益超市黄金会员\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"一级产商品同步数据\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984115320\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101430\",\n" +
                "                        \"OFFER_ID\": \"300000241363\",\n" +
                "                        \"CREATE_DATE\": \"20230309103521\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"尊享权益随心选2022版-20元A\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"尊享权益随心选2022版-20元A\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113984115319\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005858\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101430\",\n" +
                "                        \"OFFER_ID\": \"300000359179\",\n" +
                "                        \"CREATE_DATE\": \"20230309103521\",\n" +
                "                        \"IS_BUNDLE\": \"1\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"可视电话\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821497\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"101040010108\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");
        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"129元跨档活动-30GB流量包\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"129元跨档活动-30GB流量包\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821467\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"300000404035\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"1\",\n" +
                "                        \"REMARKS\": \"全家享套餐-129元\",\n" +
                "                        \"CBOSS_EXPIRE_DATE\": \"长期有效\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"IS_BUNDLE\": \"1\",\n" +
                "                        \"OFFER_TYPE\": \"01\",\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"OFFER_NAME\": \"全家享套餐-129元\",\n" +
                "                        \"DESCRIPTION\": \"全家享套餐-129元档，入网首月套餐费及包含内容按日折算一次性收取及提供，次月开始，按照完整账期收取套餐费及提供套餐内容。套餐包含来电显示，500分钟国内通话分钟数（含国内高清视频通话），30GB国内流量，100分钟国际长途语音。可办理最高600M宽带，包含OTT基础会员。套餐包含最高价值20元的OTT会员优惠券或20元的IPTV会员优惠券，可根据实际需求选择OTT会员产品或IPTV会员产品，超出优惠部分需额外收费（有效期为12个月，在协议期满前三个月内，如无异议，本协议自动顺延12个月）。超出部分国内通话0.15元/分钟，流量5元1G,满15元后按照3元1G进行计费依次类推。以此类推，短信0.1元/条，彩信0.3元/条。该套餐语音可共享不可滚存，流量可共享可滚存，套内包含2张共享卡共享权益。上述资费描述所述的国内均指国内(不含港澳台地区)。您办理套餐产品支持选择多项增值权益产品使用，请您到移动“手机营业厅-权益专区”领取，权益价值5-15元，使用期一年，到期自动顺延。如合约期内取消增值权益产品，需到营业厅办理取消并确认解除免费使用合约协议。（我公司承诺资费方案有效期为一年（双方有特殊约定的除外，并有权在有效期截止后修改资费方案。如需修改，我公司将在修改前两个月通知您，您可以选择修改后的资费方案或我公司提供的其他资费方案。如无需修改，则原资费方案顺延一年，顺延次数不限）\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821466\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"OFFER_ID\": \"300000304746\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"BRAND\": \"1\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"短消息服务\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305013\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821488\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"101040001010\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"WLAN签约\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"WLAN签约\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821487\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"101040000001\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"呼叫保持\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305019\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821484\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"101040001014\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"来电显示\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"来电显示\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821483\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"101040016043\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"国内漫游\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"国内漫游\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821482\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"101040014008\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"4G-LTE\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"4G签约\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821486\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"101030540000\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"国内直拨\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305001\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821485\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"101040001001\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"GPRS业务\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305025\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821481\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"101040001018\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"全家享资费-智能组网服务\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"全家享资费-智能组网服务\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821470\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"300000341141\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20240401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"全家享套餐-129元—存量客户8折（12个月）\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"全家享套餐-129元—存量客户8折（12个月）\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821468\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"300000356543\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20260401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"129元跨档活动-30GB流量包（合约）\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"129元跨档活动-30GB流量包（合约）\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989823553\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"300000422138\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"无条件转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305010\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989823552\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"101040001009\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"无应答转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305054\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989823551\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"101040001008\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"关机呼转\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305023\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821498\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"101040001017\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"移动云盘内蒙古入套专属权益包\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"移动云盘内蒙古入套专属权益包\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821496\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"300000344941\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"视频彩铃\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"BR20190428034\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821469\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"300000223812\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"全家享套餐—多终端共享帐前优惠20元\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"全家享套餐—多终端共享帐前优惠20元\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821495\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"300000304752\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"不可达转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305008\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821500\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"101040001007\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"遇忙转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305007\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821499\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"101040001006\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"全家享129元档尊享权益\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"全家享129元档尊享权益\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821494\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"300000305716\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"高清语音视频通话功能\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"高清语音视频通话功能\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821493\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"101030550000\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"全家享套餐-129元促销\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"全家享套餐-129元促销\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821492\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"300000304738\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"全家享套餐-129元-VPMN\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"全家享套餐-129元-VPMN\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821491\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"300000304731\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"全家享套餐-129元-语音\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"全家享套餐-129元-语音\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821490\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"300000304724\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"呼叫等待\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305014\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989821489\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66000815\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101557\",\n" +
                "                        \"OFFER_ID\": \"101040001011\",\n" +
                "                        \"CREATE_DATE\": \"20230320101557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"5G优享服务\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113989714335\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66005632\",\n" +
                "                        \"VALID_DATE\": \"20230401000000\",\n" +
                "                        \"DONE_DATE\": \"20230320083909\",\n" +
                "                        \"OFFER_ID\": \"300000222957\",\n" +
                "                        \"CREATE_DATE\": \"20230320083909\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"15G抖音头条定向流量包\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"15G抖音头条定向流量包\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113982267512\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"71015351\",\n" +
                "                        \"VALID_DATE\": \"20230305000841\",\n" +
                "                        \"DONE_DATE\": \"20230305091915\",\n" +
                "                        \"OFFER_ID\": \"300000365629\",\n" +
                "                        \"CREATE_DATE\": \"20230305000842\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"随心换专属视频彩铃定向流量月包\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"随心换专属视频彩铃定向流量月包\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113982267510\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"71015351\",\n" +
                "                        \"VALID_DATE\": \"20230305000841\",\n" +
                "                        \"DONE_DATE\": \"20230305091915\",\n" +
                "                        \"OFFER_ID\": \"300000365644\",\n" +
                "                        \"CREATE_DATE\": \"20230305000842\",\n" +
                "                        \"IS_BUNDLE\": \"1\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"REMARKS\": \"视频彩铃订阅-随心换专属6元包\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"PRICE_PLAN_NAME\": \"6元/月\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"VALUE\": \"698039\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SP_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"VALUE\": \"698039035100000007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"OPERATOR_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"VALID_DATE\": \"20230305000841\",\n" +
                "                        \"CREATE_OP_ID\": \"71015351\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"16\",\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"OFFER_NAME\": \"视频彩铃订阅-随心换专属6元包\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"OFFER_INS_ID\": \"479113982267511\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"OFFER_ID\": \"300000228358\",\n" +
                "                        \"DONE_DATE\": \"20230305091915\",\n" +
                "                        \"CREATE_DATE\": \"20230305000842\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"国内直拨\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305001\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113959409303\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004098\",\n" +
                "                        \"VALID_DATE\": \"20230201000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040001001\",\n" +
                "                        \"CREATE_DATE\": \"20230108130418\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"5GB流量模组3\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"5GB流量模组3\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113959409302\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004098\",\n" +
                "                        \"VALID_DATE\": \"20230201000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"300000350716\",\n" +
                "                        \"CREATE_DATE\": \"20230108130418\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"1\",\n" +
                "                        \"REMARKS\": \"畅享套餐-58元（2022版））\",\n" +
                "                        \"CBOSS_EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"VALID_DATE\": \"20230201000000\",\n" +
                "                        \"CREATE_OP_ID\": \"66004098\",\n" +
                "                        \"IS_BUNDLE\": \"1\",\n" +
                "                        \"OFFER_TYPE\": \"01\",\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"OFFER_NAME\": \"畅享套餐-58元（2022版）\",\n" +
                "                        \"DESCRIPTION\": \"畅享套餐-58元（2022版），月费58元，入网首月套餐费及包含内容按日折算一次性收取及提供，次月开始，按照完整账期收取套餐费及提供套餐内容。套餐包含来电显示，300分钟国内语音，20GB国内流量。包含OTT基础会员。超出部分语音0.15元/分钟，流量按照0.29元/M收取，累计到5元可免费用到1G，以此类推，短信0.1元/条，彩信0.3元/条。该套餐语音可共享不可滚存，流量可共享可滚存，最多可办理2张0元副卡共享主卡流量资源，共享功能费10元/张/月。上述资费描述所述的国内均指国内(不含港澳台地区)。您办理套餐产品支持选择多项增值权益产品使用，请您到移动手机营业厅-权益专区领取，权益价值5-15元，使用期一年，到期自动顺延。如合约期内取消增值权益产品，需到营业厅办理取消并确认解除免费使用合约协议。（我公司承诺资费方案有效期为一年（双方有特殊约定的除外，并有权在有效期截止后修改资费方案。如需修改，我公司将在修改前两个月通知您，您可以选择修改后的资费方案或我公司提供的其他资费方案。如无需修改，则原资费方案顺延一年，顺延次数不限）\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"OFFER_INS_ID\": \"479113959409301\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"OFFER_ID\": \"300000350717\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"CREATE_DATE\": \"20230108130418\",\n" +
                "                        \"BRAND\": \"1\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n");
        stringBuilder.append("               {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"关机呼转\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305023\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113959409333\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004098\",\n" +
                "                        \"VALID_DATE\": \"20230201000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040001017\",\n" +
                "                        \"CREATE_DATE\": \"20230108130418\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"无条件转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305010\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113959409331\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004098\",\n" +
                "                        \"VALID_DATE\": \"20230201000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040001009\",\n" +
                "                        \"CREATE_DATE\": \"20230108130418\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"无应答转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305054\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113959409330\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004098\",\n" +
                "                        \"VALID_DATE\": \"20230201000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040001008\",\n" +
                "                        \"CREATE_DATE\": \"20230108130418\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"不可达转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305008\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113959409329\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004098\",\n" +
                "                        \"VALID_DATE\": \"20230201000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040001007\",\n" +
                "                        \"CREATE_DATE\": \"20230108130418\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"遇忙转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305007\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"216000044\",\n" +
                "                                    \"VALUE\": \"\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CALL_FORWARDING_NUM\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113959409328\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004098\",\n" +
                "                        \"VALID_DATE\": \"20230201000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040001006\",\n" +
                "                        \"CREATE_DATE\": \"20230108130418\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"移动云盘内蒙古入套专属权益包\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"移动云盘内蒙古入套专属权益包\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113959409327\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004098\",\n" +
                "                        \"VALID_DATE\": \"20230201000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"300000344941\",\n" +
                "                        \"CREATE_DATE\": \"20230108130418\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"呼叫保持\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305019\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113959409326\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004098\",\n" +
                "                        \"VALID_DATE\": \"20230201000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040001014\",\n" +
                "                        \"CREATE_DATE\": \"20230108130418\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"来电显示\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"来电显示\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113959409325\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004098\",\n" +
                "                        \"VALID_DATE\": \"20230201000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040016043\",\n" +
                "                        \"CREATE_DATE\": \"20230108130418\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"5G畅享58元套餐基础0元包-OTT基础功能费优惠1\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"5G-20191111\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113959409312\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004098\",\n" +
                "                        \"VALID_DATE\": \"20230201000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"300000225750\",\n" +
                "                        \"CREATE_DATE\": \"20230108130418\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"高清语音视频通话功能\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"高清语音视频通话功能\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113959409311\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004098\",\n" +
                "                        \"VALID_DATE\": \"20230201000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101030550000\",\n" +
                "                        \"CREATE_DATE\": \"20230108130418\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"畅享套餐-58元（2022版）-促销\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"畅享套餐-58元（2022版）-促销\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113959409310\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004098\",\n" +
                "                        \"VALID_DATE\": \"20230201000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"300000350715\",\n" +
                "                        \"CREATE_DATE\": \"20230108130418\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"畅享套餐-58元（2022版）-VPMN\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"畅享套餐-58元（2022版）-VPMN\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113959409309\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004098\",\n" +
                "                        \"VALID_DATE\": \"20230201000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"300000350714\",\n" +
                "                        \"CREATE_DATE\": \"20230108130418\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"畅享套餐-58元（2022版）-语音\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"畅享套餐-58元（2022版）-语音\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113959409308\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004098\",\n" +
                "                        \"VALID_DATE\": \"20230201000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"300000350713\",\n" +
                "                        \"CREATE_DATE\": \"20230108130418\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"呼叫等待\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305014\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113959409307\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004098\",\n" +
                "                        \"VALID_DATE\": \"20230201000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040001011\",\n" +
                "                        \"CREATE_DATE\": \"20230108130418\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"WLAN签约\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"WLAN签约\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113959409305\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004098\",\n" +
                "                        \"VALID_DATE\": \"20230201000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040000001\",\n" +
                "                        \"CREATE_DATE\": \"20230108130418\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"短消息服务\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305013\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113959409306\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004098\",\n" +
                "                        \"VALID_DATE\": \"20230201000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040001010\",\n" +
                "                        \"CREATE_DATE\": \"20230108130418\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"4G-LTE\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"4G签约\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113959409304\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004098\",\n" +
                "                        \"VALID_DATE\": \"20230201000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101030540000\",\n" +
                "                        \"CREATE_DATE\": \"20230108130418\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"国内漫游\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"国内漫游\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113959409324\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004098\",\n" +
                "                        \"VALID_DATE\": \"20230201000000\",\n" +
                "                        \"DONE_DATE\": \"20230320101611\",\n" +
                "                        \"OFFER_ID\": \"101040014008\",\n" +
                "                        \"CREATE_DATE\": \"20230108130418\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"权益超市0元点播产品\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"一级产商品同步数据\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000322\",\n" +
                "                                    \"VALUE\": \"1\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"1001\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000262\",\n" +
                "                                    \"VALUE\": \"C0305\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"COMMODITY_TYPE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"CBOSS\",\n" +
                "                                    \"VALUE\": \"3002\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"CBOSS\",\n" +
                "                        \"OFFER_INS_ID\": \"479113958366963\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"9011\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"71996001\",\n" +
                "                        \"VALID_DATE\": \"20230104144425\",\n" +
                "                        \"DONE_DATE\": \"20230104144426\",\n" +
                "                        \"OFFER_ID\": \"300000249515\",\n" +
                "                        \"CREATE_DATE\": \"20230104144426\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"0元移动云盘定向流量（会员权益）\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"0元移动云盘定向流量（会员权益）\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000220\",\n" +
                "                                    \"VALUE\": \"LS20230101001812f29257aead014c\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"TRANS_ID\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"中移互联网\",\n" +
                "                                    \"VALUE\": \"280\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000209\",\n" +
                "                                    \"THIRD_CHANNEL_CODE\": \"1000000002320200003\",\n" +
                "                                    \"VALUE\": \"1000000002320200003\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"THIRD_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"CBOSS\",\n" +
                "                                    \"VALUE\": \"3002\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"CBOSS\",\n" +
                "                        \"OFFER_INS_ID\": \"479113957329097\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"280\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20230101001812\",\n" +
                "                        \"DONE_DATE\": \"20230101001813\",\n" +
                "                        \"OFFER_ID\": \"300000244509\",\n" +
                "                        \"CREATE_DATE\": \"20230101001813\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"REMARKS\": \"咪咕视频黄金会员包月6.9元\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"PRICE_PLAN_NAME\": \"6.9元/月\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000030\",\n" +
                "                                    \"VALUE\": \"1\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"IS_DEDUCTION_REMIND\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000074\",\n" +
                "                                    \"VALUE\": \"2\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SP_TYPE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000035\",\n" +
                "                                    \"VALUE\": \"544\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"BUSI_TYPE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"VALUE\": \"698040\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SP_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"VALUE\": \"69804040011001\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"OPERATOR_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"16\",\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"OFFER_NAME\": \"咪咕视频黄金会员包月6.9元\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945603704\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"OFFER_ID\": \"300000086920\",\n" +
                "                        \"DONE_DATE\": \"20230108130327\",\n" +
                "                        \"CREATE_DATE\": \"20221207114731\",\n" +
                "                        \"BRAND\": \"\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"REMARKS\": \"移动云盘白音会员(5G盲盒)\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"PRICE_PLAN_NAME\": \"免费\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000074\",\n" +
                "                                    \"VALUE\": \"2\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SP_TYPE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000035\",\n" +
                "                                    \"VALUE\": \"820\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"BUSI_TYPE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"VALUE\": \"200005\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SP_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"VALUE\": \"F100008581\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"OPERATOR_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"16\",\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"OFFER_NAME\": \"移动云盘白银会员(连续包月)\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945603703\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"OFFER_ID\": \"300000249802\",\n" +
                "                        \"DONE_DATE\": \"20230108130327\",\n" +
                "                        \"CREATE_DATE\": \"20221207114731\",\n" +
                "                        \"BRAND\": \"\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"可视电话\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601592\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"101040010108\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"99元升档活动-10GB流量包（合约）\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"99元升档活动-10GB流量包（合约）\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000210\",\n" +
                "                                    \"VALUE\": \"1\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"PORT_OFFER_RULE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000318\",\n" +
                "                                    \"VALUE\": \"B005\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"OFFER_AGREEMENT_TYPE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601598\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"300000422133\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"无条件转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305010\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601597\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"101040001009\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"无应答转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305054\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601596\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"101040001008\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"不可达转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305008\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601595\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"101040001007\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"遇忙转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305007\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601594\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"101040001006\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"关机呼转\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305023\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601593\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"101040001017\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"移动云盘内蒙古入套专属权益包\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"移动云盘内蒙古入套专属权益包\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601591\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"300000344941\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"高清语音视频通话功能\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"高清语音视频通话功能\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601590\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"101030550000\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"全家享套餐-99元促销\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"全家享套餐-99元促销\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000029\",\n" +
                "                                    \"VALUE\": \"1\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"IS_SHARE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601589\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"300000304737\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"全家享套餐-99元-VPMN\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"全家享套餐-99元-VPMN\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601588\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"300000304730\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"全家享套餐-99元-语音\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"全家享套餐-99元-语音\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601587\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"300000304723\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"呼叫等待\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305014\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601586\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"101040001011\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"短消息服务\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305013\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601585\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"101040001010\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"WLAN签约\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"WLAN签约\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601584\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"101040000001\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"4G-LTE\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"4G签约\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601583\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"101030540000\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"全家享99元档尊享权益\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"全家享99元档尊享权益\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601582\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"300000305715\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"呼叫保持\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305019\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601579\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"101040001014\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"来电显示\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"来电显示\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601578\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"101040016043\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"全家享套餐—多终端共享帐前优惠20元\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"全家享套餐—多终端共享帐前优惠20元\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601581\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"300000304752\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"尊享权益随心选（98元产品专享）-促销\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"尊享权益随心选（98元产品专享）-促销\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945603707\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130327\",\n" +
                "                        \"OFFER_ID\": \"300000287375\",\n" +
                "                        \"CREATE_DATE\": \"20221207114731\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"优惠2元视频彩铃信息费\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"优惠2元视频彩铃信息费\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945603705\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130327\",\n" +
                "                        \"OFFER_ID\": \"300000287343\",\n" +
                "                        \"CREATE_DATE\": \"20221207114731\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"权益超市黄金会员\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"一级产商品同步数据\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000365\",\n" +
                "                                    \"VALUE\": \"1\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"IS_CODE_COM\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945603702\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130327\",\n" +
                "                        \"OFFER_ID\": \"300000241363\",\n" +
                "                        \"CREATE_DATE\": \"20221207114731\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"尊享权益随心选（98元产品专享）\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"尊享权益随心选（98元产品专享）\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000318\",\n" +
                "                                    \"VALUE\": \"B002\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"OFFER_AGREEMENT_TYPE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000413\",\n" +
                "                                    \"VALUE\": \"9990400200001360001\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"IS_RIGHT_PRO\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000239\",\n" +
                "                                    \"VALUE\": \"1\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"MAIN_OFFER_CHANGE_CTRL\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000076\",\n" +
                "                                    \"VALUE\": \"6\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"OFFER_SUB_TYPE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945603701\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130327\",\n" +
                "                        \"OFFER_ID\": \"300000287381\",\n" +
                "                        \"CREATE_DATE\": \"20221207114731\",\n" +
                "                        \"IS_BUNDLE\": \"1\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"REMARKS\": \"主题特色视频彩铃2元包(订阅服务)\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"PRICE_PLAN_NAME\": \"2元/月\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000030\",\n" +
                "                                    \"VALUE\": \"1\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"IS_DEDUCTION_REMIND\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000147\",\n" +
                "                                    \"VALUE\": \"BOSS\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNELCODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000074\",\n" +
                "                                    \"VALUE\": \"2\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SP_TYPE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000035\",\n" +
                "                                    \"VALUE\": \"544\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"BUSI_TYPE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"VALUE\": \"698039\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SP_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"VALUE\": \"698039035100000035\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"OPERATOR_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"16\",\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"OFFER_NAME\": \"主题特色视频彩铃2元包(订阅服务)\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945603706\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"OFFER_ID\": \"300000245642\",\n" +
                "                        \"DONE_DATE\": \"20230108130327\",\n" +
                "                        \"CREATE_DATE\": \"20221207114731\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"GPRS业务\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305025\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601576\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"101040001018\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"国内漫游\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"国内漫游\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601577\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"101040014008\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"国内直拨\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305001\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601580\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"101040001001\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"全家享资费-智能组网服务\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"全家享资费-智能组网服务\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000222\",\n" +
                "                                    \"VALUE\": \"1\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"IS_AI_GROUP_NO_WORKING\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601565\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"300000341141\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"视频彩铃\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"BR20190428034\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000030\",\n" +
                "                                    \"VALUE\": \"1\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"IS_DEDUCTION_REMIND\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601564\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"300000223812\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"99元升档活动-10GB流量包\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"99元升档活动-10GB流量包\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000029\",\n" +
                "                                    \"VALUE\": \"1\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"IS_SHARE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601563\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"OFFER_ID\": \"300000404030\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"1\",\n" +
                "                        \"REMARKS\": \"全家享套餐-99元\",\n" +
                "                        \"CBOSS_EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"VALID_DATE\": \"20230101000000\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"IS_BUNDLE\": \"1\",\n" +
                "                        \"OFFER_TYPE\": \"01\",\n" +
                "                        \"EXPIRE_DATE\": \"20230201000000\",\n" +
                "                        \"OFFER_NAME\": \"全家享套餐-99元\",\n" +
                "                        \"DESCRIPTION\": \"全家享套餐-99元档，入网首月套餐费及包含内容按日折算一次性收取及提供，次月开始，按照完整账期收取套餐费及提供套餐内容。套餐包含来电显示，500分钟国内通话分钟数（含国内高清视频通话），20GB国内流量。可办理最高300M宽带，包含OTT基础会员。套餐包含最高价值20元的OTT会员优惠券，可根据实际需求选择OTT会员产品或IPTV会员产品，超出优惠部分需额外收费（有效期为12个月，在协议期满前三个月内，如无异议，本协议自动顺延12个月）。超出部分国内通话0.15元/分钟，流量按照0.29元/M收取，累计到5元可免费用到1G，以此类推，短信0.1元/条，彩信0.3元/条。该套餐语音可共享不可滚存，流量可共享可滚存，套内包含2张共享卡共享权益。上述资费描述所述的国内均指国内(不含港澳台地区)。您办理套餐产品支持选择多项增值权益产品使用，请您到移动“手机营业厅-权益专区”领取，权益价值5-15元，使用期一年，到期自动顺延。如合约期内取消增值权益产品，需到营业厅办理取消并确认解除免费使用合约协议。（我公司承诺资费方案有效期为一年（双方有特殊约定的除外，并有权在有效期截止后修改资费方案。如需修改，我公司将在修改前两个月通知您，您可以选择修改后的资费方案或我公司提供的其他资费方案。如无需修改，则原资费方案顺延一年，顺延次数不限）\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945601562\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"OFFER_ID\": \"300000304744\",\n" +
                "                        \"DONE_DATE\": \"20230108130428\",\n" +
                "                        \"CREATE_DATE\": \"20221207114719\",\n" +
                "                        \"BRAND\": \"1\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"快手拼团流量包-流量\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"BR20190527021\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000220\",\n" +
                "                                    \"VALUE\": \"LS20221207114628d8abaaad66004a\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"TRANS_ID\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000209\",\n" +
                "                                    \"THIRD_CHANNEL_CODE\": \"1000000005320100002\",\n" +
                "                                    \"VALUE\": \"1000000005320100002\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"THIRD_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945602808\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20221207114628\",\n" +
                "                        \"DONE_DATE\": \"20221207114807\",\n" +
                "                        \"OFFER_ID\": \"300000173488\",\n" +
                "                        \"CREATE_DATE\": \"20221207114629\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"快手拼团流量包-优惠\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"BR20190527021\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000220\",\n" +
                "                                    \"VALUE\": \"LS20221207114628d8abaaad66004a\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"TRANS_ID\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000209\",\n" +
                "                                    \"THIRD_CHANNEL_CODE\": \"1000000005320100002\",\n" +
                "                                    \"VALUE\": \"1000000005320100002\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"THIRD_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945602807\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20221207114628\",\n" +
                "                        \"DONE_DATE\": \"20221207114807\",\n" +
                "                        \"OFFER_ID\": \"300000173497\",\n" +
                "                        \"CREATE_DATE\": \"20221207114629\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"快手拼团流量包\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"BR20190527021\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000322\",\n" +
                "                                    \"VALUE\": \"9\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"1001\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000076\",\n" +
                "                                    \"VALUE\": \"6\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"OFFER_SUB_TYPE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000220\",\n" +
                "                                    \"VALUE\": \"LS20221207114628d8abaaad66004a\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"TRANS_ID\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000209\",\n" +
                "                                    \"THIRD_CHANNEL_CODE\": \"1000000005320100002\",\n" +
                "                                    \"VALUE\": \"1000000005320100002\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"THIRD_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945602806\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20221207114628\",\n" +
                "                        \"DONE_DATE\": \"20221207114807\",\n" +
                "                        \"OFFER_ID\": \"300000173506\",\n" +
                "                        \"CREATE_DATE\": \"20221207114629\",\n" +
                "                        \"IS_BUNDLE\": \"1\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"22版30元5G流量包\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"22版30元5G流量包\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000029\",\n" +
                "                                    \"VALUE\": \"1\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"IS_SHARE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945572850\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20221207114609\",\n" +
                "                        \"DONE_DATE\": \"20221207114754\",\n" +
                "                        \"OFFER_ID\": \"300000414313\",\n" +
                "                        \"CREATE_DATE\": \"20221207114611\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"优惠15元流量包费用\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"优惠15元流量包费用\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945602701\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20221207114609\",\n" +
                "                        \"DONE_DATE\": \"20221207114754\",\n" +
                "                        \"OFFER_ID\": \"300000414316\",\n" +
                "                        \"CREATE_DATE\": \"20221207114611\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"新58及以上叠加包15元5GB\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"新58及以上叠加包15元5GB\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000076\",\n" +
                "                                    \"VALUE\": \"6\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"OFFER_SUB_TYPE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000360\",\n" +
                "                                    \"VALUE\": \"58\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"MAIN_OFFER_FEE_LIMIT_MIN\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113945572849\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002144\",\n" +
                "                        \"VALID_DATE\": \"20221207114609\",\n" +
                "                        \"DONE_DATE\": \"20221207114754\",\n" +
                "                        \"OFFER_ID\": \"300000414322\",\n" +
                "                        \"CREATE_DATE\": \"20221207114611\",\n" +
                "                        \"IS_BUNDLE\": \"1\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230401000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"5G优享服务\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113944544312\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002965\",\n" +
                "                        \"VALID_DATE\": \"20221204145432\",\n" +
                "                        \"DONE_DATE\": \"20230320083855\",\n" +
                "                        \"OFFER_ID\": \"300000222957\",\n" +
                "                        \"CREATE_DATE\": \"20221204145433\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"5G特惠流量包30元5GB（首月1元体验版）优惠商品\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"一级产商品同步数据\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000220\",\n" +
                "                                    \"VALUE\": \"LS202212041454142508eea4e5c04f\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"TRANS_ID\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"10086微信\",\n" +
                "                                    \"VALUE\": \"270\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000209\",\n" +
                "                                    \"THIRD_CHANNEL_CODE\": \"1000000005320100002\",\n" +
                "                                    \"VALUE\": \"1000000005320100002\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"THIRD_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"CBOSS\",\n" +
                "                                    \"VALUE\": \"3002\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"CBOSS\",\n" +
                "                        \"OFFER_INS_ID\": \"479113944558268\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"270\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20221204145415\",\n" +
                "                        \"DONE_DATE\": \"20221204145416\",\n" +
                "                        \"OFFER_ID\": \"300000327938\",\n" +
                "                        \"CREATE_DATE\": \"20221204145416\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"30元5GB-5G特惠流量包\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"30元5GB-5G特惠流量包\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000322\",\n" +
                "                                    \"VALUE\": \"1\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"1001\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000220\",\n" +
                "                                    \"VALUE\": \"LS202212041454142508eea4e5c04f\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"TRANS_ID\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000209\",\n" +
                "                                    \"THIRD_CHANNEL_CODE\": \"1000000005320100002\",\n" +
                "                                    \"VALUE\": \"1000000005320100002\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"THIRD_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113944558267\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20221204145415\",\n" +
                "                        \"DONE_DATE\": \"20221204145507\",\n" +
                "                        \"OFFER_ID\": \"300000231513\",\n" +
                "                        \"CREATE_DATE\": \"20221204145416\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"5G特惠流量包30元5GB（首月1元体验版）\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"一级产商品同步数据\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000354\",\n" +
                "                                    \"VALUE\": \"0\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"IS_CENTRAL_CHARGE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000220\",\n" +
                "                                    \"VALUE\": \"LS202212041454142508eea4e5c04f\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"TRANS_ID\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"10086微信\",\n" +
                "                                    \"VALUE\": \"270\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000209\",\n" +
                "                                    \"THIRD_CHANNEL_CODE\": \"1000000005320100002\",\n" +
                "                                    \"VALUE\": \"1000000005320100002\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"THIRD_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"CBOSS\",\n" +
                "                                    \"VALUE\": \"3002\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"CBOSS\",\n" +
                "                        \"OFFER_INS_ID\": \"479113944558266\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"270\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20221204145415\",\n" +
                "                        \"DONE_DATE\": \"20221204145416\",\n" +
                "                        \"OFFER_ID\": \"300000327939\",\n" +
                "                        \"CREATE_DATE\": \"20221204145416\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"10GB咪咕视频定向流量\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"10GB咪咕视频定向流量\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113944554043\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66002965\",\n" +
                "                        \"VALID_DATE\": \"20221204140000\",\n" +
                "                        \"DONE_DATE\": \"20221204145451\",\n" +
                "                        \"OFFER_ID\": \"300000420320\",\n" +
                "                        \"CREATE_DATE\": \"20221204145451\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"可视电话\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113932555268\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004536\",\n" +
                "                        \"VALID_DATE\": \"20221201000000\",\n" +
                "                        \"DONE_DATE\": \"20221207114727\",\n" +
                "                        \"OFFER_ID\": \"101040010108\",\n" +
                "                        \"CREATE_DATE\": \"20221107161723\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"国内直拨\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305001\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113932552539\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004536\",\n" +
                "                        \"VALID_DATE\": \"20221201000000\",\n" +
                "                        \"DONE_DATE\": \"20221207114727\",\n" +
                "                        \"OFFER_ID\": \"101040001001\",\n" +
                "                        \"CREATE_DATE\": \"20221107161723\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"5GB流量模组3\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"5GB流量模组3\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000029\",\n" +
                "                                    \"VALUE\": \"1\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"IS_SHARE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113932552538\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004536\",\n" +
                "                        \"VALID_DATE\": \"20221201000000\",\n" +
                "                        \"DONE_DATE\": \"20221207114727\",\n" +
                "                        \"OFFER_ID\": \"300000350716\",\n" +
                "                        \"CREATE_DATE\": \"20221107161723\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"1\",\n" +
                "                        \"REMARKS\": \"畅享套餐-58元（2022版））\",\n" +
                "                        \"CBOSS_EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"VALID_DATE\": \"20221201000000\",\n" +
                "                        \"CREATE_OP_ID\": \"66004536\",\n" +
                "                        \"IS_BUNDLE\": \"1\",\n" +
                "                        \"OFFER_TYPE\": \"01\",\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"OFFER_NAME\": \"畅享套餐-58元（2022版）\",\n" +
                "                        \"DESCRIPTION\": \"畅享套餐-58元（2022版），月费58元，入网首月套餐费及包含内容按日折算一次性收取及提供，次月开始，按照完整账期收取套餐费及提供套餐内容。套餐包含来电显示，300分钟国内语音，20GB国内流量。包含OTT基础会员。超出部分语音0.15元/分钟，流量按照0.29元/M收取，累计到5元可免费用到1G，以此类推，短信0.1元/条，彩信0.3元/条。该套餐语音可共享不可滚存，流量可共享可滚存，最多可办理2张0元副卡共享主卡流量资源，共享功能费10元/张/月。上述资费描述所述的国内均指国内(不含港澳台地区)。您办理套餐产品支持选择多项增值权益产品使用，请您到移动手机营业厅-权益专区领取，权益价值5-15元，使用期一年，到期自动顺延。如合约期内取消增值权益产品，需到营业厅办理取消并确认解除免费使用合约协议。（我公司承诺资费方案有效期为一年（双方有特殊约定的除外，并有权在有效期截止后修改资费方案。如需修改，我公司将在修改前两个月通知您，您可以选择修改后的资费方案或我公司提供的其他资费方案。如无需修改，则原资费方案顺延一年，顺延次数不限）\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"OFFER_INS_ID\": \"479113932552537\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"OFFER_ID\": \"300000350717\",\n" +
                "                        \"DONE_DATE\": \"20221207114727\",\n" +
                "                        \"CREATE_DATE\": \"20221107161723\",\n" +
                "                        \"BRAND\": \"1\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"WLAN签约\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"WLAN签约\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113932552541\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004536\",\n" +
                "                        \"VALID_DATE\": \"20221201000000\",\n" +
                "                        \"DONE_DATE\": \"20221207114727\",\n" +
                "                        \"OFFER_ID\": \"101040000001\",\n" +
                "                        \"CREATE_DATE\": \"20221107161723\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"4G-LTE\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"4G签约\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113932552540\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004536\",\n" +
                "                        \"VALID_DATE\": \"20221201000000\",\n" +
                "                        \"DONE_DATE\": \"20221207114727\",\n" +
                "                        \"OFFER_ID\": \"101030540000\",\n" +
                "                        \"CREATE_DATE\": \"20221107161723\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"短消息服务\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305013\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113932552542\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004536\",\n" +
                "                        \"VALID_DATE\": \"20221201000000\",\n" +
                "                        \"DONE_DATE\": \"20221207114727\",\n" +
                "                        \"OFFER_ID\": \"101040001010\",\n" +
                "                        \"CREATE_DATE\": \"20221107161723\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"5G畅享58元套餐基础0元包-OTT基础功能费优惠1\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"5G-20191111\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113932552548\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004536\",\n" +
                "                        \"VALID_DATE\": \"20221201000000\",\n" +
                "                        \"DONE_DATE\": \"20221207114727\",\n" +
                "                        \"OFFER_ID\": \"300000225750\",\n" +
                "                        \"CREATE_DATE\": \"20221107161723\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"高清语音视频通话功能\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"高清语音视频通话功能\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113932552547\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004536\",\n" +
                "                        \"VALID_DATE\": \"20221201000000\",\n" +
                "                        \"DONE_DATE\": \"20221207114727\",\n" +
                "                        \"OFFER_ID\": \"101030550000\",\n" +
                "                        \"CREATE_DATE\": \"20221107161723\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"畅享套餐-58元（2022版）-促销\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"畅享套餐-58元（2022版）-促销\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000029\",\n" +
                "                                    \"VALUE\": \"1\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"IS_SHARE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113932552546\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004536\",\n" +
                "                        \"VALID_DATE\": \"20221201000000\",\n" +
                "                        \"DONE_DATE\": \"20221207114727\",\n" +
                "                        \"OFFER_ID\": \"300000350715\",\n" +
                "                        \"CREATE_DATE\": \"20221107161723\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"畅享套餐-58元（2022版）-VPMN\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"畅享套餐-58元（2022版）-VPMN\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113932552545\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004536\",\n" +
                "                        \"VALID_DATE\": \"20221201000000\",\n" +
                "                        \"DONE_DATE\": \"20221207114727\",\n" +
                "                        \"OFFER_ID\": \"300000350714\",\n" +
                "                        \"CREATE_DATE\": \"20221107161723\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"畅享套餐-58元（2022版）-语音\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"畅享套餐-58元（2022版）-语音\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113932552544\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004536\",\n" +
                "                        \"VALID_DATE\": \"20221201000000\",\n" +
                "                        \"DONE_DATE\": \"20221207114727\",\n" +
                "                        \"OFFER_ID\": \"300000350713\",\n" +
                "                        \"CREATE_DATE\": \"20221107161723\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"呼叫等待\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305014\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113932552543\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004536\",\n" +
                "                        \"VALID_DATE\": \"20221201000000\",\n" +
                "                        \"DONE_DATE\": \"20221207114727\",\n" +
                "                        \"OFFER_ID\": \"101040001011\",\n" +
                "                        \"CREATE_DATE\": \"20221107161723\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"呼叫保持\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305019\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113932555262\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004536\",\n" +
                "                        \"VALID_DATE\": \"20221201000000\",\n" +
                "                        \"DONE_DATE\": \"20221207114727\",\n" +
                "                        \"OFFER_ID\": \"101040001014\",\n" +
                "                        \"CREATE_DATE\": \"20221107161723\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"来电显示\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"来电显示\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113932555261\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004536\",\n" +
                "                        \"VALID_DATE\": \"20221201000000\",\n" +
                "                        \"DONE_DATE\": \"20221207114727\",\n" +
                "                        \"OFFER_ID\": \"101040016043\",\n" +
                "                        \"CREATE_DATE\": \"20221107161723\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"国内漫游\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"国内漫游\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113932555260\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004536\",\n" +
                "                        \"VALID_DATE\": \"20221201000000\",\n" +
                "                        \"DONE_DATE\": \"20221207114727\",\n" +
                "                        \"OFFER_ID\": \"101040014008\",\n" +
                "                        \"CREATE_DATE\": \"20221107161723\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"GPRS业务\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305025\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113932555259\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004536\",\n" +
                "                        \"VALID_DATE\": \"20221201000000\",\n" +
                "                        \"DONE_DATE\": \"20221207114727\",\n" +
                "                        \"OFFER_ID\": \"101040001018\",\n" +
                "                        \"CREATE_DATE\": \"20221107161723\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"移动云盘内蒙古入套专属权益包\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"移动云盘内蒙古入套专属权益包\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113932555263\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004536\",\n" +
                "                        \"VALID_DATE\": \"20221201000000\",\n" +
                "                        \"DONE_DATE\": \"20221207114727\",\n" +
                "                        \"OFFER_ID\": \"300000344941\",\n" +
                "                        \"CREATE_DATE\": \"20221107161723\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"关机呼转\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305023\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113932555269\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004536\",\n" +
                "                        \"VALID_DATE\": \"20221201000000\",\n" +
                "                        \"DONE_DATE\": \"20221207114727\",\n" +
                "                        \"OFFER_ID\": \"101040001017\",\n" +
                "                        \"CREATE_DATE\": \"20221107161723\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"无条件转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305010\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113932555267\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004536\",\n" +
                "                        \"VALID_DATE\": \"20221201000000\",\n" +
                "                        \"DONE_DATE\": \"20221207114727\",\n" +
                "                        \"OFFER_ID\": \"101040001009\",\n" +
                "                        \"CREATE_DATE\": \"20221107161723\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"无应答转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305054\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113932555266\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004536\",\n" +
                "                        \"VALID_DATE\": \"20221201000000\",\n" +
                "                        \"DONE_DATE\": \"20221207114727\",\n" +
                "                        \"OFFER_ID\": \"101040001008\",\n" +
                "                        \"CREATE_DATE\": \"20221107161723\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"不可达转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305008\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113932555265\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004536\",\n" +
                "                        \"VALID_DATE\": \"20221201000000\",\n" +
                "                        \"DONE_DATE\": \"20221207114727\",\n" +
                "                        \"OFFER_ID\": \"101040001007\",\n" +
                "                        \"CREATE_DATE\": \"20221107161723\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"遇忙转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305007\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000208\",\n" +
                "                                    \"subChannelValue\": \"30080007\",\n" +
                "                                    \"VALUE\": \"30080007\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SUB_CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"channelValue\": \"客服\",\n" +
                "                                    \"VALUE\": \"3008\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113932555264\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"66004536\",\n" +
                "                        \"VALID_DATE\": \"20221201000000\",\n" +
                "                        \"DONE_DATE\": \"20221207114727\",\n" +
                "                        \"OFFER_ID\": \"101040001006\",\n" +
                "                        \"CREATE_DATE\": \"20221107161723\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20220816000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"生日免单礼包\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"生日免单礼包\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000207\",\n" +
                "                                    \"VALUE\": \"1000\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"CHANNEL_CODE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000251\",\n" +
                "                                    \"VALUE\": \"1\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"OFFER_PRINT_TYPE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000000\",\n" +
                "                                    \"VALUE\": \"0\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"IS_NEED_CONFIRM\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000195\",\n" +
                "                                    \"VALUE\": \"1\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"UNIFIED_QUERY_CANCEL\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479113864320586\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"2029\",\n" +
                "                        \"VALID_DATE\": \"20220815000000\",\n" +
                "                        \"DONE_DATE\": \"20220720062112\",\n" +
                "                        \"OFFER_ID\": \"300000138267\",\n" +
                "                        \"CREATE_DATE\": \"20220720062112\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"权益超市黄金会员优惠包\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113631508962\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79050041\",\n" +
                "                        \"VALID_DATE\": \"20210927010703\",\n" +
                "                        \"DONE_DATE\": \"20221207114654\",\n" +
                "                        \"OFFER_ID\": \"300000279509\",\n" +
                "                        \"CREATE_DATE\": \"20210927010705\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"权益超市黄金会员\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"一级产商品同步数据\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000322\",\n" +
                "                                    \"VALUE\": \"1\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"1001\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113631508961\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79050041\",\n" +
                "                        \"VALID_DATE\": \"20210927010703\",\n" +
                "                        \"DONE_DATE\": \"20221207114654\",\n" +
                "                        \"OFFER_ID\": \"300000241363\",\n" +
                "                        \"CREATE_DATE\": \"20210927010705\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20230101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"权益超市黄金会员（畅享）包\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"权益超市黄金会员（畅享）包\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000076\",\n" +
                "                                    \"VALUE\": \"6\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"OFFER_SUB_TYPE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"客服\",\n" +
                "                        \"OFFER_INS_ID\": \"479113631508960\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79050041\",\n" +
                "                        \"VALID_DATE\": \"20210926180944\",\n" +
                "                        \"DONE_DATE\": \"20221207114654\",\n" +
                "                        \"OFFER_ID\": \"300000279510\",\n" +
                "                        \"CREATE_DATE\": \"20210927010705\",\n" +
                "                        \"IS_BUNDLE\": \"1\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"畅享0元30G叠加包\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"0元30G不限量叠加包\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479112483930564\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79011012\",\n" +
                "                        \"VALID_DATE\": \"20180901000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161708\",\n" +
                "                        \"OFFER_ID\": \"300000117783\",\n" +
                "                        \"CREATE_DATE\": \"20180828174446\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"国内漫游\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"国内漫游\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111898103193\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20180301000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161729\",\n" +
                "                        \"OFFER_ID\": \"101040014008\",\n" +
                "                        \"CREATE_DATE\": \"20180209095543\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"巨无霸流量王-138元\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111898103181\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20180301000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161729\",\n" +
                "                        \"OFFER_ID\": \"101040009040\",\n" +
                "                        \"CREATE_DATE\": \"20180209095543\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"巨无霸138升级赠送500分钟全国分钟\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"巨无霸138升级赠送500分钟省内分钟\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000029\",\n" +
                "                                    \"VALUE\": \"1\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"IS_SHARE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111898103185\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20180301000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161729\",\n" +
                "                        \"OFFER_ID\": \"300000012413\",\n" +
                "                        \"CREATE_DATE\": \"20180209095543\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"巨无霸138升级赠送20GB国内流量\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"巨无霸138升级赠送20GB省内流量\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000029\",\n" +
                "                                    \"VALUE\": \"1\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"IS_SHARE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111898103184\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20180301000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161729\",\n" +
                "                        \"OFFER_ID\": \"300000012412\",\n" +
                "                        \"CREATE_DATE\": \"20180209095543\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"GPRS业务\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305025\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111898103191\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20180301000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161729\",\n" +
                "                        \"OFFER_ID\": \"101040001018\",\n" +
                "                        \"CREATE_DATE\": \"20180209095543\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"不可达转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305008\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111898103200\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20180301000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161729\",\n" +
                "                        \"OFFER_ID\": \"101040001007\",\n" +
                "                        \"CREATE_DATE\": \"20180209095543\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"无应答转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305054\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111898105653\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20180301000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161729\",\n" +
                "                        \"OFFER_ID\": \"101040001008\",\n" +
                "                        \"CREATE_DATE\": \"20180209095543\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");
        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"1\",\n" +
                "                        \"OFFER_NAME\": \"巨无霸流量王-138元\",\n" +
                "                        \"DESCRIPTION\": \"巨无霸流量王-138元，月套餐费138元，入网当月收取费用及套餐包含资源、赠送资源均区分上下半月一次性收取及提供，次月月初按照完整账期一次性收取及提供。来显免费使用，包含1G国内流量，额外赠送1000分钟全国通话时长，6G国内流量，超出部分语音0.19元/分钟，国内被叫免费，超出部分流量按照0.29元/MB计费，累计收费10元可用至100M，累计收费30元可用至1GB，短信0.1元/条，彩信0.3元/条。套餐内流量、语音均可共享。套餐内包含国内流量可结转，赠送国内流量不结转。赠送流量在套餐流量使用完毕后可消耗。上述资费描述的国内均指国内(不含港澳台)。\",\n" +
                "                        \"REMARKS\": \"巨无霸流量王-138元，月套餐费138元，入网当月收取费用及套餐包含资源、赠送资源均区分上下半月一次性收取及提供，次月月初按照完整账期一次性收取及提供。来显免费使用，包含1G全国流量，额外赠送1000分钟省内通话时长，26G省内流量，超出部分语音0.19元/分钟，全国被叫免费，流量按照10元100M安心服务收取，短信0.1元/条，彩信0.3元/条。套餐内流量、赠送流量、赠送语音均可进行共享。套餐内包含全国流量可结转，赠送省内流量不结转。赠送省内流量在套餐流量使用完毕后可消耗。\",\n" +
                "                        \"CBOSS_EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111898103173\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20180301000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161729\",\n" +
                "                        \"OFFER_ID\": \"100040009040\",\n" +
                "                        \"CREATE_DATE\": \"20180209095543\",\n" +
                "                        \"IS_BUNDLE\": \"1\",\n" +
                "                        \"BRAND\": \"1\",\n" +
                "                        \"OFFER_TYPE\": \"01\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"4G-LTE\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"4G签约\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111898103198\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20180301000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161729\",\n" +
                "                        \"OFFER_ID\": \"101030540000\",\n" +
                "                        \"CREATE_DATE\": \"20180209095543\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"国内直拨\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305001\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111898103196\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20180301000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161729\",\n" +
                "                        \"OFFER_ID\": \"101040001001\",\n" +
                "                        \"CREATE_DATE\": \"20180209095543\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"可视电话\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111898105655\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20180301000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161729\",\n" +
                "                        \"OFFER_ID\": \"101040010108\",\n" +
                "                        \"CREATE_DATE\": \"20180209095543\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"WLAN签约\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"WLAN签约\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111898103199\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20180301000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161729\",\n" +
                "                        \"OFFER_ID\": \"101040000001\",\n" +
                "                        \"CREATE_DATE\": \"20180209095543\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"无条件转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305010\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111898105654\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20180301000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161729\",\n" +
                "                        \"OFFER_ID\": \"101040001009\",\n" +
                "                        \"CREATE_DATE\": \"20180209095543\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"巨无霸流量王-138元-流量促销（计划内0）\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000029\",\n" +
                "                                    \"VALUE\": \"1\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"IS_SHARE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111898103182\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20180301000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161729\",\n" +
                "                        \"OFFER_ID\": \"101040011167\",\n" +
                "                        \"CREATE_DATE\": \"20180209095543\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"呼叫等待\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305014\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111898105652\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20180301000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161729\",\n" +
                "                        \"OFFER_ID\": \"101040001011\",\n" +
                "                        \"CREATE_DATE\": \"20180209095543\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"关机呼转\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305023\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111898103192\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20180301000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161729\",\n" +
                "                        \"OFFER_ID\": \"101040001017\",\n" +
                "                        \"CREATE_DATE\": \"20180209095543\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"高清语音视频通话功能\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"VO-LTE签约\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111898103187\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20180301000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161729\",\n" +
                "                        \"OFFER_ID\": \"101030550000\",\n" +
                "                        \"CREATE_DATE\": \"20180209095543\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"来电显示\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"全区来电优惠\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111898103194\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20180301000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161729\",\n" +
                "                        \"OFFER_ID\": \"101040016043\",\n" +
                "                        \"CREATE_DATE\": \"20180209095543\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"呼叫保持\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305019\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111898103195\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20180301000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161729\",\n" +
                "                        \"OFFER_ID\": \"101040001014\",\n" +
                "                        \"CREATE_DATE\": \"20180209095543\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"短消息服务\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305013\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111898105651\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20180301000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161729\",\n" +
                "                        \"OFFER_ID\": \"101040001010\",\n" +
                "                        \"CREATE_DATE\": \"20180209095543\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"巨无霸流量王-138元-语音促销（计划内0）\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000029\",\n" +
                "                                    \"VALUE\": \"1\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"IS_SHARE\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111898103183\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20180301000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161729\",\n" +
                "                        \"OFFER_ID\": \"101040011166\",\n" +
                "                        \"CREATE_DATE\": \"20180209095543\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"遇忙转移\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"NWK-305007\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111898103197\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20180301000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161729\",\n" +
                "                        \"OFFER_ID\": \"101040001006\",\n" +
                "                        \"CREATE_DATE\": \"20180209095543\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221201000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"巨无霸流量王-138元\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111898103174\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"0\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79996000\",\n" +
                "                        \"VALID_DATE\": \"20180301000000\",\n" +
                "                        \"DONE_DATE\": \"20221107161729\",\n" +
                "                        \"OFFER_ID\": \"101040034040\",\n" +
                "                        \"CREATE_DATE\": \"20180209095543\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"08\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"个性化提醒--80%\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111937994384\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79051082\",\n" +
                "                        \"VALID_DATE\": \"20180227164910\",\n" +
                "                        \"DONE_DATE\": \"20180227223307\",\n" +
                "                        \"OFFER_ID\": \"101040005349\",\n" +
                "                        \"CREATE_DATE\": \"20180227223307\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"个性化提醒--30%\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111940198960\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79051082\",\n" +
                "                        \"VALID_DATE\": \"20180227164712\",\n" +
                "                        \"DONE_DATE\": \"20180228151844\",\n" +
                "                        \"OFFER_ID\": \"101040005345\",\n" +
                "                        \"CREATE_DATE\": \"20180228151844\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"套餐余量提醒定制（每月提醒2次）\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"套餐余量提醒定制（每月提醒2次）\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111939424411\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79051082\",\n" +
                "                        \"VALID_DATE\": \"20180227164519\",\n" +
                "                        \"DONE_DATE\": \"20180228115922\",\n" +
                "                        \"OFFER_ID\": \"300000009495\",\n" +
                "                        \"CREATE_DATE\": \"20180228115922\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20991231235959\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"话费套餐余量信息定制服务\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"话费套餐余量信息定制服务\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"479111115544440\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"79995000\",\n" +
                "                        \"VALID_DATE\": \"20170601082557\",\n" +
                "                        \"DONE_DATE\": \"20170601082557\",\n" +
                "                        \"OFFER_ID\": \"300000002759\",\n" +
                "                        \"CREATE_DATE\": \"20170601082557\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"12\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20300101000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"1\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"非cmwap用户状态标记\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"10125667235\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"\",\n" +
                "                        \"VALID_DATE\": \"20160805122006\",\n" +
                "                        \"DONE_DATE\": \"20170317005553\",\n" +
                "                        \"OFFER_ID\": \"105000478205\",\n" +
                "                        \"CREATE_DATE\": \"20160805122006\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"1\",\n" +
                "                        \"OFFER_TYPE\": \"16\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221215150801\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"1\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"VPMN虚拟成员主商品\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"vpmn成员主商品-NEWCRM数据割接 by guo\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"84005765775\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"\",\n" +
                "                        \"VALID_DATE\": \"20140331163015\",\n" +
                "                        \"DONE_DATE\": \"20221215150813\",\n" +
                "                        \"OFFER_ID\": \"106100000016\",\n" +
                "                        \"CREATE_DATE\": \"20140331163015\",\n" +
                "                        \"IS_BUNDLE\": \"1\",\n" +
                "                        \"BRAND\": \"0\",\n" +
                "                        \"OFFER_TYPE\": \"52\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                },");

        stringBuilder.append("                {\n" +
                "                    \"OFFER_INFO\": {\n" +
                "                        \"EXPIRE_DATE\": \"20221210000000\",\n" +
                "                        \"SRC_SYSTEM_TYPE\": \"1\",\n" +
                "                        \"IS_MAIN\": \"0\",\n" +
                "                        \"OFFER_NAME\": \"飞信基础业务\",\n" +
                "                        \"DESCRIPTION\": \"\",\n" +
                "                        \"REMARKS\": \"业务下线,手工失效\",\n" +
                "                        \"MGMT_COUNTY\": \"479\",\n" +
                "                        \"ACCESS_NUM\": \"13604794032\",\n" +
                "                        \"CHA_LIST\": [\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000030\",\n" +
                "                                    \"VALUE\": \"1\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"IS_DEDUCTION_REMIND\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000035\",\n" +
                "                                    \"VALUE\": \"115\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"BUSI_TYPE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000074\",\n" +
                "                                    \"VALUE\": \"2\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"SP_TYPE\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"CHA_INFO\": {\n" +
                "                                    \"CHA_SPEC_ID\": \"219000000\",\n" +
                "                                    \"VALUE\": \"1\",\n" +
                "                                    \"CHA_SPEC_CODE\": \"IS_NEED_CONFIRM\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"CHANNEL_NAME\": \"\",\n" +
                "                        \"OFFER_INS_ID\": \"50087794923\",\n" +
                "                        \"IS_ROOT\": \"1\",\n" +
                "                        \"SUBBER_ID\": \"2081787127\",\n" +
                "                        \"SUB_CHANNEL_CODE\": \"\",\n" +
                "                        \"CUST_ID\": \"2071646865\",\n" +
                "                        \"CREATE_OP_ID\": \"\",\n" +
                "                        \"VALID_DATE\": \"20140331162026\",\n" +
                "                        \"DONE_DATE\": \"20170317005553\",\n" +
                "                        \"OFFER_ID\": \"105000663662\",\n" +
                "                        \"CREATE_DATE\": \"20140331162026\",\n" +
                "                        \"IS_BUNDLE\": \"0\",\n" +
                "                        \"BRAND\": \"1\",\n" +
                "                        \"OFFER_TYPE\": \"16\",\n" +
                "                        \"MGMT_DISTRICT\": \"479\"\n" +
                "                    }\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        \"respDesc\": \"success\",\n" +
                "        \"respCode\": \"0\"\n" +
                "    }\n" +
                "}");



        outObjPutBroads = JSON.parseObject(stringBuilder.toString(), OutputObject.class);


        Map<String,Object> objectMap = (Map<String, Object>) outObjPutBroads.getObject();

        Map<String,Object> dataMap = (Map<String, Object>) objectMap.get("result");
        Map<String,Object> infoMap = new HashMap<String,Object>();
        ArrayList<Map<String, Object>> dataList;
        if(null != dataMap) {
            Map<String, Object> offerInfoMap = new HashMap<String, Object>();
//					int resultRows = 0;
            if (MapUtil.isNotEmpty(dataMap)) {
                dataList = JSON.parseObject(dataMap.get("OFFER_INFO_LIST").toString(), new TypeReference<ArrayList<Map<String, Object>>>() {});
                if (dataList.size() > 0 && dataList != null) {
                    String nextOfferDesc = "";
                    String nextOfferName = "";
                    String nextOfferId = "";
                    Map<String, String> productInfoMap = new HashMap<>();
                    for (Map<String, Object> data : dataList) {
                        offerInfoMap = (Map<String, Object>) data.get("OFFER_INFO");
                        if (offerInfoMap.get("OFFER_TYPE") != null && StrUtil.equals("01", String.valueOf(offerInfoMap.get("OFFER_TYPE")))) {
                            //生效时间
                            String validDate = offerInfoMap.get("VALID_DATE") == null ? "0" : String.valueOf(offerInfoMap.get("VALID_DATE"));
                            //失效时间
                            String expireDate = offerInfoMap.get("EXPIRE_DATE") == null ? "0" : String.valueOf(offerInfoMap.get("EXPIRE_DATE"));
                            Date newTime = new Date();
                            DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
                            String currentDate = format.format(newTime);
                            //当前周期主商品
                            if (Long.parseLong(validDate) - Long.parseLong(currentDate) < 0 && Long.parseLong(expireDate) - Long.parseLong(currentDate) > 0) {
                                //商品ID
                                String offerId = offerInfoMap.get("OFFER_ID") == null ? "" : String.valueOf(offerInfoMap.get("OFFER_ID"));
                                infoMap.put("curOfferId", offerId);
                                infoMap.put("curOfferName", offerInfoMap.get("OFFER_NAME") == null ? "" : String.valueOf(offerInfoMap.get("OFFER_NAME")));
                                /*调用CRM_UPC_OM_OI_QRY_005 商品信息查询查询主商品描述。*/
                                //定义商品描述为空
                                log.info("查询到的当前主商品为：{}", JSON.toJSONString(infoMap));

                                //下周期主商品
                            } else if (Long.parseLong(validDate) - Long.parseLong(currentDate) > 0 && Long.parseLong(expireDate) - Long.parseLong(currentDate) > 0) {
                                // 获取已订购商品创建时间
                                String createDate = StrUtil.toString(offerInfoMap.get("CREATE_DATE"));
                                String offerId = StrUtil.toString(offerInfoMap.get("OFFER_ID"));

                                // 获取下周期商品 id
                                if (MapUtil.isEmpty(productInfoMap)) {
                                    // 保存上一个商品的创建时间以及商品id
                                    productInfoMap.put("createDate", createDate);
                                    productInfoMap.put("nextOfferId", offerId);
                                } else {
                                    // 获取上一个商品订购时间
                                    String creatDateTime = productInfoMap.get("createDate");
                                    // 如果上一个商品订购时间小于本次商品订购时间
                                    if (creatDateTime.compareTo(createDate) < 0) {
                                        productInfoMap.put("nextOfferId", offerId);
                                    }
                                }
                                log.info("获取到下周期商品id为:{}" ,JSON.toJSONString(productInfoMap));
                                nextOfferId = productInfoMap.get("nextOfferId");

                                log.info("下周期商品标识nextOfferId:{}", nextOfferId);
                                //infoMap.put("nextOfferId",nextOfferId );
                                nextOfferName = offerInfoMap.get("OFFER_NAME") == null ? "" : String.valueOf(offerInfoMap.get("OFFER_NAME"));
                            }
                        }
                    }
                }
            }
        }
    }
}
