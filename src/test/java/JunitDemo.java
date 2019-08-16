import com.qf.service.*;
import com.qf.vo.CommentVO;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by DELL on 2019/7/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)//junit整合spring的测试//立马开启了spring的注解
@ContextConfiguration(locations={"classpath:spring-mybatis.xml","classpath:spring-service.xml"})//加载核心配置文件，自动构建spring容器
public class JunitDemo {

//    @Autowired
//    UserInfoService userInfoService;
    @Autowired
    RoleInfoService roleInfoService;
    @Autowired
    MenuInfoService menuInfoService;
    @Autowired
    CommentService commentService;
    @Autowired
    ReplyService replyService;

    @Test
    public void listAllComment(){
        List<CommentVO> commentInfos = commentService.allComment();
        System.out.println(commentInfos);
    }
//    @Test
//    public void getReplyByComId(){
//        List<ReplyVO> replyByComId = replyService.getReplyByComId(1);
//        System.out.println(replyByComId);
//    }

//    @Ignore
//    @Before
//    public void initApplicationContext(){
//        System.out.println("aaa");
//        //加载spring容器，初始化其中对象
////        context = new ClassPathXmlApplicationContext("spring-mybatis.xml","spring-service.xml");
//    }

//    @After
//    public void destoryApplicationContext(){
//        context = null;
//    }

//    @Test
//    @Ignore
//    public void sayHello() throws Exception {
//        System.out.println("helloWorld");
//        throw new Exception("人为制造异常");
//    }

//    @Test
//    @Ignore
//    public void loginCheckTest(){
//        UserInfo userInfo = new UserInfo();
//        userInfo.setUsername("王涛");
//        userInfo.setPassword("123456");
//        boolean b = userInfoService.loginCheck(userInfo);
//
////        Assert.assertEquals(b,true);
//        System.out.println(b);
//    }
//    @Test
//    public void listAllUserInfoTest(){
//        List<UserInfo> userInfos = userInfoService.getAllUserInfo(null);
//        System.out.println(userInfos);
//    }
//
//    @Test
//    public void listRoleByUserId(){
//        List<RoleInfoVO> roleInfoVOs = roleInfoService.listRoleByUserId(1);
//        System.out.println(roleInfoVOs);
//    }
//
//    @Test
//    public void listMenuByRoleId(){
//        List<MenuInfoVO> menuInfoVOS = menuInfoService.listMenuByRoleId(1);
//        System.out.println(menuInfoVOS);
//    }
}
