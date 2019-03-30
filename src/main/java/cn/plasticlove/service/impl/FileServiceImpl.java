package cn.plasticlove.service.impl;

import cn.plasticlove.commons.ServerResponse;
import cn.plasticlove.service.FileService;
import cn.plasticlove.utils.FileUtils;
import cn.plasticlove.utils.PropertiesUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author luka-seu
 * @description 图片上传服务实现
 * @create 2019-03 27-00:05
 **/
@Service
public class FileServiceImpl implements FileService {
    private Logger logger = LoggerFactory.getLogger(FileServiceImpl.class);


    private String imgServer = PropertiesUtils.getProperties("img_server");

    @Override
    public ServerResponse uploadImage(MultipartFile file){
        if (file==null){
            return ServerResponse.createResponseByErrorMsg("请添加正确的图片链接");
        }
        //原始文件名
        String originalName = file.getOriginalFilename();
        //获取文件扩展名
        String fileExtendName = originalName.substring(originalName.lastIndexOf("."));
        //生成随机文件名
        String fileNewName = UUID.randomUUID().toString().replaceAll("-","")+fileExtendName;

        File targetFile = new File(fileNewName);

        logger.info("开始上传文件，上传的文件原始名:{}，新文件名:{}",originalName,fileNewName);

        try {
            file.transferTo(targetFile);
            FileUtils.upload(targetFile);
            return ServerResponse.createResponseBySuccessMsgAndData("文件上传",imgServer+fileNewName);
        } catch (IOException e) {
            logger.info("文件:{}上传失败",originalName);
            logger.error(e.getMessage());
        }
        return ServerResponse.createResponseByErrorMsg("文件上传失败");


    }

}
