package cn.plasticlove.test;

import cn.plasticlove.utils.FileUtils;
import com.google.common.collect.Lists;
import org.junit.Test;


import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author luka-seu
 * @description ftp工具类测试
 * @create 2019-03 28-00:12
 **/

public class FtpTest {


    @Test
    public void test() throws IOException {
        File file = new File("F:\\luka_blog\\src\\main\\webapp\\images\\handshake.png");
        List<File> files = Lists.newArrayList();
        files.add(file);
        String remote = "imgs";
        boolean upload = FileUtils.upload(remote, files);
        System.out.println(upload);
    }
}
