package com.zzq.o2o.util;

import com.google.code.kaptcha.Constants;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: 19788
 * Date: 2019/8/16
 * Time: 15:30
 * Description: No Description
 */
public class CodeUtil {
    public static boolean checkVerifyCode(HttpServletRequest request){
        String verifyCodeExpected = (String)request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
        String verifyCodeActural = HttpServletRequestUtil.getString(request,"VerifyCodeActual");
        if (verifyCodeActural == null || !verifyCodeActural.equals(verifyCodeExpected)){
            return false;
        }else {
            return true;
        }
    }
}
