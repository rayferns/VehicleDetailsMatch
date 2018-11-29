package test.java;

//import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.io.InputStream;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.junit.Test;
import org.xml.sax.SAXException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class TestRunner {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


    @Test
    public void whenUsingParser_thenMetadataIsReturned() throws IOException, TikaException, SAXException {
        InputStream stream = this.getClass().getClassLoader().getResourceAsStream("src\\test\\resourcesAudi.xlsx");
        Metadata metadata = TikaAnalysis.extractMetadatatUsingParser(stream);

        //assertEquals("org.apache.tika.parser.DefaultParser", metadata.get("X-Parsed-By"));
       // assertEquals("Microsoft Office User", metadata.get("Author"));
        assertEquals("file size", metadata.size());
        

        stream.close();
    }


}
