//package com.qf.filter;
//
//import com.qf.pojo.UserInfo;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//public class UserFilter implements HandlerInterceptor {
//
//    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
//
//      HttpSession session=httpServletRequest.getSession();
//        UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
//        if (userInfo==null){
//            StringBuffer requestURL = httpServletRequest.getRequestURL();
//            if (requestURL.equals("/loginCheck")||requestURL.equals("/registerUserInfo")||requestURL.equals("/login.html")||requestURL.equals("/reg.html")) {
//
//                return true;
//            }else {
//                    httpServletRequest.getRequestDispatcher("login.html").forward(httpServletRequest,httpServletResponse);
//                return  false;
//            }
//      }
//        return true;
//    }
//
//    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
//
//    }
//
//    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
//
//    }
//}
