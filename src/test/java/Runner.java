import org.testng.TestNG;
import org.testng.xml.Parser;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        TestNG testNG = new TestNG();
        testNG.setUseDefaultListeners(false);
        new Parser("C:\\HybrisGitEpam\\SeleniumTask3\\src\\test\\testng_xmls\\testng.xml").parseToList().forEach(testNG::setCommandLineSuite);
        testNG.run();
    }
}
