package study.d.collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Set;

public class PropertiesSample {

	public static void main(String[] args) {
		PropertiesSample sample = new PropertiesSample();
		sample.saveAndLoadPropertiesXML();
	}
	public void checkProperties() {
		Properties prop = System.getProperties();
		Set<Object> keySet = prop.keySet();
		for(Object tempObject:keySet) {
			System.out.println(tempObject+" = "+prop.get(tempObject));
		}
	}
	
	//652페이지에서 Properties를 어떻게 활용하는지 확인만 해봄. (자세한건 IO 배우고 난 뒤에 하는듯)
	public void saveAndLoadProperties() {
		try {
			String fileName = "test.properties";
			File propertiesFile = new File(fileName);
			FileOutputStream fos = new FileOutputStream(propertiesFile);
			Properties prop = new Properties();
			prop.setProperty("writer",  "Sangmin, Lee");
			prop.setProperty("WriterHome", "http://www.GodOfJava.com");
			prop.store(fos, "Basic Properties file.");  //파일에 속성을 저장. 2번째 매개변수는 주석.
			fos.close();
			
			FileInputStream fis = new FileInputStream(propertiesFile);  //FileInputStream은 파일의 내용을 읽을때 쓰는 클래스.
			Properties propLoaded = new Properties();
			propLoaded.load(fis);
			fis.close();
			System.out.println(propLoaded);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	//653페이지. XML로 파일을 저장하고 읽는 예제
	public void saveAndLoadPropertiesXML() {
		try {
			String fileName = "test.xml";
			File propertiesFile = new File(fileName);
			FileOutputStream fos = new FileOutputStream(propertiesFile);
			Properties prop = new Properties();
			prop.setProperty("Writer", "Sangmin Lee");
			prop.setProperty("WriterHome", "http://www.GodOfJava.com");
			prop.storeToXML(fos, "Basic XML Property file.");
			fos.close();
			
			FileInputStream fis = new FileInputStream(propertiesFile);
			Properties propLoaded = new Properties();
			propLoaded.loadFromXML(fis);
			System.out.println(propLoaded);
			fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
