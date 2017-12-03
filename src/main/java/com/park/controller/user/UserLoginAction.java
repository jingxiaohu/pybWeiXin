package com.park.controller.user;

import com.park.controller.BaseV1Controller;
import com.park.controller.param.BaseParam;
import com.park.controller.param.ReturnDataNew;
import com.park.util.RequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * 用户登录
 * http://blog.csdn.net/maguanghui_2012/article/details/52808139
 */
@RestController
public class UserLoginAction extends BaseV1Controller{
//    @Autowired
//    private UserBiz userBiz;
    /**
     * 获取我的基本信息
     */
    @RequestMapping(value = "/weixin_token")
    @ResponseBody
    public void Read_myinfo(HttpServletRequest request, HttpServletResponse response) {
        try {
            String signature = request.getParameter("signature");
            String timestamp = request.getParameter("timestamp");
            String nonce = request.getParameter("nonce");
            String echostr = request.getParameter("echostr");
            System.out.println("signature:" + signature);
            System.out.println("timestamp:" + timestamp);
            System.out.println("nonce:" + nonce);
            System.out.println("echostr:" + echostr);
           /* PrintWriter pw = response.getWriter();
            pw.append(echostr);
            pw.flush();*/
            sendResp(echostr,response);
        } catch (Exception e) {
            log.error("weixin token sign is fail",e);
        }
        sendResp("error", response);
    }

}
