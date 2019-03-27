package cn.plasticlove.utils;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Properties;

/**
 * @author luka-seu
 * @description 读取properties配置文件工具类
 * @create 2019-03 27-23:52
 **/

public class PropertiesUtils {
   private static Logger logger = LoggerFactory.getLogger(PropertiesUtils.class);

   private static Properties props = new Properties();

    /**
     * 加载配置文件
     * @param propertyFile
     */
   private static void loadFile(File propertyFile){
       try {
           props.load(PropertiesUtils.class.getClassLoader().getResourceAsStream(propertyFile.getName()));
       }catch (Exception e) {
           logger.error(e.getMessage());
       }
   }

    /**
     * 获取属性
     * @param key
     * @return
     */
   public static String getProperties(String key){
       File file = new File("blog.properties");
       loadFile(file);
       String value = props.getProperty(key.trim());
       if (StringUtils.isBlank(value)){
           return null;
       }
       return value;
   }
}
