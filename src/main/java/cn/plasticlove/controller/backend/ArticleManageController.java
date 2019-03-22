package cn.plasticlove.controller.backend;

import cn.plasticlove.commons.PageConst;
import cn.plasticlove.commons.ServerResponse;
import cn.plasticlove.dto.ArticleDto;
import cn.plasticlove.service.ArticleService;
import cn.plasticlove.utils.PageStringUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author luka-seu
 * @description 文章后台控制器
 * @create 2019/3/22-19:24
 */
@Controller
@RequestMapping(value = "/manage/article/")
public class ArticleManageController {

}
