package com.anzhi.utilsdemo.testdemo;

import com.alibaba.fastjson.JSON;
import com.anzhi.utilsdemo.testdemo.dto.UserDto;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class MapStreamDemo {
    public static void main(String[] args) {
        List<UserDto> userDtoList = new ArrayList<>();
        for (int i=0; i<5; i++) {
            UserDto userDto = new UserDto();
            userDto.setName("123");
            userDto.setMoney(String.valueOf(i));
            userDtoList.add(userDto);
        }

        for (int i=0; i<5; i++) {
            UserDto userDto = new UserDto();
            userDto.setName("1234");
            userDto.setMoney(String.valueOf(i));
            userDtoList.add(userDto);
        }

        for (int i=0; i<5; i++) {
            UserDto userDto = new UserDto();
            userDto.setName("1235");
            userDto.setMoney(String.valueOf(i));
            userDtoList.add(userDto);
        }

        Map<String, List<UserDto>> collect = userDtoList.stream().collect(Collectors.groupingBy(UserDto::getName));
        log.info("------------------ {}", JSON.toJSONString(collect));
    }
}
