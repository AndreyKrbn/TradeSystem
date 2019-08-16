import com.company.GoodServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/META-INF/spring/app-context.xml")
class GoodServiceImplTest {
//    @Resource(name="qwerty")
    @Autowired
    private GoodServiceImpl goodServiceImpl;

    @Test
    void findAll()
    {
        goodServiceImpl.findAll();
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }
}