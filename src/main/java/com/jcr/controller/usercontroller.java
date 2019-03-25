package com.jcr.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * @author JCR
 * @date 2019/3/22 0022 -17:23
 */
public class usercontroller {
    private static final String KEY = "abc123"; // KEY为自定义秘钥

   /* @RequestMapping(value = "/sendMsg", method = RequestMethod.POST, headers = "Accept=application/json")
    public Map<String, Object> sendMsg(@RequestBody Map<String,Object> requestMap) {
        String phoneNumber = requestMap.get("phoneNumber").toString();
        String randomNum = CommonUtils.createRandomNum(6);// 生成随机数
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MINUTE, 5);
        String currentTime = sf.format(c.getTime());// 生成5分钟后时间，用户校验是否过期
        sengMsg(); //此处执行发送短信验证码方法
        String hash =  MD5Utils.getMD5Code(KEY + "@" + currentTime + "@" + randomNum);//生成MD5值
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("hash", hash);
        resultMap.put("tamp", currentTime);
        return resultMap; //将hash值和tamp时间返回给前端
    }*/

//    @RequestMapping(value = "/validateNum", method = RequestMethod.POST, headers = "Accept=application/json")
//    public Map<String, Object> validateNum(@RequestBody Map<String,Object> requestMap) {
//        String requestHash = requestMap.get("hash").toString();
//        String tamp = requestMap.get("tamp").toString();
//        String msgNum = requestMap.get("msgNum").toString();
//        String hash = MD5Utils.getMD5Code(KEY + "@" + tamp + "@" + msgNum);
//        if (tamp.compareTo(currentTime) > 0) {
//            if (hash.equalsIgnoreCase(requestHash)){
//                //校验成功
//            }else {
//                //验证码不正确，校验失败
//            }
//        } else {
//            // 超时
//        }
//    }

}
