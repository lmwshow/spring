import com.springmvc4.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by Gracecoder on 2017/6/22.
 */


public class UserTest {

//    @Autowired
    private User user;

//    @Test
//    public void test()
//    {
//
//        String resource = "/WEB-INF/MyBatisConfig.xml";
//        Reader reader = null;
//        SqlSession session;
//        try {
//            reader = Resources.getResourceAsReader(resource);
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//        SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder()
//                .build(reader);
//        session = sqlMapper.openSession();
//
//
//        user = (User)session.selectOne("findById", Integer.valueOf(1));
//        System.out.println(user.getUsername());
//        session.close();
//
//    }

    public static void main(String[] args){
        String resource = "/com/springmvc4/map/MyBatisConfig.xml";
        Reader reader = null;
        SqlSession session;
        try {
            reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder()
                .build(reader);
        session = sqlMapper.openSession();


        User user = (User)session.selectOne("findById", Integer.valueOf(1));
        System.out.println(user.getUsername());
        session.close();


    }
}
