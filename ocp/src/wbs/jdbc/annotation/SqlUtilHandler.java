package wbs.jdbc.annotation;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SqlUtilHandler extends DefaultHandler {

	private SQLUtilConfig config = new SQLUtilConfig();

	public SQLUtilConfig getSqlUtilConfig() {
		return config;
	}

	private void handleConnection(Attributes attributes) {
		config.setDriver(attributes.getValue("driver"));
		config.setUrl(attributes.getValue("url"));
		config.setUser(attributes.getValue("user"));
		config.setPassword(attributes.getValue("password"));
	}
	
	private void handleTable(Attributes attributes) {
		
	}

	@Override
	public void startElement(String uri, String localName, String qName, org.xml.sax.Attributes attributes)
			throws SAXException {
		switch (qName) {
		case "connection":
			handleConnection(attributes);
			break;
		case "tableMapping":
			handleTable(attributes);
			break;
		case "typeMapping":
			System.out.println("in Type");
			break;
		}
		//
		System.out.println();
	}

}
