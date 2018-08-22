package com.xqc.contreller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xqc.entity.Blogger;
import com.xqc.util.CryptographyUtil;

/**
 * 博主控制层
 * @author A Cang（xqc）
 *
 */
@Controller
@RequestMapping("/blogger")
public class BloggerController {

	/**
	 * 用户登陆
	 * @param blogger
	 * @param request
	 * @return
	 */
    public String login(Blogger blogger,HttpServletRequest request){
    	
    	/**
    	 * 使用Shiro进行登陆身份验证
    	 */
    	Subject subject=SecurityUtils.getSubject();
    	UsernamePasswordToken token=new UsernamePasswordToken(blogger.getUserName(), CryptographyUtil.md5(blogger.getPassword(), "xqc"));
    	try{
        	subject.login(token);
        	return "redirect:/admin/main.jsp";
    	}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("blogger", blogger);
			request.setAttribute("errorInfo", "用户名或密码错误！");
			return "login";
    	}

    	
    }
	
	
	
	
	

}
