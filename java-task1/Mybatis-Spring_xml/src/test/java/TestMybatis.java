import com.test.mapper.UserMapper;
import com.test.pojo.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMybatis {
    private static final Log log = LogFactory.getLog(TestMybatis.class);
    private ApplicationContext applicationContext;
//    private User user;

    @Before
    public void init(){
        applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
    }
    @Test
    public void testDeleteUserById(){
        UserMapper UserMapper = applicationContext.getBean(UserMapper.class);
        UserMapper.deleteUserById(2);
    }
    @Test
    public void testSaveUser(){
        UserMapper UserMapper = applicationContext.getBean(UserMapper.class);
        User User = new User();
        User.setName("ali");
        User.setDept("EEEEE");
        UserMapper.saveUser(User);
    }
    @Test
    public void testUpdateUser(){
        UserMapper UserMapper = applicationContext.getBean(UserMapper.class);
        User User = new User();
        User.setName("3333333");
        User.setDept("FFFF");
        User.setId(3);
        UserMapper.updateUser(User);
    }
    @Test
    public void testFindUserById(){
        UserMapper UserMapper = applicationContext.getBean(UserMapper.class);
        User user = UserMapper.findUserById(4);
        log.info(user);
        log.info("User Id: " + user.getId());
        log.info("User Name: " + user.getName());System.out.println("User Dept: " + user.getDept());
    }
}