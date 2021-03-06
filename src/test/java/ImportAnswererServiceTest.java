import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.wx.weixiao.service.CheckAnswererService;
import org.wx.weixiao.service.ImportAnswererService;
import org.wx.weixiao.service.impl.ImportAnswererImpl;

/**
 * Created by lizhimu on 2016/12/28.
 */
@Component("CheckAnswerService")
public class ImportAnswererServiceTest {
    private ImportAnswererService service;
    @Before
    public void setUp(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        this.service=(ImportAnswererService) context.getBean("ImportAnswererService");

    }
    @Test
    public void test() {

        service.importAnswererInfo("D:/excelTest/excel/副本.xlsx");
    }
}
