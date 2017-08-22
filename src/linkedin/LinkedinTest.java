package linkedin;

import org.junit.Before;

public abstract class LinkedinTest {
	/* Enter path to Gecko driver to enable testing via Firefox. Can be downloaded in: https://github.com/mozilla/geckodriver/releases */
	protected static final String GECKODRIVER_EXE = "C:/Users/Pavel/workspace/Selenium/bin/geckodriver.exe";
	/* URL under test*/
	protected static final String TARGET_URL = "http://www.linkedin.com";

	public LinkedinTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", GECKODRIVER_EXE);
	}

}