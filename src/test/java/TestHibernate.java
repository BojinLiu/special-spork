import com.origin.liubojin.project.dao.UserDao;
import com.origin.liubojin.project.dao.UserDaoImpl;
import com.origin.liubojin.project.entity.UserEntity;

/**
 * @author liubojin
 * Created on 2018/4/11
 */
public class TestHibernate {


    public static void main(String[] args) {
        UserEntity user=new UserEntity();
        UserDao dao = new UserDaoImpl();

//		user.setName("123");
//		user.setPassword("123");
//		dao.save(user);

        user= dao.findUserById(1);
        System.out.println("所查询ID的姓名是"+user.getName());

    }

}
