package cn.plasticlove.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The type Page string util.
 */
public class PageStringUtil {
    private static Logger logger = LoggerFactory.getLogger(PageStringUtil.class);

    /**
     * Page string 2 int integer.
     *
     * @param pageString the page string
     * @return the integer
     */
    public static Integer pageString2Int(String pageString){

        if (null == pageString) {
            pageString = "1";
        }
        int page = 1;
        try {
            page = Integer.parseInt(pageString);
        } catch (Exception e) {
            logger.info(e.getMessage());

        }
        if (page < 1) {
            page = 1;
        }
        return page;
    }
}
