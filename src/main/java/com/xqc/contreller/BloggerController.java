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
 * �������Ʋ�
 * @author A Cang��xqc��
 *
 */
@Controller
@RequestMapping("/blogger")
public class BloggerController {

	/**
	 * �û���½
	 * @param blogger
	 * @param request
	 * @return
	 */
    public String login(Blogger blogger,HttpServletRequest request){
    	
    	/**
    	 * ʹ��Shiro���е�½�����֤
    	 */
    	Subject subject=SecurityUtils.getSubject();
    	UsernamePasswordToken token=new UsernamePasswordToken(blogger.getUserName(), CryptographyUtil.md5(blogger.getPassword(), "xqc"));
    	try{
        	subject.login(token);
        	return "redirect:/admin/main.jsp";
    	}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("blogger", blogger);
			request.setAttribute("errorInfo", "�û������������");
			return "login";
    	}

    	
    }
	
	
	
	
	

}
