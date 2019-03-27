package cn.plasticlove.utils;


import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.apache.commons.net.ftp.FTPClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author luka-seu
 * @description 文件上传工具类
 * @create 2019-03 27-23:42
 **/

public class FileUtils {

    private static Logger logger = LoggerFactory.getLogger(FileUtils.class);

    private static String ftpServer = PropertiesUtils.getProperties("ftpserver");
    private static String ftpUser = PropertiesUtils.getProperties("ftpuser");
    private static String ftpPasswd = PropertiesUtils.getProperties("ftppasswd");

    private static FTPClient client = new FTPClient();


    private static boolean connectService() {
        boolean login = false;
        try {
            logger.info("开始连接ftp服务器");
            client.connect(ftpServer);
            login = client.login(ftpUser, ftpPasswd);

        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return login;
    }


    public static boolean upload(String remotePath, List<File> fileList) throws IOException {
        boolean isUpload = false;
        InputStream is = null;

        if (connectService()) {
            try {
                client.changeWorkingDirectory(remotePath);
                client.setBufferSize(1024);
                client.setControlEncoding("UTF-8");
                client.setFileType(FTPClient.BINARY_FILE_TYPE);
//                client.enterLocalPassiveMode();
                for (File file : fileList) {
                    is = new FileInputStream(file);
                    client.storeFile(file.getName(), is);
                }
                isUpload = true;
            } catch (IOException e) {
                logger.error("文件上传异常");
                logger.error(e.getMessage());
            } finally {
                client.disconnect();
                is.close();
            }
        }
        return isUpload;
    }
}
