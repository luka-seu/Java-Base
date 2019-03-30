package cn.plasticlove.service;

import cn.plasticlove.commons.ServerResponse;
import org.springframework.web.multipart.MultipartFile;

/**
 * 处理图片上传
 * @author luka-seu
 */
public interface FileService {


    /**
     * Upload image server response.
     *
     * @param file the file
     * @return the server response
     */
    public ServerResponse uploadImage(MultipartFile file);
}
