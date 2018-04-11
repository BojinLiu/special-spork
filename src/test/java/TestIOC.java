import com.origin.liubojin.project.service.IndexService;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author liubojin
 * Created on 2018/4/11
 */
public class TestIOC extends BaseTest {

    @Resource
    private IndexService indexService;

    @Test
    public void test() {
        System.out.println(indexService.showSomething());

    }
}
