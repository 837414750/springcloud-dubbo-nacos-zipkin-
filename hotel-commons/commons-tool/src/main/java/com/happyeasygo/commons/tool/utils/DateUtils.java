package com.happyeasygo.commons.tool.utils;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/**
 * Created by king on 2018/9/20.
 *
 * 日期处理
 */
public class DateUtils {

    /**
     * 默认时间
     */
    public static final String DEFAULT_DATE = "yyyy-MM-dd";

    public static final String DEFAULT_DATE_TIME = "yyyy-MM-dd HH:mm:ss";

    public static final String DEFAULT_DATE_TIME_MIN = "yyyy-MM-dd HH:mm";

    public static final String DEFAULT_DATE__TIME = "yyyy-MM-dd--HH:mm:ss";

    public static final String DEFAULT_TIME = "HH:mm:ss";

    public static final String COMPACT_TIME = "yyyyMMdd";

    /**
     * 印度时区
     */
    public static final String INDIA = "Asia/Kolkata";

    public static final String CHINA = "Asia/Shanghai";

    public static final ZoneId ZERO_ZONE = ZoneId.systemDefault();

    public static final ZoneId INDIA_ZONE = ZoneId.of(INDIA);

    public static final ZoneId CHINA_ZONE = ZoneId.of(CHINA);


    /**
     * 得到指定时间，指定时区的每小时时间间隔
     * @param date
     * @return
     */
    public static String getTimeInterval(Date date, ZoneId zoneId) {
        Instant instant = date.toInstant();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zoneId);
        String start = LocalTime.of(localDateTime.getHour(), 0, 0).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        String end = LocalTime.of(localDateTime.getHour(), 59, 59).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        return start + "-" + end;
    }

    /**
     * 得到时间间隔
     * @param localDateTime
     * @return
     */
    public static String getTimeInterval(LocalDateTime localDateTime) {
        String start = LocalTime.of(localDateTime.getHour(), 0, 0).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        String end = LocalTime.of(localDateTime.getHour(), 59, 59).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        return start + "-" + end;
    }


    public static String getDefaultDate() {
        return  LocalDate.now().format(DateTimeFormatter.ofPattern(DEFAULT_DATE));
    }

    /**
     * 返回指定时区当前的date
     *
     * @return
     */
    public static Date getCurrentDefaultDateTime(ZoneId zoneId) {
        String localDateTime = LocalDateTime.now(zoneId).format(DateTimeFormatter.ofPattern(DEFAULT_DATE_TIME));
        LocalDateTime dateTime = parseLocalDateTime(localDateTime);
        Date date = Date.from(dateTime.toInstant(ZoneOffset.UTC));
        return date;
    }

    /**
     * 返回指定时区当前的日期时间
     *
     * @return
     */
    public static LocalDateTime getCurrentLocalDateTime(ZoneId zoneId){
        return LocalDateTime.now(zoneId);
    }


    public static String getDefaultDateStr(LocalDateTime localDateTime) {
        return localDateTime.toLocalDate()
                .atStartOfDay()
                .atZone(ZoneId.systemDefault())
                .format(DateTimeFormatter.ofPattern(DEFAULT_DATE));
    }

    /**
     * 得到yyyy-MM-dd时间
     * @param date
     * @return
     */
    public static String getDefaultDateStr(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern(DEFAULT_DATE));
    }

    /**
     * 得到yyyy-MM-dd HH:mm:ss
     * @param date
     * @return
     */
    public static String getDefaultDateTimeStr(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern(DEFAULT_DATE_TIME));
    }

    /**
     * 解析yyyy-MM-dd
     * @param localDate
     * @return
     */
    public static LocalDate parseLocalDate(String localDate) {
        return LocalDate.parse(localDate, DateTimeFormatter.ofPattern(DEFAULT_DATE));
    }

    /**
     * 解析yyyy-MM-dd HH:mm:ss
     * @param dateTimeStr
     * @return
     */
    public static LocalDateTime parseLocalDateTime(String dateTimeStr) {
        return LocalDateTime.parse(dateTimeStr, DateTimeFormatter.ofPattern(DEFAULT_DATE_TIME));
    }

    /**
     * LocalDateTime 2 Date
     * @param dateTime
     * @return
     */
    public static Date toDate(LocalDateTime dateTime) {
        return Date.from(dateTime.toInstant(ZoneOffset.UTC));
    }

    /**
     * LocalDate 2 Date
     * @param date
     * @return
     */
    public static Date toDate(LocalDate date) {
        return Date.from(date.atStartOfDay().toInstant(ZoneOffset.UTC));
    }

    /**
     * toGTM8
     * @param date zero date
     * @return gtm8 date
     */
    public static Date toGTM8(Date date) {
        LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime gtm8 = localDateTime.plusHours(8);
        return toDate(gtm8);
    }

    /**
     * 取班加罗尔时间
     * @return
     */
    public static String getBangaloreTime(){
        return getFormatedDateString(5.5f);
    }

    /**
     * timeZoneOffset原为int类型，为班加罗尔调整成float类型
     * timeZoneOffset表示时区，如中国一般使用东八区，因此       timeZoneOffset就是8
     * @param timeZoneOffset
     * @return
     */
    public static String getFormatedDateString(float timeZoneOffset){
        if (timeZoneOffset > 13 || timeZoneOffset < -12) {
            timeZoneOffset = 0;
        }

        int newTime=(int)(timeZoneOffset * 60 * 60 * 1000);
        TimeZone timeZone;
        String[] ids = TimeZone.getAvailableIDs(newTime);
        if (ids.length == 0) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = new SimpleTimeZone(newTime, ids[0]);
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(timeZone);
        return sdf.format(new Date());
    }

    /**
     *
     * getBeforeDate:(获取当前日期（不包含当天）日期前多少天). <br/>
     * date: 2018年11月26日 下午7:08:24 <br/>
     * @param dateStr 给定日期
     * @param count 前几天
     * @return
     */
    @SuppressWarnings("static-access")
    public static String getBeforeDate(String dateStr,int count){
        SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd");
        String maxDateStr = dateStr;
        String minDateStr = "";
        Calendar calc =Calendar.getInstance();
        try {
            calc.setTime(sdf.parse(maxDateStr));
            calc.add(Calendar.DATE, count);
            Date minDate = calc.getTime();
            minDateStr = sdf.format(minDate);
            return minDateStr;
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return null;
    }

    /**
     * 获取指定日期
     * @param date
     * @param count
     * @return
     */
    public static String getBeforeDate(Date date,int count){
        SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_DATE);
        Calendar calc =Calendar.getInstance();
        calc.setTime(date);
        calc.add(calc.DATE, count);
        Date nowDate = calc.getTime();
        return sdf.format(nowDate);
    }

    public static LocalDateTime plusDay(LocalDateTime time, int days) {
        return time.plusDays(days);
    }

    public static LocalDate plusDay(LocalDate date, int days) {
        return date.plusDays(days);
    }

    public static final String START_TIME = " 18:30:00";

    public static final String END_TIME = " 18:29:59";

    /**
     * 得到昨天和前天的日期
     * @return
     */
    public static String[] yesterdayAndLaster() {
        LocalDate nowDate = LocalDate.now();
        //0时区
        LocalDate localDate1 = plusDay(nowDate, -2);
        LocalDate localDate12 = plusDay(nowDate, -1);

        LocalDate localDate2 = plusDay(nowDate, -3);
        LocalDate localDate22 = plusDay(nowDate,-2);

        String d1 = localDate1.format(DateTimeFormatter.ofPattern(DEFAULT_DATE));
        String d12 = localDate12.format(DateTimeFormatter.ofPattern(DEFAULT_DATE));
        String d2 = localDate2.format(DateTimeFormatter.ofPattern(DEFAULT_DATE));
        String d22 = localDate22.format(DateTimeFormatter.ofPattern(DEFAULT_DATE));

        String startYesterday = d1 + START_TIME;
        String endYesterday = d12 + END_TIME;

        String startLastYesterday = d2 + START_TIME;
        String endLastYesterday = d22 + END_TIME;
        return new String[]{startYesterday, endYesterday, startLastYesterday, endLastYesterday};
    }


    public static String[] weekAndLaster() {
        LocalDateTime nowDateTime = LocalDateTime.now();
        //当前星期的第几天
        int dayOfWeek = nowDateTime.getDayOfWeek().getValue();
        //不包含今天
        LocalDateTime monday = plusDay(nowDateTime, -dayOfWeek);
        //上一周的周一
        LocalDateTime startOfLastWeekMonday = monday.plusDays(-7);
        //上一周的当前天
        LocalDateTime endOfLastWeekNow   = startOfLastWeekMonday.plusDays(dayOfWeek);
        String startOfLastWeek = startOfLastWeekMonday.format(DateTimeFormatter.ofPattern(DEFAULT_DATE)) + START_TIME;
        String endOfLastWeek = endOfLastWeekNow.format(DateTimeFormatter.ofPattern(DEFAULT_DATE_TIME));

        String startOfThisWeek = monday.format(DateTimeFormatter.ofPattern(DEFAULT_DATE)) + START_TIME;
        String endOfThisWeek = nowDateTime.format(DateTimeFormatter.ofPattern(DEFAULT_DATE_TIME));
        return new String[]{startOfThisWeek, endOfThisWeek, startOfLastWeek, endOfLastWeek};
    }
    
    /**
	 * 转换字符串时间成Date
	 * @param strDate
	 * @param pattern
	 * @return
	 * @throws ParseException
	 */
	public static Date strToDate(String strDate,String pattern){
		SimpleDateFormat form = new SimpleDateFormat(pattern);
		try {
			return form.parse(strDate);
		} catch (ParseException e) {
			return null;
		}
	}
    /**
     * Date类型转字符串日期
     * @param date
     * @param pattern
     * @return
     */
    public static String dateToStr(Date date,String pattern) {
        SimpleDateFormat form = new SimpleDateFormat(pattern);
        return form.format(date);
    }

    public static String getDateTime(int typeFlag, String startTime, String endTime) {
        String time = "";
        //系统时间
        LocalDateTime today = LocalDateTime.now(ZoneId.systemDefault());
        // 印度时间
        LocalDateTime indiaLocalDateTime = LocalDateTime.ofInstant(today.toInstant(ZoneOffset.UTC), ZoneId.of("Asia/Kolkata"));

        if (typeFlag == 0) {

            LocalDateTime indiaStartDate = LocalDateTime.parse(startTime + " 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            LocalDateTime indiaEndDate = LocalDateTime.parse(endTime + " 23:59:59", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            String indiaStartDateStr = indiaStartDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            String indiaEndDateStr = indiaEndDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            //印度时间范围转成 系统时间
            LocalDateTime zeroStartDateTime = LocalDateTime.ofInstant(LocalDateTime.parse(indiaStartDateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).toInstant(ZoneOffset.ofHoursMinutes(5, 30)), ZoneId.systemDefault());
            LocalDateTime zeroEndDateTime = LocalDateTime.ofInstant(LocalDateTime.parse(indiaEndDateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).toInstant(ZoneOffset.ofHoursMinutes(5, 30)), ZoneId.systemDefault());

            time = zeroStartDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "_" + zeroEndDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        } else {
            int startDay = typeFlag;
            int endDay = -1;
            if (typeFlag == 31) {
                startDay = today.getDayOfMonth() - 1;
                endDay = today.getMonth().minLength() - today.getDayOfMonth();
            }
            //昨天 getTypeFlag() == -1
            if (typeFlag == -1) {
                startDay = 1;
                endDay = -1;
            }
            if (typeFlag == 1) {
                startDay = 0;
                endDay = 0;
            }

            LocalDateTime startIndiaLocalDateTime = indiaLocalDateTime.plusDays(-startDay);
            LocalDateTime endIndiaLocalDateTime = indiaLocalDateTime.plusDays(endDay);
            //印度时间范围
            String indiaStartDateTime = startIndiaLocalDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + " 00:00:00";
            String indiaEndDateTime = endIndiaLocalDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + " 23:59:59";

            //印度时间范围转成 系统时间
            LocalDateTime zeroStartDateTime = LocalDateTime.ofInstant(LocalDateTime.parse(indiaStartDateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).toInstant(ZoneOffset.ofHoursMinutes(5, 30)), ZoneId.systemDefault());
            LocalDateTime zeroEndDateTime = LocalDateTime.ofInstant(LocalDateTime.parse(indiaEndDateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).toInstant(ZoneOffset.ofHoursMinutes(5, 30)), ZoneId.systemDefault());

            String zeroStartDateTimeStr = zeroStartDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            String zeroEndDateTimeStr = zeroEndDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            time = zeroStartDateTimeStr + "_" + zeroEndDateTimeStr;

        }
        return time;
    }

    public static String date2ZeroStr(String date, String time, boolean isStart) {
        if (StringUtils.isNotBlank(date)) {
            LocalDate d = LocalDate.parse(date);
            if (isStart) {
                date = d.minusDays(1).format(DateTimeFormatter.ofPattern(DEFAULT_DATE));
            }
            return date + time;
        }
        return null;
    }

    public static String startTime2ZeroStr(String date) {
        return date2ZeroStr(date, START_TIME, true);
    }

    public static String endTime2ZeroStr(String date) {
	    return date2ZeroStr(date, END_TIME, false);
    }

    public static String getBeforeByHourTime(Date date, int ihour){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) - ihour);
        SimpleDateFormat df = new SimpleDateFormat(DEFAULT_DATE_TIME);
        return df.format(calendar.getTime());
    }

    public static LocalDateTime getIndiaLocalTimeDate() {
        LocalDateTime zeroTime = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        return zeroTime.plusHours(5).plusMinutes(30);
    }

    /**
     * 获取日期时间字符串
     *
     * @param temporal 需要转化的日期时间
     * @param pattern  时间格式
     * @return String 日期时间字符串，例如 2020-08-11 09:51:53
     */
    public static String format(TemporalAccessor temporal, String pattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return dateTimeFormatter.format(temporal);
    }

    public static String getLocalDateStr(LocalDate localDate,String pattern) {
        return format(localDate, pattern);
    }

    /**
     * 获取当前日期和时间字符串.
     *
     * @return String 日期时间字符串，例如 2020-08-11 09:51:53
     */
    public static String getLocalDateTimeStr(String pattern) {
        return format(LocalDateTime.now(), pattern);
    }

    /**
     * 解析yyyy-MM-dd
     * @param localDate
     * @return
     */
    public static LocalDate parseLocalDate(String localDate,String pattern) {
        return LocalDate.parse(localDate, DateTimeFormatter.ofPattern(pattern));
    }

}
