package cn.plasticlove.controller.backend;

import cn.plasticlove.commons.ServerResponse;
import cn.plasticlove.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author luka-seu
 * @description 文件上传后端控制器
 * @create 2019/3/31-21:59
 */
@Controller
@RequestMapping(value = "/manage/file/")
public class FileManageController {

    @Autowired
    private FileService fileService;

    @RequestMapping(value = "image")
    @ResponseBody
    public ServerResponse uploadImage(MultipartFile image){

        return fileService.uploadImage(image);
    }
}
