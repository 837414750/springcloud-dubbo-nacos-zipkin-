package com.happyeasygo.channel.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class CmDataFrequencyAspect {

//    @Autowired
//    private JedisUtils jedisUtils;
//
//    //使用注解切点
//    @Pointcut("@annotation(print)")
//    public void annotationPointcuts(CmDataFrequency print){}
//
//    @Around("annotationPointcuts(print)")
//    public Object around(ProceedingJoinPoint pjp, CmDataFrequency print) throws Throwable {
//        Object result = pjp.proceed();
//        String provider = print.provider();
//        String type = print.type();
//        if(StringUtils.isEmpty(provider)){
//            //获取请求的参数
//            try{
//                Object[] args = pjp.getArgs();
//                //fastjson转换
//                String params = JSONObject.toJSONString(args);
//
//                JsonArray asJsonArray = JsonParser.parseString(params).getAsJsonArray();
//                JsonObject paramObj = asJsonArray.get(0).getAsJsonObject();
//                provider = paramObj.get("data").getAsJsonObject().get("ota").getAsString();
//            }catch (Exception e){
//                log.error("{}",e);
//            }
//        }
//        log.info("provider：{},数据埋点",provider);
//        Map<String,String> map = new HashMap<>();
//        map.put("provider",provider);
//        map.put("type",type);
//        map.put("date", DateUtils.dateToStr(new Date(),DateUtils.DEFAULT_DATE_TIME_MIN));
//        String key = CmSyncCountKey.CM_SYNC_COUNT + DateUtils.getBeforeDate(new Date(),0);
//        Long incr = jedisUtils.lpush(key, GsonTool.toJson(map));
//        if(incr == 1){
//            jedisUtils.expire(key,86400);//ttl过期时间是一天
//        }
//        return result;
//    }
}