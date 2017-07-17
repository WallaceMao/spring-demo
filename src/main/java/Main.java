import com.demo.spring.ChineseSpellChecker;
import com.demo.spring.SpellChecker;
import com.demo.spring.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by  on 2017/7/15.Wallace
 */
public class Main {
    public static void main(String[] args) {
//        SpellChecker sc = new ChineseSpellChecker();
//        TextEditor te = new TextEditor(sc);
//        te.getText();

        ApplicationContext context = new ClassPathXmlApplicationContext("myBeans.xml");
        TextEditor te = (TextEditor)context.getBean("textEditor");
        te.getText();
    }
}
