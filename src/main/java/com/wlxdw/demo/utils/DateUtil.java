package com.wlxdw.demo.utils;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @auther: yuzx
 * @date: 2021/2/24 15:33
 * @description: 时间工具类
 */
@Slf4j
public class DateUtil {

    public static final String DATEFORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * 时间转换为字符串
     * @param date
     * @return
     */
    public static String format(Date date){
        return new SimpleDateFormat(DATEFORMAT).format(date);
    }

    /**
     * 时间转换为指定格式字符串
     * @param date
     * @return
     */
    public static String format(String pattern, Date date){
        return new SimpleDateFormat(pattern).format(date);
    }

}
