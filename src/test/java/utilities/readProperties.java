package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readProperties {

  static Properties prob = new Properties();

  public static String getValue(String key){

      try{

          String FilePath = System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties";
          FileInputStream fis = new FileInputStream(FilePath);
          prob.load(fis);
      } catch (Exception e) {
          throw new RuntimeException(e);
      }

      return prob.getProperty(key);
  }
}
