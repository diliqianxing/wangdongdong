import com.test.mapper.UserMapper;
import com.test.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import java.util.logging.Logger;
//@RunWith(SpringJUnit4ClassRunner.class),让测试运行于Spring测试环境
@RunWith(SpringJUnit4ClassRunner.class)
//整合JUnit4测试时，使用注解引入单个配置文件
@ContextConfiguration(locations = "classpath:application.xml")
public class TestMybatis {
    Logger log = Logger.getLogger("TestMybatis");
    @Resource//用来实现依赖注入的
    private UserMapper UserMapper;
    //表示这个方法是JUnit测试时候会运行的,引入junit.jar包，然后import org.junit.Test; 程序就不会报错
    @Test
    public void testDeleteUserById(){
        UserMapper.deleteUserById(9);
    }
    @Test
    public void testSaveUser(){
        User User = new User();
        User.setName("ali");
        User.setDept("EEEEE");
        UserMapper.saveUser(User);
    }
    @Test
    public void testUpdateUser(){
        User User = new User();
        User.setName("djiang");
        User.setDept("FFFF");
        User.setId(10);
        UserMapper.updateUser(User);
    }
    @Test
    public void testFindUserById(){
        User user = UserMapper.findUserById(11);
        System.out.println(user);
        System.out.println("User Id: " + user.getId());
        System.out.println("User Name: " + user.getName());System.out.println("User Dept: " + user.getDept());
    }
}